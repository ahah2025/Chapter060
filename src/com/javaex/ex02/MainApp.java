package com.javaex.ex02;

public class MainApp {

	public static void main(String[] args) {
		
		//숫자출력 --> 출장 --> 쓰레드
		Thread dt = new DigitThread(); //쓰레드생성
		dt.start(); //쓰레드시작
		
		//문자출력 --> 메인
		for(char ch='a'; ch<='z'; ch++ ) {
			System.out.println(ch);
			
			try { //1초대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	
	}
}
