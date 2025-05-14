package jp.co.sss.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping(path = "/")
	public String Index() { //メソッド名は何でもいい
		return "index"; //index.htmlを表示する
	}

	@RequestMapping(path = "/detail")
	public String detail() {
		System.out.println("詳細ページを表示します。");
		return "detail";
	}

	@RequestMapping("/before") //コンテキストパス以後
	public String before() {
		return "before";
	}

	@RequestMapping("after")
	public String after() {
		return "after";
	}

	@RequestMapping("/transition")
	public String sampleTransition() {
		return "sampleTransition";
	}

	@RequestMapping("/index_f")
	public String indexForward() {
		return "index";
	}

	@RequestMapping("/index_r")
	public String indexRedirect() {
		return "redirect:/";
	}

}
