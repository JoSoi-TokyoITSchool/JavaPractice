package jp.co.sss.practice.p03.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class Practice0302Controller {

	@RequestMapping("/show/redirect_page")
	public String p3_1() {
		return "practice03/02/redirect_link";
	}

	@RequestMapping("/absolute")
	public String p3_2() {
		return "redirect:https://www.google.co.jp";
	}

	@RequestMapping("/relative")
	public String p3_3() {
		return "redirect:/result";
	}

	@RequestMapping("/result")
	public String p3_4() {
		return "practice03/02/redirect_result";
	}

}
