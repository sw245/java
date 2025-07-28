import java.util.Scanner;

public class C0728_05 {

	public static void main(String[] args) {

		// 홍길동 100 100 100 300 100.0
		// 유관순 90  90  90  270 90.0
		// 이순신 80  80  80  240 80.0
		
		// 객체 배열을 선언
		// 객체 생성
		// 정보 입력, 출력
		
		
		Stuscore[] s = new Stuscore[3];
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i<3; i++) {
			
			s[i] = new Stuscore();
			System.out.println("이름을 입력하세요.");
			s[i].name = scan.next();
			System.out.println("국어점수를 입력하세요.");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			s[i].math = scan.nextInt();
			s[i].total();
			s[i].avg();
			
			
		}
		
		/*
		s[0].name = "홍길동";
		s[0].kor =  100;
		s[0].eng =  100;
		s[0].math =  100;
		
		
		s[1].name = "유관순";
		s[1].kor = 90;
		s[1].eng = 90;
		s[1].math = 90;
		
		
		s[2].name = "이순신";
		s[2].kor = 80;
		s[2].eng = 80;
		s[2].math = 80;
		*/
		
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		for(int i=0; i<3; i++) {
//			s[i].total();
//			s[i].avg();
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n"
					,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		}
		
		
		
		
		// 클래스는 설계도, 객체는 제품...
		
		
	}

}
