import java.util.Scanner;

public class C0723_02 {

	public static void main(String[] args) {
		
		// 성적 입력, grade 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요.");
		double d_score = scan.nextDouble();
		int score = (int)d_score;
		
		
		if(score > 100) {
			System.out.println("잘못된 입력입니다.");
		}else if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else if(score >= 0) {
			System.out.println("F");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		// 월 입력 > 계절 출력
		System.out.println("월 수를 입력하세요.");
		double d_month = scan.nextDouble();
		int month = (int)d_month;
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.println("겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}	
		
		// if문
		
		if(month >= 3 && month <= 5) {
			System.out.println("🌸");
		}else if(month >= 6 && month <= 8) {
			System.out.println("🌴");
		}else if(month >= 9 && month <= 11) {
			System.out.println("🍁");
		}else if(month == 12 || month == 1 || month == 2) {
			System.out.println("❄");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
			
			

		
	}
	

}
