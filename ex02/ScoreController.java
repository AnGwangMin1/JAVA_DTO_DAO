package day02.ex02;

import java.util.Scanner;

public class ScoreController {
	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();
	
	// 성적 입력
	public void scoreInput() {
		
		// 학생수 구하기
		int cnt = dao.stu_cnt();
		
		do {
			System.out.println("입력 중단 : 0을 누르세요!!");
			System.out.println("입력 예 > 홍길동 90 80 70");
			System.out.printf("%d번 학생 성적입력 [이름 국어 영어 수학] --> ", ++cnt);
			
			String name = sc.next();
			
			// 입력 중단시키기
			if(name.equals("0")) {
				break;
			}
			
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			
			// 입력받은 점수를 ScoreDTO객체로 묶어줌
			ScoreDTO dto = new ScoreDTO();
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMath(math);
			
			// 입력받은 점수를 갖고 있는 ScoreDTO를 리스트에 저장
			dao.insertScore(dto);
		}while(true);
	}
	
	// 성적 출력
	public void printScore() {
		System.out.println("----------------------------");
		System.out.println("전체 학생 수 : "+ dao.stu_cnt());
		System.out.println("----------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------");
		
		//dao.getLists() => 전체 학생의 점수 리스트(ArrayList<ScoreDTO>)
		// sDto => 각 학생의 점수
		for( ScoreDTO sDto: dao.getLists()) {
			System.out.printf("%4s %7d %7d %7d %7d %7.2f%n",
								sDto.getName(),
								sDto.getKor(),
								sDto.getEng(),
								sDto.getMath(),
								sDto.getTotal(),
								sDto.getAvg());
		}
		System.out.println("----------------------------");
	}
	
	// 검색
	public void search() {
		System.out.println("검색할 학생 이름 >> ");
		String name = sc.next();
		
		System.out.println("----------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------");
		
		// String객체는 불변객체(immutable)
		// StringBuffer, StringBuilder 가변객체(mutable)
		
		StringBuilder sb = new StringBuilder();
		
		// dao.searchList(name) : reaultList 리턴해줌
		// 검색된 학생의 점수를 sb변수에 추가해주는 루프
		for( ScoreDTO sDto: dao.searchList(name)) {
			sb.append(String.format("%4s %6d %6d %6d %6d %.2f%n",
					sDto.getName(),
					sDto.getKor(),
					sDto.getEng(),
					sDto.getMath(),
					sDto.getTotal(),
					sDto.getAvg()));
		}
		
		if(sb.length()>0) {
			System.out.println(sb.toString());
		}else {
			System.out.println("학생이 존재하지 않습니다!!");
		}
		System.out.println("-------------------------------------");
	}
}
