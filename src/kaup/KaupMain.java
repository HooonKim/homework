package kaup;

import java.util.Scanner;

/**
 * @file   : KaupMain.java 
 * @author : pakjkwan@gmail.com
 * @date   : 2016. 2. 14.
 * @story  : 카우프지수
 */
public class KaupMain {
	/**
	 * To. 개발자님
	 * 사람의 이름을 입력하고, 몸무게 , 키를 입력하면
	 * 해당 사람의 상태가 비만인지 저체중인지 알려주는 
	 * 카우프 프로그램을 만들어주세요.
	 * 카우프 지수 구하는 공식은 몸무게를 키의제곱으로 나눈 후
	 * int idx = (int)(weight/(height*height))*10000
	 * 10000을 곱한 인덱스값이 랍니다.
	 * 
	 * 그 인덱스결과가 30 이상이면 비만
	 * 24 이상이면 과체중
	 * 20 이상이면 정상
	 * 15 이상이면 저체중
	 * 13 이상이면 마름
	 * 10 이상이면 영양실조
	 * 그 미만이면 소모증 이랍니다.
	 * 
	 * 어플리케이션 제작 바랍니다.
	 */
	public static void main(String[] args) {
		/* 변수 선언 */
		Scanner scanner = new Scanner(System.in);  
		KaupService kaup = new KaupServiceImpl();
		KaupBean kaupbean = new KaupBean();
		String name = "";  
		double height = 0.0, weight = 0.0;
		while(true) {
			System.out.println("===카오프 지수 구하기 프로그램===");
			System.out.println("[메뉴] 1.계속 2.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1 :
				/* 데이터 입력 */
				System.out.println("이름,키,몸무게 입력");
				name = scanner.next();
				height = scanner.nextDouble();
				weight = scanner.nextDouble();
				

				kaupbean.setname(name);
				kaupbean.setweight(weight);
				kaupbean.setheight(height);
				System.out.println(kaupbean.getname() + "님은 " + kaup.getResult(kaup.getIndex(kaupbean))); 
				 break;
			case 2 : System.out.println("시스템 종료입니다."); return;
			default: System.out.println("1, 2번만 입력이 가능합니다.");break;
			}
			 
			
		}
	}
}
