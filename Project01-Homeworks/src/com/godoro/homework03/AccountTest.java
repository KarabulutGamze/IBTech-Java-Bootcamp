package com.godoro.homework03;


public class AccountTest {
    
    public static void main(String[] args) {
        
        String line="601;Kasa Hesabı;23560";
        String[] tokens=line.split(";");
        
        Account account=new Account();
        account.setAccountId(Long.parseLong(tokens[0]));
        account.setAccountName(tokens[1]);
        account.setAmountLocal(Double.parseDouble(tokens[2]));
        

        System.out.println("Account ID: "+account.getAccountId()
		  +" Account Name: "+account.getAccountName()
		  +" Amount Local: "+account.getAmountLocal());
        
        StringBuilder builder=new StringBuilder();
        String string = builder.append(account.getAccountId()).append(";")
				.append(account.getAccountName()).append(";")
				.append(account.getAmountLocal())
                .toString();
                
                System.out.println(string);
    }
}
