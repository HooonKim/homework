package grade;

import java.util.List;

public interface AdminService {
	/**
	 * 1. 학생등록 
	 * */ 
	public String openAccount(String id, String name, int kor, int eng, int math, int java);
	/**
	 * 2. ID로 해당 계좌 정보 조회 
	 * */
	public GradeBean findByAccountNo(int accountNo);
	/**
	 * 3. 이름으로 검색하는 기능
	 * */ 
	public List<GradeBean> findByName(String name);
	/**
	 * 4. 학생 해지 
	 * */
	public String remove(int id);
	/**
	 * 5.전체 학생수
	 * */ 
	public int countAll(); 
	/**
	 * 6.전체 학생 목록
	 * */ 
	public List<GradeBean> list();
}