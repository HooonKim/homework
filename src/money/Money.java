package money;

import java.util.Scanner;
/**
 * @DATE : 2016. 4. 16.
 * @FILE : Money.java
 * @AUTH : 김 정 훈
 * @STORY : 화폐단위 -- 미완성
 */
public class Money {
	 
	int money; 
	
	private int setmoney(int money){
		this.money = money;
		return money;
	}
	
	public double getmoney() {
		return this.money; 
	}

	public void moneySepeartor(int scan) {
		int money = scan;

		int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		int mok = 0;

		int nmg = 0;

		System.out.println("Money:" + money);

		for (int i = 0; i < moneyUnit.length; i++) {

			// 이 부분을 코딩하여 완성하시오

			nmg = money % moneyUnit[i];
			mok = money / moneyUnit[i];

			if (nmg != 0) {

				money = nmg;
			}

			String moneyunit;
			
			if ( i == 0 ) {
				moneyunit = "5만원권 = ";
			} else if ( i == 1 ) { 
				moneyunit = "만원권 = "; 
			} else if ( i == 2 ) { 
				moneyunit = "오천권 = ";
			} else if ( i == 3 ) { 
				moneyunit = "천원권 = ";
			} else if ( i == 4 ) { 
				moneyunit = "오백원 = ";
			} else if ( i == 5 ) { 
				moneyunit = "백원 = ";
			} else if ( i == 6 ) { 
				moneyunit = "오십원 = ";
			} else { 
				moneyunit = "십원 = ";
			}
 
			
			System.out.println(moneyunit+ mok);

		}
	}
}
