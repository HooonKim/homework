package lotto;

import java.util.Random;

public class LottoServiceImpl implements LottoService {
 
	@Override
	public int getlottocnt(LottoBean lotto) {
		//금액에 따른 로또 인가 갯수
		int count=0;
		if (lotto.getMoney() < 1000) {
			return count; 
		} else {
			count = lotto.getMoney() / 1000;
		}
		return (int) Math.ceil(count);
		
	}
 

	@Override 
	public int generatrandomnum() {
		//랜덤숫자생성
		int randomnum = 0;
		Random random = new Random();
		randomnum = random.nextInt(50);
		return randomnum;
	}
  
	
	@Override
	public int[][] lottocreat(LottoBean lotto) {
		// 로또번호 생성
        int lottocnt = this.getlottocnt(lotto);  
		int[][] lottos = new int[lottocnt+1][6];	
		int i,j,k, ix;
        int x;

		for (ix=1; ix <= lottocnt; ix++) { 
	        for(i=0;i<6;i++){   // 랜덤수 6개 생성
	            x=generatrandomnum();  // 랜덤함수 호출 (범위 1-45)
	            
	            lottos[ix][i]=x;
	            for (j=0;j<i;j++){
	                if(lottos[ix][i] == lottos[ix][j]){  // 생성된 수와 이전에 저장된 수를 비교
	                    x=(int)((Math.random()*45)+1);
	                    lottos[ix][i] = x;    // 다시 수를 생성
	                    i = i - 1;    // 다시 첨부터 같은 숫자가 있는가 비교
	                    break;
	                }
	            }
	        } 
			sort(lottos, ix);
		}  
		lotto.setLottos(lottos);
		return lottos;
	}


	@Override
	public int[][] getlottos(LottoBean lotto) {
		//로또번호 가져오기
		return lotto.lottos;
	}



	@Override
	public void sort(int[][] lottos, int i) {  
        //로또번호 정렬 (오름차순) 
        for(int ix=0; ix<6; ix++){        
            for(int j=0; j<=ix; j++){
                if(lottos[i][ix]<=lottos[i][j]){
                    int k=lottos[i][ix];
                    lottos[i][ix]=lottos[i][j];
                    lottos[i][j]=k;
                }
            } 
        }  
	}

	@Override
	public void lottosout(int[][] lottos, LottoBean lotto) {
		// TODO Auto-generated method stub  
		String lottofull = "";
		for (int i=1; i <=this.getlottocnt(lotto); i++) {
			for (int j=0; j<6; j++){
				if (j==0) {
					lottofull = lottos[i][j]+""; 
				} else {
					lottofull = lottofull+ ","+lottos[i][j]; 
				}
			}  
			System.out.println(i + ". " + lottofull + "\n"); 
			System.out.println("========================="); 
		}

	}



 
}
