package bank;

public interface AdminService {
	/**
	 * 1. 통장개설
	 * 계좌를 개설하는데 관리자 입장에서 개설해 주는 로직
	 * 사용자입장에서 입력한 데이터를 받아서 계좌를 개설해 준다
	 * */ 
	public String openAccount(String name, int password, int restMoney);
	/**
	 * 2.계좌번호로 해당 계좌 정보 조회
	 * 계좌번호로 특정계좌가 존재하는지 체크하고
	 * 존재한다면 계좌정보를 호출하는 기능
	 * */
	public AccountBean searchAccountByAccountNo(int accountNo);
	/**
	 * 3.계좌명으로 계좌번호를 검색하는 기능
	 * */ 
	public AccountBean[] searchAccountsByName(String name);
	/**
	 * 4. 계좌 해지
	 * 사용자가 해지를 요청하면
	 * 그 계좌가 존재하는지 체크하고
	 * 존재하면 해지해 주고, "홍길동 고객님, 요청하신 해지건이 완료되었습니다."
	 * 존재하지않으면, "홍길동 고객님, 요청하신 계좌는 존재하지 않습니다."
	 * */
	public String closeAccount(int accountNo);
	/**
	 * 5.전체 계좌수
	 * */ 
	public int countAll();
	/**
	 * 6. 이름으로 계좌 수 조회(3번 기능을 수행하기 위해 필요한 메소드)
	 * */ 
	public int searchCountByName(String name);
}
