package com.godoro.enums;

public class DayTest {
	private static void printDay(Day day) {
		switch(day) {
		case MONDAY:
			System.out.println("Pazartesi");
			break;
		case TUESDAY:
			System.out.println("Salı");
			break;
		case WEDNESDAY:
			System.out.println("Çarşamba");
			break;
		default:
				System.out.println("Geçersiz gün düzgüsü!");
		}
	}
	public static void main(String[] args) {
		Day day=Day.TUESDAY;
		printDay(day);
		printDay(Day.TUESDAY);
		//printDay(47);
	}

}
