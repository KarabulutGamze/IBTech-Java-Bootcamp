package com.godoro.homework04;

public class AccountConverter {
	
        public Account parse(String line) {
		
		String[] tokens=line.split(";");
		
		Account account=new Account();
		account.setAccountId(Long.parseLong(tokens[0]));
		account.setAccountName(tokens[1]);
		account.setAmountLocal(Double.parseDouble(tokens[2]));
		
		return account;
	}
	
	public String format(Account account) {
		
		StringBuilder builder=new StringBuilder();
		
		return builder.append(account.getAccountId()).append(";")
							  .append(account.getAccountName()).append(";")
							  .append(account.getAmountLocal())
							  .toString();
		
	}

}
