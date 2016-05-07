package bank;

public class AccountBean {
	protected int accountNo; // 계좌번호
	protected String ownerName; // 계좌주인
	private int password; // 통장비번
	protected int restMoney; // 잔액
	protected static final String BANK_NAME = "한빛뱅크";
	
	
	public AccountBean() {
		this.setAccountNo();
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo() {
		this.accountNo = (int) ((Math.random()*999999)+100000);
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getRestMoney() {
		return restMoney;
	}
	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}

	@Override
	public String toString() {
		return BANK_NAME + "[계좌번호 =" + accountNo + ", 이름=" + ownerName + ", 비밀번호=******" + ", 잔액=" + restMoney + "]";
	}

	/**
	 * 생성자를 만드시오. 
	 * 단, 통장을 만듦과 동시에 은행 이름이 통장 바깥에 새겨지며(상수) 
	 * 계좌번호는 랜덤숫자로 만들어 지며(총 * 6자리로 합시다) 
	 * 계좌주인의 이름은 새겨지며 비번도 설정합니다. 
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 * toString, 계좌생성.
	 * 
	 */

	
}
