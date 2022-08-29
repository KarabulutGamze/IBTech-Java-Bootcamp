package com.godoro.homework05;

import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] args) {
    	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Account ID:");
		long accountId=scanner.nextLong();
		System.out.println("Account Name:");
		String accountName=scanner.next();
		System.out.println("Amount Local:");
		double amountLocal=scanner.nextDouble();
		
		scanner.close();
		
        Account account=new Account(accountId, accountName, amountLocal);
		System.out.printf("Account ID: %d  Account Name: %s Amount Local: %.2f",account.getAccountId(),account.getAccountName(),account.getAmountLocal());
		
	}

    
}
