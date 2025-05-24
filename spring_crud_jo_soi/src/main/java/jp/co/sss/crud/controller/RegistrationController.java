package jp.co.sss.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

	@GetMapping("/regist/input")
	public String registInput() {
		return "regist/regist_input";
	}
}
