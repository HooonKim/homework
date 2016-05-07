package grade;

import java.util.Scanner;

/**
 * @DATE : 2016. 4. 16.
 * @FILE : GradeMain.java
 * @AUTH : pakjkwan@gmail.com
 * @STORY : 성적표 프로그램
 */
public class GradeMain2 {
	/**
	 [문제]
	 과목별 점수를 입력받아 총점,평균,학점을 구하는 프로그램을 완성하시오
	 (과목은 국,영,수)
	 * */
	public static void main(String[] args) {
		// ---(1) 변수 선언 영역 ---
		Scanner scanner = new Scanner(System.in);
		GradeBean grade = new GradeBean();
		GradeService service = new GradeServiceByHanbitImpl();
		int total=0,avg=0;
		String name="",result="";
		// ---(2) 파라미터 입력 영역 ---
		System.out.println("이름 : [ ] 국어 : [ ] ,영어 : [ ],수학 : [ ],자바 : []");
		grade.setName(scanner.next());
		// ---(3) 메소드 호출
		grade.setKor(scanner.nextInt());
		grade.setEng(scanner.nextInt());
		grade.setMath(scanner.nextInt());
	
		// ---(4) 리턴값 출력 영역 ---
		System.out.println(grade.getName()+" : "+service.getGrade(grade)+" 학점");
	}
}










