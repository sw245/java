
public class Stuscore {

	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	int total() {
		total = kor + eng + math;
		return total;
	}
	
	double avg() {
		avg = total / 3.0;
		return avg;
	}
	
	void sprint() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n"
				,name,kor,eng,math,total,avg);
	}
	
	
}
