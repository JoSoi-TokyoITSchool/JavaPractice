package jp.co.sss.practice.p06.q04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

@Controller
public class Practice0604Controller {
	@Autowired
	FruitsSeasonRepository repository;

	@GetMapping("/fruits/search/input")
	public String input() {
		return "practice06/04/fruits_select_season";
	}

	@GetMapping("/fruits/search/result")
	public String result(Integer season, Model model) {
		if (season >= 1 && season <= 12) {
			model.addAttribute("items", season);
		} else if (season == 13) {

		}
		{

		}
		return "practice06/04/fruits_list";
	}
}
