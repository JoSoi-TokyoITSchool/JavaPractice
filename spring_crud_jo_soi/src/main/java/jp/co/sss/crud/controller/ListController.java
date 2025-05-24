package jp.co.sss.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.crud.repository.EmployeeRepository;

@Controller
public class ListController {

	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("lists", employeeRepository.findAll());
		model.addAttribute("lists", employeeRepository.findAllWithDepartment());
		return "list/list";
	}

}