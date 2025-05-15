package jp.co.sss.practice.p05.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.sss.practice.p05.q01.form.BmiForm;

@Controller
public class Practice0501Controller {

	@GetMapping("/bmi/input")
	public String p5_01() {
		return "practice05/01/bmi_input";
	}

	@PostMapping("/bmi/result")
	public String bmi(BmiForm bmiForm, Model model) {
		//BMI=体重(kg)÷(身長(cm)/100)2 

		return "practice05/01/bmi_result";
	}

}
