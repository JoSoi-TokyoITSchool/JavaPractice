package jp.co.sss.practice.p06.q02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

@Controller
public class Practice0602Controller {
	@Autowired
	FruitsSeasonRepository repository;

	@GetMapping("/fruits/list/sort/season")
	public String fruitList() {

		return "practice06/02/fruits_list";
	}

}
