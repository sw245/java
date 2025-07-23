import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억 이하 덧셈");
		System.out.println("2. 21억 이상 덧셈");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		
		int choice = scan.nextInt();	// 정수만
		
		switch(choice) {
		case 1:
			System.out.println("덧셈할 숫자1을 입력하세요.");
			int input1 = scan.nextInt();
			System.out.println("덧셈할 숫자2를 입력하세요.");
			int input2 = scan.nextInt();
			
			long result = (long)input1 + input2;
			System.out.println("숫자1 : "+input1);
			System.out.println("숫자2 : "+input2);
			System.out.println("두 수의 합계 : "+result);
			break;
		case 2:
			System.out.println("덧셈할 숫자1을 입력하세요.");
			long input3 = scan.nextInt();
			System.out.println("덧셈할 숫자2를 입력하세요.");
			long input4 = scan.nextInt();
			
			long result2 = input3 + input4;
			System.out.println("숫자1 : "+input3);
			System.out.println("숫자2 : "+input4);
			System.out.println("두 수의 합계 : "+result2);
			break;
		}
		
		
		/*
		int a = 10;
		float f = 10.0F;
		double d = 10.0;
		
		// 숫자 입력받기
		System.out.println("숫자를 입력하세요.");
		long input = scan.nextLong();
		System.out.println("숫자2를 입력하세요.");
		long input2 = scan.nextLong();
		long sum = input + input2;
		
		
		System.out.println("입력값 : "+input);
		System.out.println("입력값2 : "+input2);
		System.out.println("합계 : "+sum);
		*/
		
	}

}
