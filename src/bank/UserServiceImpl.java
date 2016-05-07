package bank;

public class UserServiceImpl implements UserService {

	/*
	 * 변수의 종류
	 * 지역변수 : 메소드 안에 위치 (초기화 필수)
	 * 인스턴트 : 클래스 안에 위치 (초기화 노필수)
	 * 전역변수 : 프로젝트 모든 곳에서 호출 가능 (단, 클래스이름.메소드이름)
	 * 
	 */
	
	AccountBean account;
	
	@Override
	public String openAccount(String name, int password, int money) {
		//계좌개설 
		account  = new AccountBean();
		
		account.setOwnerName(name);
		account.setPassword(password);
		account.setRestMoney(money);
		 
		return account.toString(); 
	}

	@Override
	public String searchRestMoney() {
		// 잔액조회 
		return "잔액 = " + String.valueOf(account.getRestMoney());   //int 타입을 string 타입으로 변경
	}

	@Override
	public String deposit(int money) {
		// 입금
		account.setRestMoney(account.getRestMoney()+money);
		return "입금후 잔액" + account.getRestMoney();
	}

	@Override
	public String withdraw(int money) {
		String result = "";
		// 출금
		if (account.getRestMoney() > money) {
			account.setRestMoney(account.getRestMoney()-money);
			result = "출금후 잔액" + account.getRestMoney();
		} else {
			result = "잔액이 부족합니다.";
		}
		
		return result;
	}

	@Override
	public String closeAccount() {
		// 계좌 해지
		account = null;
		return "해지되었습니다.";
	}

}
