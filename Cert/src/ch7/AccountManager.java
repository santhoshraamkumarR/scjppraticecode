package ch7;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {

	
	private Map<String,Integer> accountTotals=new  HashMap<>();
	private int retirementFund;
	
	public int getBalance(String accountName) {
		Integer total = accountTotals.get(accountName);
		if (total == null) total = 0;
		return total;
	}
	
	
	public void setBalance(String accountName,int amount) {
		accountTotals.put(accountName, amount);
	}
	public static void main(String[] args) {
		AccountManager am=new AccountManager();
		am.setBalance("Test", 1000);
		System.out.println(am.getBalance("Test"));
		
	}

}
