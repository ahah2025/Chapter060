package com.javaex.ex05;

public class MainApp {

	public static void main(String[] args) {
		
		//숫자 출장
		Thread t = new Thread(new DigitThread()); //생성자 파라미터
		t.start();
		
		//대문자 메인
		for(char ch='A'; ch<='Z';ch++) {
			System.out.println(ch);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
