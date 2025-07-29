import java.util.Scanner;

public class C0729_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		// 다른 클래스 사용 시 - 객체선언 후 사용(클래스 변수, 클래스 메서드 제외)
		Cal cal = new Cal();
		
		
		
		int a = 10;
		int b = 5;
		
		/*
		System.out.println("a = 10, b = 5");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("원하는 번호를 입력하세요.");
		
		
		int choice = scan.nextInt();
		int result;
		
		switch(choice) {
		case 1:
			result = cal.add(a, b);
			System.out.println("결과 : "+result);
			break;
			
		case 2:
			result = cal.subtract(a, b);
			System.out.println("결과 : "+result);
			break;
			
		case 3:
			result = cal.multiply(a, b);
			System.out.println("결과 : "+result);
			break;
			
		case 4:
			double resultD = cal.divide(a, b);
			System.out.println("결과 : "+resultD);
			break;
			
		}
		*/
		
		
		System.out.println("< return값 없이 구현 >");
		System.out.println("a = 10, b = 5");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("5. 모두 출력");
		System.out.println("원하는 번호를 입력하세요.");
		
		int choice2 = scan.nextInt();
		double[] num = new double[4];
		
		switch(choice2) {
		case 1:
			cal.add2(a, b);
			break;
			
		case 2:
			cal.subtract2(a, b);
			break;
			
		case 3:
			cal.multiply2(a, b);
			break;
			
		case 4:
			cal.divide(a, b);
			break;
			
		case 5:
			cal.calProcess(num, a, b);
			System.out.println("더하기 : "+num[0]);
			System.out.println("빼기 : "+num[1]);
			System.out.println("곱하기 : "+num[2]);
			System.out.println("나누기 : "+num[3]);
		}
		
		
		
		/*
		System.out.println("< 배열로 결과값 받기 >");
		System.out.println("a = 10, b = 5");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("원하는 번호를 입력하세요.");
		
		double[] num = new double[4];
		int choice2 = scan.nextInt();
		
		switch(choice2) {
		case 1:
			cal.add2(a, b);
			System.out.println("결과 : "+result);
			break;
			
		case 2:
			cal.subtract2(a, b);
			System.out.println("결과 : "+result);
			break;
			
		case 3:
			cal.multiply2(a, b);
			break;
			
		case 4:
			cal.divide(a, b);
			break;
			
		}
		*/
		
		
		
		
	}

}
