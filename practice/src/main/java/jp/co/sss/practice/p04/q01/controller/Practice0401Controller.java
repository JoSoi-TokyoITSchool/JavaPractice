package jp.co.sss.practice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Practice0401Controller {

	@GetMapping("/input")
	public String p4_1() {
		return "practice04/01/input_form";
	}

	@GetMapping("/send/get_method")
	public String p4_2(String color) {
		System.out.println("GETメソッドで受け取りました。");
		System.out.println("パラメータの値:" + color);
		return "practice04/01/get_result";
	}

	@PostMapping("/send/post_method")
	public String p4_3(String color) {
		System.out.println("POSTメソッドで受け取りました。");
		System.out.println("パラメータの値:" + color);
		return "practice04/01/post_result";
	}

}
