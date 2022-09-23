package day02.ex02;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScoreController scoreCtrl = new ScoreController();
		
		do {
			System.out.println("------- 성적처리 prgm v1.0 --------");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 이름 검색");
			System.out.println("0. 종료");
			System.out.println("---------------------------------");
			
			// 메뉴 번호 입력받기
			int selNo = sc.nextInt();
			
			if(selNo == 0) {
				System.out.println("프로그램 종료 합니다~~~");
				break;
			}
			
			switch(selNo) {
			case 1: scoreCtrl.scoreInput();break;
			case 2: scoreCtrl.printScore();break;
			case 3: scoreCtrl.search();break;			
			}
			
		}while(true);
		
	}
}
