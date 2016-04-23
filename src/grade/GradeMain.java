package grade;

import java.util.Scanner;

/**
 * @DATE : 2016. 4. 16.
 * @FILE : GradeMain.java
 * @AUTH : pakjkwan@gmail.com
 * @STORY : 성적표 프로그램
 */
public class GradeMain {
	/**
	 [문제]
	 과목별 점수를 입력받아 총점,평균,학점을 구하는 프로그램을 완성하시오
	 (과목은 국,영,수)
	 * */
	public static void main(String[] args) {
		// ---(1) 변수 선언 영역 ---
		Scanner scanner = new Scanner(System.in);
		Gradebean grade = new Gradebean(); 
		Gradeservice gradeservice = new Gradeservice(); 
		int total=0;
		int avg = 0;
		String name="", result="";
		// ---(2) 파라미터 입력 영역 ---
		System.out.println("이름 : [ ] 국어 : [ ] ,영어 : [ ],수학 : [ ]");
		name = scanner.next();
		// ---(3) 메소드 호출 
		grade.setkor(scanner.nextInt());
		grade.seteng(scanner.nextInt());
		grade.setmath(scanner.nextInt());
		
		System.out.println(name + "의 국어점수는 = " + grade.getkor());
		
		total = gradeservice.getTotal(grade);
		
		result = gradeservice.getgrade(grade);
		
	 
		// ---(4) 리턴값 출력 영역 ---
		 
		
		System.out.println(name+"의 학점은 "+result+"이다.");
	}
}
