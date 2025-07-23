import java.util.Scanner;

public class C0723_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int r = (int)(Math.random()*10) + 1;	// 1~10 정수
		System.out.println("[ 랜덤숫자 맞추기 ]");
		System.out.println("1부터 10까지의 숫자 중 하나를 입력하세요.");
		double d_input = scan.nextDouble();
		int input = (int)d_input;
		
		// if문 사용, 결과로 업다운 알려주기
		
		
		if(input > 10 || input < 1) {
			System.out.println("잘못된 입력입니다.");
		}else if(input == r) {
			System.out.println("정답입니다.");
		}else if(input > r) {
			System.out.println("입력한 숫자가 답보다 큽니다.");
		}else if(r > input) {
			System.out.println("입력한 숫자가 답보다 작습니다.");
		}
		
		
		
		
//		System.out.println(r);
		
		
		
	}
}
