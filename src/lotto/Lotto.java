package lotto;

import java.util.Random;

public class Lotto {

	private int money; 
	private int[][] lottos;
	 
	
	public void setmoney(int money) {
		this.money = money; 
	}
	
	public int getmoney() {
		return this.money;
	}
	
	public void setlottos(int money){
		//이중배열에 this.generatrandomnum 를 사용하여 랜덤배열에 담는 코드 작성 
		int count = this.count(money);
		this.lottos = lottos;
	}
	

	public int[][] getlottos() {
		return this.lottos;
	}
	//-----------------------get set 필연 수순-----------------
	public void inputMoney(int money){
		this.money = money;
		lottos = new int[money/1000][6];
	}
	
	
	public int generatrandomnum(){
		//랜덤숫자생성
		int randomnum = 0;
		Random random = new Random();
		randomnum = random.nextInt(50);
		return randomnum;
	}
	
	public boolean isDuplication() {
		//중복체크
		boolean result = false;
		
		return result;
	}
	
	public void sort(int[] arr) {
		//로또번호 정렬
		// 25,3,30
		//swap 정렬
		
	}
	
	public int count(int money){
		int count=0;
		if (money < 1000) {
			return count; 
		}
		return (int) Math.ceil(count);
	}
	
	
	
	
}
