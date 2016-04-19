package homework;

import java.util.Scanner;

/**
 * @file   : LeapYearMain.java 
 * @author : pakjkwan@gmail.com
 * @date   : 2016. 4. 18.
 * @story  : 윤년을 판별하는 년,월,말일 구하는 프로그램
 */
public class LeapYearMain {
	/**
	[문제]
	월을 입력하면 해당 월의 끝날이 몇일인지 출력하는 프로그램을 완성하시오
	1을 입력하면 31일
	단, 2월은 윤년 처리를 해야함
	예로 2016년 2월은 29일로 윤년임.2000년 2월도 29일로 윤년임
	따라서, 2016 과 2 를 파라미터로 전달하면 2016-2-29 로 출력됨
	주의점.. 입력값이 1 ~ 12를 넘어서면 잘못된 입력
	switch case로 처리
	 * */
	public static void main(String[] args) {
		/* 변수 선언 */
		Scanner scanner = new Scanner(System.in);
		LeapYear ly = new LeapYear();
		/* 데이터 입력 */
		System.out.println("년/월 입력");
		int year=scanner.nextInt(),month=scanner.nextInt();
		/* 연산 */
		// 코딩하시오.
		/* 결과 출력 */
		
	}
}
