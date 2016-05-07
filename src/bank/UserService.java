package bank;

public interface UserService {
	/**
	 * 1. 통장개설
	 * 계좌를 개설하는데 관리자 입장에서 개설해 주는 로직
	 * 사용자입장에서 입력한 데이터를 받아서 계좌를 개설해 준다
	 * */ 
	public String openAccount(String name, int password, int money);
	
	/**
	 * 2. 잔액 조회
	 * */
	public String searchRestMoney();
	
	/**
	 * 3. 입금
	 * */
	public String deposit(int money);
	/**
	 * 4. 출금
	 * */
	public String withdraw(int money);
	/**
	 * 4. 계좌 해지
	 * 사용자가 해지를 요청하면
	 * 그 계좌가 존재하는지 체크하고
	 * 존재하면 해지해 주고, "홍길동 고객님, 요청하신 해지건이 완료되었습니다."
	 * 존재하지않으면, "홍길동 고객님, 요청하신 계좌는 존재하지 않습니다."
	 * */
	public String closeAccount();
}
