package day02.ex02;

public class ScoreDTO {
	// 멤버선언
	private int kor, eng, math, total;
	private float avg;
	private String name;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotal() {
		total = getKor() + getEng() + getMath();
		return total;
	}
	
	public float getAvg() {
		avg = getTotal() / 3f;
		return avg;
	}
	
	
	
}
