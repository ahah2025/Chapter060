package com.javaex.ex06;

import com.javaex.ex05.DigitThread;

public class MainApp {

	public static void main(String[] args) {
		
		Runnable dt = new DigitThread();
		Runnable ut = new UpperThread();
		Runnable lt = new LowerThread();
		
		//출장 --> 숫자출력
		Thread t01 = new Thread(dt); 
		t01.start();
		
		//출장 --> 대문자출력
		Thread t02 = new Thread(ut); 		
		t02.start();
		
		//출장 --> 소문자출력
		Thread t03 = new Thread(lt); 		
		t03.start();
		
	}
}
