//테스트
package com.javaex.ex03;

public class UpperThread extends Thread{

	//대문자
	public void run() {
		for(char ch='A'; ch<='Z'; ch++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
