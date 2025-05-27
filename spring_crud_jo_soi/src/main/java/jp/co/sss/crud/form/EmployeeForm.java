package jp.co.sss.crud.form;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class EmployeeForm {

	/** 社員ID */
	private Integer empId;

	/** パスワード */
	@NotBlank
	@Size(min = 1, max = 16)
	private String empPass;
	/*
	1.비밀번호 미입력시 
	1-1.암호를 입력하십시오
	1-2.패스워드는 16문자 이내로 입력해주세요
	
	2.비밀번호 소수점입력시
	2-1.비밀번호는 정수값으로 
	
	3.비밀번호가 16자 이상인 경우
	3-1.암호는 16자를 넘지 않아야합니다
	*/

	/** 社員名 */
	@NotBlank
	@Size(min = 1, max = 30)
	private String empName;
	/*
	1.사원이름 미입력시
	1-1.직원 이름을 입력하십시오
	1-2.사원명은 30문자 내외로 입력해주세요
	*/

	/** 性別 */
	private Integer gender;

	/** 住所 */
	@NotBlank
	@Size(min = 1, max = 60)
	private String address;
	/*
	1.주소 미입력시
	1-1."주소를 입력하십시오."
	1-2.“주소는 60문자 이내로 입력해주세요”
	*/

	/** 生年月日 */
	@NotNull
	private Date birthday;
	/*
	 1.생년월일 미입력시
	
	1-1. "생년월일을 입력하십시오."
	
	2.생년월일을 올바른 형식"2000/01/01"이 아닌"2000-01-01"로 입력한 경우
	2-1. "올바른 날짜를 입력하십시오."
	*/

	/** 権限 */
	private Integer authority;

	/** 部署ID */
	private Integer deptId;

	/**
	 * 社員IDの取得
	 *
	 * @return 社員ID
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * 社員IDのセット
	 *
	 * @param empId
	 *            社員ID
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * パスワードの取得
	 *
	 * @return パスワード
	 */
	public String getEmpPass() {
		return empPass;
	}

	/**
	 * パスワードのセット
	 *
	 * @param empPass
	 *            パスワード
	 */
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	/**
	 * 社員名の取得
	 *
	 * @return 社員名
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * 社員名のセット
	 *
	 * @param empName
	 *            社員名
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * 性別の取得
	 *
	 * @return 性別
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * 性別のセット
	 *
	 * @param gender
	 *            性別
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * 住所の取得
	 *
	 * @return 住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所のセット
	 *
	 * @param address
	 *            住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 生年月日の取得
	 *
	 * @return 生年月日
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 生年月日のセット
	 *
	 * @param birthday
	 *            生年月日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 権限の取得
	 *
	 * @return 権限
	 */
	public Integer getAuthority() {
		return authority;
	}

	/**
	 * 権限のセット
	 *
	 * @param authority
	 *            権限
	 */
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	/**
	 * 部署IDの取得
	 *
	 * @return 部署ID
	 */
	public Integer getDeptId() {
		return deptId;
	}

	/**
	 * 部署IDのセット
	 *
	 * @param deptId
	 *            部署ID
	 */
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
}
