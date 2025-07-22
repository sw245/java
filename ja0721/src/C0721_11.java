import java.util.Scanner;

public class C0721_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요.");
		int s_kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int s_eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int s_math = scan.nextInt();
		
		
		int sum = s_kor + s_eng + s_math;
		double avg = sum / 3.0;
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",name,s_kor,s_eng,s_math,sum,avg);
	}

}
