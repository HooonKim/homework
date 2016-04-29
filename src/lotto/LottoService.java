package lotto;

public interface LottoService {  
	public int getlottocnt(LottoBean monney);
	public int[][] lottocreat(LottoBean monney); 
	public void lottosout(int[][] lottos, LottoBean lotto); 
	public int generatrandomnum();
	public void sort(int[][] arr, int i); 
	public int[][] getlottos(LottoBean lotto);
}
