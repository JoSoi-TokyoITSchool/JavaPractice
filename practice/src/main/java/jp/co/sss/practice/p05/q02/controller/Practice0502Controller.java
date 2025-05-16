package jp.co.sss.practice.p05.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0502Controller {

	@GetMapping("/numguess/start")
	public String start(HttpSession session) {
		Integer hitNumberInteger = (int) (Math.floor(Math.random() * 9) + 1);
		session.setAttribute("hitNum", hitNumberInteger);
		return "practice05/02/numguess_start";
	}

	@GetMapping("/numguess/input")
	public String input() {
		return "practice05/02/numguess_input";
	}

	@GetMapping("/numguess/judge")
	public String judge(HttpSession session, Integer inputNum) {
		if (inputNum == session.getAttribute("hitNum")) {
			return "redirect:/numguess/hit";
		} else {
			return "practice05/02/numguess_judge";
		}
	}

	@GetMapping("/numguess/hit")
	public String judge(Model model, HttpSession session) {
		return "practice05/02/numguess_end";
	}

}
