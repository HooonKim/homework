package bank;

public class AdminServiceImpl implements AdminService {
	private AccountBean[] list;
	private int count;
	public AdminServiceImpl(int size) {
		list = new AccountBean[size];
	}
	
	@Override
	public String openAccount(String name, int password, int restMoney) { 
		
		AccountBean account = new AccountBean();
		account.setAccountNo();
		account.setOwnerName(name);
		account.setPassword(password);
		account.setRestMoney(restMoney);
		list[count] = account;
		count++;
		
		return account.toString();
	}

	@Override
	public AccountBean searchAccountByAccountNo(int accountNo) {

		AccountBean temp = null;
		
		for (int i = 0; i < count; i++) {
			if (list[i].getAccountNo() == accountNo) {
				temp = list[i]; 
				break;
			}
		}
		
		return temp;
	}

	@Override
	public AccountBean[] searchAccountsByName(String name) {
		
		AccountBean[] temp = new AccountBean[searchCountByName(name)];
		
		int idx = 0;
		
		
		for (int i = 0; i < count; i++) {
			if (list[i].getOwnerName().equals(name)) {
				temp[idx] = list[i]; 
				idx++;
			}
		}
		 
		return temp;
	}

	@Override
	public String closeAccount(int accountNo) { 

		for (int i = 0; i < count; i++) {
			if (list[i].getAccountNo() == accountNo) { 
				list[i] = list[count-1];  

				count--; 
				break;
			}
		}
		
		return accountNo + "의 계좌가 해지되었습니다.";
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public int searchCountByName(String name) {
		// TODO Auto-generated method stub
		int cnt = 0; 
		
		for (int i = 0; i < count; i++) {
			if (list[i].getOwnerName().equals(name)) {
				cnt++;
			}
		}
		
		return cnt;
	}

}
