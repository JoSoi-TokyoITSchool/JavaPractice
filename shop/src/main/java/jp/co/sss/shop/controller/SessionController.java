package jp.co.sss.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.shop.form.LoginForm;

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

}
