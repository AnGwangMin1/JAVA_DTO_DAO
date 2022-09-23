package day02.ex02;

import java.util.ArrayList;

public class ScoreDAO {
	// 점수가 입력된 모든 학생의 점수가 저장될 List
	private ArrayList<ScoreDTO> lists = new ArrayList<ScoreDTO>();
	
	// 학생수
	public int stu_cnt() {
		return this.lists.size();
	}
	// 매개변수 dto : 입력받은 점수를 묶어놓은 ScoreDTO 객체
	// 학생의 스코어를 lists에 insert(추가)하기
	public void insertScore(ScoreDTO dto) {
		lists.add(dto);
	}
	
	// 학생 성적 전체 리스트를 반환해주는 메소드
	public ArrayList<ScoreDTO> getLists() {
		return lists;
	}
	
	// 입력받은 이름(매개변수)으로 검색하기
	// 같은 이름이 존재하면 해당 ScoreDTO를 resultList에 담아서 리턴해줌
	public ArrayList<ScoreDTO> searchList(String name){
		// 검색된 결과(ScoreDTO)를 저장하기위한 리스트
		ArrayList<ScoreDTO> resultList = new ArrayList<ScoreDTO>();
		
		for(ScoreDTO sDto:lists) {
			if(sDto.getName().equals(name)) {
				resultList.add(sDto);
			}
		}
		
		return resultList;
	}
	
	
	
	
	
}
