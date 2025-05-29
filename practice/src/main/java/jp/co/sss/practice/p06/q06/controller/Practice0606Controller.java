package jp.co.sss.practice.p06.q06.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.sss.practice.p06.bean.FruitsSeasonBean;
import jp.co.sss.practice.p06.entity.FruitsSeason;
import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

@Controller
public class Practice0606Controller {
	@Autowired
	FruitsSeasonRepository repository;

	@GetMapping("/fruits/update")
	public String update(Model model) {
		model.addAttribute("fruits", repository.findAll());
		return "practice06/06/fruit_select";
	}

	@PostMapping("/fruits/update/input")
	public String updateInput(Integer fruitId, Model model) {
		FruitsSeason fruitsSeason = new FruitsSeason();
		fruitsSeason = repository.getReferenceById(fruitId);
		FruitsSeasonBean fruitsBean = new FruitsSeasonBean();
		BeanUtils.copyProperties(fruitsSeason, fruitsBean);
		model.addAttribute(fruitsBean);

		return "practice06/06/fruit_input";
	}

}
