
public class Stuscore {

	String name;
	int kor;
	int eng;
	int math;
	int total = kor + eng + math;
	double avg = total / 3.0;
	int rank;
	
	
	void total() {
		total = kor + eng + math;
	}
	
	
	void avg() {
		avg = total / 3.0;
	}
	
}
