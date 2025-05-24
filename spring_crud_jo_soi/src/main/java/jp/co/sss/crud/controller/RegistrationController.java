package jp.co.sss.crud.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.sss.crud.entity.Department;
import jp.co.sss.crud.entity.Employee;
import jp.co.sss.crud.form.EmployeeForm;
import jp.co.sss.crud.repository.EmployeeRepository;

@Controller
public class RegistrationController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/regist/input")
	public String registInput(Model model) {
		model.addAttribute("empForm", new EmployeeForm());
		return "regist/regist_input";
	}

	@PostMapping("/regist/update")
	public String registUpdate(@ModelAttribute EmployeeForm empForm, Model model) {
		model.addAttribute("empForm", empForm); // 다시 넘김
		return "regist/regist_check";
	}

	// 최종 등록 처리
	@PostMapping("/regist/complete")
	public String registComplete(@ModelAttribute EmployeeForm empForm, Model model) {
		Employee employee = new Employee();
		//empForm의 필드 값을 employee(엔티티)으로 복사함, empId는 제외->자동증가
		BeanUtils.copyProperties(empForm, employee, "empId");
		Department dept = new Department();
		dept.setDeptId(empForm.getDeptId());
		employee.setDepartment(dept);
		employeeRepository.save(employee);
		return "regist/regist_complete";
	}

}
