package lotto;

import java.util.Arrays;

public class Lottery {
	private int[] lotto;

	public Lottery() {
		//객체생성 인스턴스변수
		lotto = new int[6]; 
	}
	
	public int[] getLotto() {
		setLotto();
		return lotto;
	}

	public void setLotto() { 
		
        for (int i=0;i< lotto.length; i++){

            int x=(int)((Math.random()*45)+1); 
            lotto[i] = x;
            for (int j=0; j<i; j++){
	            if(lotto[j] == x){  // 생성된 수와 이전에 저장된 수를 비교
	                x=(int)((Math.random()*45)+1); 
	                lotto[j] = x;    // 다시 수를 생성
	                j = j - 1;    // 다시 첨부터 같은 숫자가 있는가 비교 
	                break;
	            }
            } 
        }

		Arrays.sort(lotto);
		
		this.lotto = lotto;
	}
	
	
}
