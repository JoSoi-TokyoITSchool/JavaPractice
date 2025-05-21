package jp.co.sss.shop.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
//필터를 만들 건데, 그 필터는 로그인을 확인하는 역할을 하도록 내가 직접(Custom) 구현한 필터야
public class LoginCheckFilter extends HttpFilter {
	@Override
	public void doFilter(
			HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// リクエストURLを取得 
		String requestURL = request.getRequestURI();
		if (requestURL.endsWith("/loginWithValidation")) {
			//リクエスト URL が「ログイン画面への遷移処理」、  
			//「ログイン処理」宛ての場合、ログインチェックを実施せず、  
			//リクエスト対象のコントローラの処理に移る  
			//이 필터의 역할이 끝났으니, 이제 다음 필터로 넘어가  
			//마지막 필터까지 다 호출되면 컨트롤러의 요청 처리 로직으로 이동
			chain.doFilter(request, response);
		} else {
			//セッション情報を取得  
			HttpSession session = request.getSession();

			//セッション情報からユーザのログイン情報(セッション属性 userId)を取得  
			Integer userId = (Integer) session.getAttribute("userId");

			if (userId == null) {
				//ログイン情報が存在しない場合（ログイン情報(userId) が null の場合）、  
				//ログイン画面にリダイレクトする  
				response.sendRedirect("/shop/loginWithValidation");
				return;
			} else {
				chain.doFilter(request, response);
			}
		}
	}
}
