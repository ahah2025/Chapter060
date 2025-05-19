//테스트
package com.javaex.ex03;

public class MainApp {

	public static void main(String[] args) {

		//숫자 출장 보내서 일시키기
		Thread t01 = new DigitThread();
		Thread t02 = new LowerThead();
		Thread t03 = new UpperThread();
		
		//쓰레드 실행
		t01.start();
		t02.start();
		t03.start();
	}
}
