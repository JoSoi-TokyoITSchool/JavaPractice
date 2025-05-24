package jp.co.sss.practice.p06.q03.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jp.co.sss.practice.p06.bean.FruitsSeasonBean;
import jp.co.sss.practice.p06.entity.FruitsSeason;
import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

@Controller
public class Practice0603Controller {
	@Autowired
	FruitsSeasonRepository repository;

	@GetMapping("/fruits/list/sort/id")
	public String sortId(Model model) {
		model.addAttribute("fruits", repository.findAllByOrderByFruitIdAsc());
		return "practice06/03/fruits_list";
	}

	@GetMapping("/fruits/detail/{fruitId}")
	public String detail(@PathVariable Integer fruitId, Model model) {
		FruitsSeason fruit = repository.getReferenceById(fruitId);
		FruitsSeasonBean fruitSeasonBean = new FruitsSeasonBean();
		BeanUtils.copyProperties(fruit, fruitSeasonBean);
		model.addAttribute("fruit", fruitSeasonBean);
		return "practice06/03/fruit_detail";
	}

}
