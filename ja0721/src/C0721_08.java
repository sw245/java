import java.util.Scanner;

public class C0721_08 {

	public static void main(String[] args) {
		
		// print() >> System.out.println();
		
		// input() ??
		// 화면에서 입력받기 > Scanner
		
		
		
//		java.util.Scanner scan = new java.util.Scanner(System.in);	// import 없이 사용 시 구문
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.println("숫자를 입력하세요.");
		
		// next(), nextLine(): 문자열		// 엔터 키('\n')를 포함해서 받을 수 있음
		// nextByte(), nextShort(), nextInt(), nextLong(): 정수형
		// nextFloat(), nextDouble(): 실수형
		int num = scan.nextInt();
		
		scan.nextLine();	// 다음 라인이 nextLine() 같은 경우 엔터 키 입력 방지를 위해 넣음
		
		System.out.println("입력한 숫자 : "+num);
		System.out.println("숫자2를 입력하세요.");
		
//		String str = scan.next();	// space 이전까지만 입력받을 수 있음
		String str = scan.nextLine();
		
		int num2 = Integer.parseInt(str);	// 문자열을 int타입의 변수로 변환
		
		
		System.out.println("숫자 더하기 : "+(num+num2));
		
		
		
//		String str = "abc";					// String은 일반 변수처럼 선언 가능 (예외)
//		String str2 = new String("abc");	// 원래의 String 클래스 객체 선언 구문
		

	}

}
