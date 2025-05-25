package jp.co.sss.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import jp.co.sss.crud.bean.EmployeeBean;
import jp.co.sss.crud.entity.Employee;
import jp.co.sss.crud.form.LoginForm;
import jp.co.sss.crud.repository.EmployeeRepository;

@Controller
public class IndexController {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	HttpSession session;

	@GetMapping("/")
	public String index(@ModelAttribute LoginForm loginForm) {
		session.invalidate();
		return "index";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute LoginForm loginForm, HttpSession session, Model model) {
		int empId = loginForm.getEmpId();
		String empPass = loginForm.getEmpPass();
		Employee employee = employeeRepository.findByEmpIdAndEmpPass(empId, empPass);

		if (employee != null) {
			EmployeeBean employeeBean = new EmployeeBean();
			employeeBean.setEmpId(employee.getEmpId());
			employeeBean.setEmpName(employee.getEmpName());
			employeeBean.setAuthority(employee.getAuthority());
			session.setAttribute("user", employeeBean);
			// 一覧へリダイレクト
			return "redirect:/list";

		} else {
			model.addAttribute("errMessage", "社員ID、またはパスワードが間違っています。");
			return "index";
		}

	}

	@GetMapping("/logout")
	public String logout() {
		// セッションの破棄
		session.invalidate();
		return "redirect:/";
	}

}
