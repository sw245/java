import java.util.Scanner;

public class C0725_03 {

	public static void main(String[] args) {

		
		// 콘솔으로 입력받기
		
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 - nextLine(), next()
		// nextLine() : enter, space까지 입력받음 / next() : enter, space 입력받지 못함
		
		System.out.println("이름 입력");
		String a = scanner.next();
		System.out.println("아이디 입력");
//		scanner.nextLine();		// 한 줄을 추가해서 엔터입력 방지
		String b = scanner.nextLine();	// 위의 next()에서 받지 않은 enter가 입력됨
		
		
		// 정수형 - nextInt(), nextByte(), nextShort(), nextLong()
		// 실수형 - nextFloat(), nextDouble()
		
		
		
	}

}
