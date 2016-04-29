package lotto;

import java.util.Scanner;

public class Lottomain {
	public static void main(String[] args) {
		/* 변수 선언 */
		Scanner scanner = new Scanner(System.in);
		LottoService lotto = new LottoServiceImpl();
		LottoBean lottoBean = new LottoBean();
		
		System.out.println("== 로또 시작 ==");
		System.out.println("얼마치를 구입하십니까?");
		int money = scanner.nextInt();
		
		lottoBean.setMoney(money);
		 
		System.out.println("== 로또번호 출력 ==");
		lotto.lottosout(lotto.lottocreat(lottoBean), lottoBean);
	}
}
