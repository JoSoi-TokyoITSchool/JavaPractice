package jp.co.sss.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByEmpIdAndEmpPass(int empId, String empPass);

	//List<Employee> findByEmpName(String empName);

	/**
	 * 指定された文字列を含む社員名を持つ社員のリストを検索
	 * 입력한 문자열을 포함하는 직원명을 가진 직원 리스트를 검색
	 * @param empName 検索対象の社員名（部分一致）검색할 직원명의 일부 문자열
	 * @return 条件に一致する社員のリスト 조건에 일치하는 직원 리스트
	 */
	List<Employee> findByEmpNameContaining(String empName);

}
