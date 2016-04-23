package kaup;

public class KaupServiceImpl2 implements KaupService {

	@Override
	public int getIndex(KaupBean kaup) { 
		 
		int idx = (int)(kaup.getweight() / ((kaup.getheight() * kaup.getheight()))*10000); 
		return idx;
	}

	@Override
	public String getResult(int index) {
		
		//KaupBean kaupBean = new KaupBean();
		
		 String result = "";
		 
		if (index <= 30) {
			result = "비만";
		} else if (index <= 24) {
			result = "과체중"; 
		} else if (index <= 20) {
			result = "과체중"; 
		} else if (index <= 15) {
			result = "과체중"; 
		} else if (index <= 13) {
			result = "과체중"; 
		} else if (index <= 10) {
			result = "과체중"; 
		} else {
			result = "저체중"; 
		}
		  
		
		return "비만도 = " + index + " 이므로 " + result + "입니다." ;
	}
	
}
