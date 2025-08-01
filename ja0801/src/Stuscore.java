
public class Stuscore {

	public static int count = 0;
	public static String[] title = {
		"번호","이름","국어","영어","수학","합계","평균","등수"	
	};
	
	private String name;
	private int no,kor,eng,math,total,rank;
	private double avg;
	
	
	Stuscore(){};
	
	Stuscore(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = total / 3.0;
		no = ++count;
	}

	
	
	// getters, setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo() {
		no = ++count;
	}

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

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		total = kor + eng + math;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		avg = total / 3.0;
	}

	
	
	
	
}
