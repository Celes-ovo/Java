package javabook.ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ch7Ex6 {

	public static void main(String[] args) {
		try {
			//URL url = new URL("http://192.9.83.201:5000/gjavaweb/api/addrbook/list");
			URL url = new URL("https://weather.naver.com/rgn/townWetr.nhn?naverRgnCd=02131107");
			System.out.println("프로토콜: "+url.getProtocol());
			System.out.println("호스트: "+url.getHost());
			System.out.println("포트: "+url.getPort());
			
			System.out.println(">> HTML 시작");
			InputStream is = url.openStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			br.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
