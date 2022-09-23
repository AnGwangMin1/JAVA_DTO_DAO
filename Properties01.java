package day02;

import java.util.Properties;
import java.util.Set;

public class Properties01 {
	public static void main(String[] args) {
		// 제네릭 사용 불가, 키와 값으로 저장
		Properties prop = new Properties();
		
		prop.put(1, "LPG");
		prop.put(2, "LNG");
		prop.put(3, "석유");
		prop.put(4, "석탄");
		
		System.out.println(prop);
		
		// 수정
		prop.put(2, "석유가스");
		System.out.println(prop);
		
		// 삭제
		prop.remove(2);
		System.out.println(prop);
		
		Object obj=prop.get(4);
		System.out.println("obj : " + obj);
		
		System.out.println("---------");
		prop = new Properties();
		
		// 키와 값의 타입을 String 타입으로 사용할 것
		prop.put("1", "생산");
		prop.put("2", "인사");
		prop.put("3", "회계");
		prop.put("4", "영업");
		prop.put("5", "구매");
		
		// 키값을 리턴
		Set<Object> objs=prop.keySet();
		System.out.println(objs);
		
		for(Object ob : objs) {
			String property=prop.getProperty((String)ob);
			System.out.println("값 : " + property);
		}
	}
}
