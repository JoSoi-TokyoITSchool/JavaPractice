package jp.co.sss.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import jp.co.sss.shop.form.LoginForm;
import jp.co.sss.shop.form.LoginFormWithValidation;

@Controller
public class SessionController {

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String Login() {
		return "session/login";
	}

	//@RequestMapping(path = "/doLogin", method = RequestMethod.GET)
	@GetMapping("/doLogin")
	public String doLoginGet(Integer userId, String password) {
		//パラメータ(変数名)がinputタグのnameと一致する必要がある
		System.out.println("ユーザーID:" + userId);
		System.out.println("パスワード:" + password);
		return "session/login";
	}

	//	@PostMapping("/doLogin")
	//	public String doLoginPost(Integer userId, String password) {
	//		System.out.println("ユーザーID:" + userId);
	//		System.out.println("パスワード:" + password);
	//		return "session/login";
	//	}

	@PostMapping("/doLogin")
	public String doLoginPost(LoginForm form) {
		System.out.println("ユーザーID:" + form.getUserId());
		System.out.println("パスワード:" + form.getPassword());
		return "session/login";
	}

	@RequestMapping(path = "/logOnRequest", method = RequestMethod.GET)
	public String loginOnRequest() {
		return "session/login_on_request";
	}

	//loginボタンを押した時に呼び出されるメソッド
	// Model の実装クラスのオブジェクト(以下、Model オ ブジェクト)が生成され、引数に格納
	@RequestMapping(path = "/doLoginOnRequest", method = RequestMethod.POST)
	public String doLoginOnRequset(LoginForm form, Model model) {
		model.addAttribute("userId", form.getUserId());
		//model.addAttribute("password", form.getPassword());
		return "session/login_on_request";
	}

	//	@RequestMapping(path = "/loginOnSession", method = RequestMethod.GET)
	//	public String loginOnSession() {
	//		return "session/login_on_session";
	//	}

	//現在ユーザーがログインしている状態かを確認
	@RequestMapping(path = "/loginOnSession", method = RequestMethod.GET)
	public String loginOnSession(Model model, HttpServletRequest request) {
		// HttpServletRequest オブジェクトを使ってセッションを取得
		HttpSession session = request.getSession(true);
		// セッションから値を取得
		Integer userId = (Integer) session.getAttribute("userId");
		if (userId != null) {
			return "redirect:/";
		} else {
			return "session/login_on_session";
		}
	}

	@RequestMapping(path = "/doLoginOnSession", method = RequestMethod.POST)
	public String doLoginOnSession(LoginForm form, HttpSession session) {
		if (form.getUserId() == 123) {
			//入力したユーザーIDをセッション属性userIdとしてセッションスコープに保存
			session.setAttribute("userId", form.getUserId());
			return "redirect:/";
		} else {
			return "session/login_on_session";
		}
	}

	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		//セッションの破棄  
		session.invalidate();
		return "redirect:/";
	}

	@RequestMapping(path = "/loginWithValidation", method = RequestMethod.GET)
	public String loginWithValidation(@ModelAttribute LoginFormWithValidation form) {
		return "session/login_with_validation";
	}

	@RequestMapping(path = "loginWithValidation", method = RequestMethod.POST)
	public String doLoginWithValidation(
			@Valid @ModelAttribute LoginFormWithValidation form,
			BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "session/login_with_validation";
		}
		if (form.getUserId() == 123) {
			session.setAttribute("userId", form.getUserId());
			return "redirect:/";
		} else {
			return "session/login_with_validation";
		}
	}
}
