package jp.co.sss.crud.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.persistence.EntityManager;
import jp.co.sss.crud.entity.Department;
import jp.co.sss.crud.entity.Employee;
import jp.co.sss.crud.form.EmployeeForm;
import jp.co.sss.crud.repository.EmployeeRepository;

@Controller
public class RegistrationController {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	EntityManager entityManager;

	/**
	 * 社員登録入力画面を表示する 
	 * 직원 등록 입력 화면을 표시
	 */
	@GetMapping("/regist/input")
	public String registInput(Model model) {
		EmployeeForm form = new EmployeeForm();
		form.setGender(1); // 男性を初期値にする
		form.setAuthority(1); // 権限を初期値にする
		model.addAttribute("empForm", form);
		return "regist/regist_input";
	}

	/**
	 * 入力内容を確認画面へ送る 
	 * 입력한 내용을 확인 화면으로 넘김
	 */
	@PostMapping("/regist/update")
	public String registUpdate(@ModelAttribute EmployeeForm empForm, Model model) {
		model.addAttribute("empForm", empForm);

		// EntityManager를 이용해서 NamedQuery 실행
		Department dept = entityManager
				.createQuery("SELECT d FROM Department d WHERE d.deptId = :id", Department.class)
				.setParameter("id", empForm.getDeptId())
				.getSingleResult();

		model.addAttribute("deptName", dept.getDeptName());

		return "regist/regist_check";
	}

	/**
	 * 登録処理を実行する（最終確認後）
	 * 최종 등록 처리
	 */
	@PostMapping("/regist/complete")
	public String registComplete(@ModelAttribute EmployeeForm empForm, Model model) {
		Employee employee = new Employee();
		// empFormの値をEmployeeエンティティへコピー（empIdは自動採番のため除外）
		// empForm의 필드 값을 employee(엔티티)로 복사 (empId는 자동 증가이므로 제외)
		BeanUtils.copyProperties(empForm, employee, "empId");

		// 部署IDをもとにDepartmentエンティティを作成し、紐づける
		// 부서 ID를 기준으로 Department 엔티티를 생성해 연동
		//Why? Integer deptId를 Department 객체로 바꿔서 넣어주는 처리가 필요
		//그렇지않으면 department는 null 상태가 되고, 결국 DB의 NOT NULL 제약을 위반
		//		Department dept = new Department();
		//		dept.setDeptId(empForm.getDeptId());
		//		employee.setDepartment(dept);

		Department dept = entityManager.find(Department.class, empForm.getDeptId());
		employee.setDepartment(dept);

		// データベースに保存
		// DB에 저장
		employeeRepository.save(employee);
		return "regist/regist_complete";
	}

}
