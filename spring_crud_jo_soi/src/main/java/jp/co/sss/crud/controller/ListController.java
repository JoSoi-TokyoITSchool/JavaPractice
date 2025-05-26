package jp.co.sss.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.sss.crud.repository.EmployeeRepository;

@Controller
public class ListController {

	@Autowired
	EmployeeRepository employeeRepository;

	/**
	 * 全社員の情報を取得して、一覧画面に表示
	 * 모든 직원 정보를 조회하여 목록 화면에 표시
	 * @param model 一覧に渡すモデルオブジェクト 목록에 전달할 모델 객체
	 * @return 社員一覧画面のパス 직원 목록 화면의 경로
	 */
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("lists", employeeRepository.findAll());
		return "list/list";
	}

	//	@RequestMapping("/list/findByEmpName/{empName}")
	//	public String search(@PathVariable String empName, Model model) {
	//		model.addAttribute("lists", employeeRepository.findByEmpName(empName));
	//		return "list/list";
	//	}

	/**
	 * 指定された文字列を含む社員名を持つ社員のリストを検索して一覧画面に表示
	 * 입력한 문자열을 포함하는 직원명을 가진 직원 목록을 검색하여 목록 화면에 표시
	 * @param empName 検索対象の社員名（部分一致）검색할 직원명 (일부 일치)
	 * @param model 検索結果を渡すモデルオブジェクト 검색 결과를 전달할 모델 객체
	 * @return 社員一覧画面のパス 직원 목록 화면의 경로
	 */
	//	@GetMapping("/list/empName")
	//	public String searchByEmpName(@RequestParam("empName") String empName, Model model) {
	//		/* ブラウザで /list/empName?empName=◯◯ がリクエストされると、クエリパラメータempNameの値がメソッド引数 empNameに格納される
	//		브라우저에서 /list/empName?empName=◯◯ 요청이 들어오면, 쿼리 파라미터 empName 값을 메서드 매개변수 empName에 저장*/
	//		model.addAttribute("lists", employeeRepository.findByEmpNameContaining(empName));
	//		return "list/list";
	//	}

	@GetMapping("/list/{empName}")
	public String searchByEmpName(String empName, Model model) {
		model.addAttribute("lists", employeeRepository.findByEmpNameContaining(empName));
		return "list/list";
	}

}