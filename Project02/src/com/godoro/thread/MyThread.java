package com.godoro.thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Kosuyor...");
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}