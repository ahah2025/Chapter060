package com.javaex.ex03;

public class LowerThead extends Thread{

	//소문자
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
