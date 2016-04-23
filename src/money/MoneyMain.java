package money;

import java.util.Scanner;

public class MoneyMain {
	public static void main(String[] args) {
		
		System.out.println("금액을 입력하세요");

		Scanner scan = new Scanner(System.in);
		Money money = new Money();
		money.moneySepeartor(scan.nextInt());

	}
}
