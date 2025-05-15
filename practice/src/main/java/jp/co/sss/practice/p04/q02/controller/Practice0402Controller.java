package jp.co.sss.practice.p04.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.practice.p04.q02.form.FavoriteForm;

@Controller
public class Practice0402Controller {

	@RequestMapping("/favorite/input")
	public String p4_01() {
		//入力画面を表示するためのメソッド
		return "practice04/02/favorite_input";
	}

	@RequestMapping("/favorite/result")
	public String p4_01(FavoriteForm favoriteForm, Model model) {
		System.out.println("パラメータを受け取りました");
		System.out.println("果物 :" + favoriteForm.getFruit());
		System.out.println("スナック :" + favoriteForm.getSnack());
		System.out.println("スイーツ :" + favoriteForm.getSweet());
		System.out.println("おかず :" + favoriteForm.getSidedish());
		return "practice04/02/favorite_result";
	}

}
