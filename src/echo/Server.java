//테스트
package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//천호동
public class Server {

	public static void main(String[] args)throws IOException{
		
		//서버소켓생성
		ServerSocket serverSocket = new ServerSocket();
		
		//bind 	ip : 192.168.0.66 	 port : 10101
		/*
		InetSocketAddress ipport = new InetSocketAddress("192.168.0.66", 10101);
		serverSocket.bind(ipport);
		*/
		serverSocket.bind(new InetSocketAddress("192.168.0.66", 10101));
		
		//서버시작
		System.out.println("<서버시작>");
		System.out.println("==============================");
		System.out.println("[연결을 기다리고 있습니다.]");
	
		//클라이언트가 연결되면 메소드accept() 실행 된다
		//socket 종이컵전화기
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		//읽기 스트림  
		//InputStream in = new FileInputStream("C:\\javaStudy\\MS949-copy.txt");
		InputStream in = socket.getInputStream();
		InputStreamReader isr= new InputStreamReader(in,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//쓰기 스트림 준비
		OutputStream out = socket.getOutputStream(); //주스트림
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//--------------------------------------
		while(true) {
			//메세지 받기
			String msg = br.readLine();
			
			if(msg == null) {
				break;
			}
			
			System.out.println("받은메세지:" + msg);
					
			//메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush(); //'안녕'이라는 글자 용량이 작아도 내보내
			//------------------------------
		}

		System.out.println("=================================");
		System.out.println("<서버 종료>");
		
		//자원정리
		socket.close(); 
		br.close();
		bw.close();
		serverSocket.close();
	}
}
