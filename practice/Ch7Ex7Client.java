package javabook.ch07;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ch7Ex7Client {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("192.9.83.201",5000);
			System.out.println("## 클라이언트 실행..");

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Message Input: ");
			String msg = scan.next();
			pw.println("[황희정]"+msg);
			//pw.println("안녕하세요? 클라이언트에서 전송합니다.!!");
			pw.close();
			s.close();
			System.out.println("## 클라이언트 종료..");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
