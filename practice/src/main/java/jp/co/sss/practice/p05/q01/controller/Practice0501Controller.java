package jp.co.sss.practice.p05.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.sss.practice.p05.q01.form.BmiForm;

@Controller
public class Practice0501Controller {

	@GetMapping("/bmi/input")
	public String bmiInput() {
		return "practice05/01/bmi_input";
	}

	@PostMapping("/bmi/result")
	public String bmiResult(BmiForm bmiForm, Model model) {
		double heightInMeter = bmiForm.getHeight() / 100.0;
		double bmi = bmiForm.getWeight() / (heightInMeter * heightInMeter);
		bmiForm.setBmi(bmi);
		model.addAttribute("bmiForm", bmiForm);
		return "practice05/01/bmi_result";
	}

}
