package jp.co.sss.practice.p03.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0301Controller {

	@RequestMapping("/first")
	public String p3_1() {
		return "practice03/01/before_redirect";
	}

	@RequestMapping("/second")
	public String p3_2() {
		return "redirect:/third";
	}

	@RequestMapping("/third")
	public String p3_3() {
		return "practice03/01/after_redirect";
	}

}
