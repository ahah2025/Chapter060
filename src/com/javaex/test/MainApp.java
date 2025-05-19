package com.javaex.test;

public class MainApp {

	public static void main(String[] args) {

		Runnable pt = new PensonThread();
		Thread p01 = new Thread(pt);
		p01.start();
		
		//문자출력 --> 메인
		for(char ch='A';ch<='Z'; ch++ ) {
			System.out.println(ch);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
