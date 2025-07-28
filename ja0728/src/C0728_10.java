import java.util.Scanner;

public class C0728_10 {

	public static void main(String[] args) {

		// 3개의 숫자를 입력받아 사칙연산
		// Cal2 클래스에 정의
		
		Cal2 cal2 = new Cal2();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 계산기 ]");
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 나눗셈");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("첫 번째 숫자를 입력하세요.");
			int a = scan.nextInt();
			System.out.println("두 번째 숫자를 입력하세요.");
			int b = scan.nextInt();
			System.out.println("세 번째 숫자를 입력하세요.");
			int c = scan.nextInt();
			
			int result = cal2.add(a, b, c);
			
			System.out.println("세 수의 합은 "+result+"입니다.");
			
		case 2:
			System.out.println("첫 번째 숫자를 입력하세요.");
			int a2 = scan.nextInt();
			System.out.println("두 번째 숫자를 입력하세요.");
			int b2 = scan.nextInt();
			System.out.println("세 번째 숫자를 입력하세요.");
			int c2 = scan.nextInt();
			
			int result2 = cal2.subtract(a2, b2, c2);
			
			System.out.println("a에서 b와 c를 뺀 결과는 "+result2+"입니다.");
			
		case 3:
			System.out.println("첫 번째 숫자를 입력하세요.");
			int a3 = scan.nextInt();
			System.out.println("두 번째 숫자를 입력하세요.");
			int b3 = scan.nextInt();
			System.out.println("세 번째 숫자를 입력하세요.");
			int c3 = scan.nextInt();
			
			int result3 = cal2.multiply(a3, b3, c3);
			
			System.out.println("세 수의 곱은 "+result3+"입니다.");
			
		case 4:
			System.out.println("첫 번째 숫자를 입력하세요.");
			int a4 = scan.nextInt();
			System.out.println("두 번째 숫자를 입력하세요.");
			int b4 = scan.nextInt();
			System.out.println("세 번째 숫자를 입력하세요.");
			int c4 = scan.nextInt();
			
			int result4 = cal2.divide(a4, b4, c4);
			
			System.out.println("a에서 b와 c를 나눈 결과는 "+result4+"입니다.");
			
		default: 
			System.out.println("잘못된 입력입니다.");
			
		}
		
		
		
		
		
	}

}
