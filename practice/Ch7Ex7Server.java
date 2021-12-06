package javabook.ch07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ch7Ex7Server {

	public static void main(String[] args) {
		try {
			ServerSocket sc = new ServerSocket(5000);
			System.out.println("## Server Started: "+
					sc.getInetAddress().getLocalHost());

			while(true) {
				Socket s = sc.accept();
				BufferedReader br = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("## Client Connected !!");
				System.out.println("## Msg from Client: "+br.readLine());
				br.close();
				s.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
