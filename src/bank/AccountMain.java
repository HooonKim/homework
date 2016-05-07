package bank;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		/* 변수 선언 */
		Scanner scanner = new Scanner(System.in);  

		UserService service = new UserServiceImpl();
		 

		while(true){
			System.out.println("=== 카우푸 지수 구하기 프로그램 ===");
			System.out.println("[메뉴] 1.계좌개설 2.잔액조회");
			int key = scanner.nextInt();
			switch (key) {

			case 1: System.out.println("이름,비밀번호,초기개설 입금액"); 
					System.out.println(service.openAccount(scanner.next(), scanner.nextInt(), scanner.nextInt()));
					break;
			case 2: System.out.println("이름,비밀번호,초기개설 입금액"); break;
					//System.out.println(service.searchRestMoney(accountNo));
			case 3: System.out.println("시스템 종료입니다");return;
			case 4: System.out.println("시스템 종료입니다");return;
			case 5: System.out.println("시스템 종료입니다");return;
			default:System.out.println("1, 2번만 선택이 가능합니다");
				break;
			}
		}
	}
}
