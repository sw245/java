import java.util.Scanner;

public class C0728_09 {

	public static void main(String[] args) {

		// a, b를 입력받아, 더하기, 빼기, 곱하기, 나누기 계산을 하는 프로그램 만들기
		
//		int a = 10;
//		int b = 5;
		
		Cal c = new Cal();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 사칙연산 프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("첫 번째 값을 입력하세요.");
			int a = scan.nextInt();
			System.out.println("두 번째 값을 입력하세요.");
			int b = scan.nextInt();
			int result = c.add(a,b);
			System.out.println("두 수의 합은 "+result+"입니다.");
			break;
		case 2:
			System.out.println("첫 번째 값을 입력하세요.");
			int a2 = scan.nextInt();
			System.out.println("두 번째 값을 입력하세요.");
			int b2 = scan.nextInt();
			int result2 = c.subtract(a2, b2);
			System.out.println("두 수의 차는 "+result2+"입니다.");
			break;
		case 3:
			System.out.println("첫 번째 값을 입력하세요.");
			int a3 = scan.nextInt();
			int b3 = scan.nextInt();
			System.out.println("두 번째 값을 입력하세요.");
			System.out.println("");
			break;
		case 4:
			break;
		}
		
	}

}
