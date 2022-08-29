package com.godoro.homework05;

import java.util.Formatter;

public class FormatterTest {

public static void main(String[] args) {
		long accountId =601;
		String accountName="Kasa Hesabı";
		double amountLocal=23560;
		System.out.printf("Uzun: %10d Sicim: %-20s İkişer: %11.2f\n",accountId,accountName,amountLocal);
	
		Formatter formatter=new Formatter(System.out);
		formatter.format("Uzun: %10d Sicim: %-20s İkişer: %11.2f\n",accountId,accountName,amountLocal);
		formatter.close();
	}    
}
