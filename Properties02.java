package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		// 파일의 내용을 읽어올 때 사용하는 클래스
		FileInputStream fis = null;
		
		fis = new FileInputStream("src/day02/conf.properties");
		prop.load(fis);
		
		System.out.println("prop : " + prop);
		
		prop = new Properties();
		
		prop.put("1", "MS");
		prop.put("2", "Google");
		prop.put("3", "Naver");
		prop.put("4", "Daum");
		
		// 파일에 내용을 쓸때 사용하는 클래스
		FileOutputStream fos = null;
		fos = new FileOutputStream("src/day02/conf.properties");
		
		prop.store(fos, "setting");
	}
}
