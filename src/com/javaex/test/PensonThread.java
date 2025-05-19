package com.javaex.test;

public class PensonThread implements Runnable{

	@Override
	public void run() {
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
		
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
	}
}
