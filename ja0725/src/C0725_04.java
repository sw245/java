import java.util.Scanner;

public class C0725_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("번호를 입력하세요.");
		int input = scan.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("[ 성적입력 ]");
			break;
		case 2:
			System.out.println("[ 성적출력 ]");
			break;
		case 3:
			System.out.println("[ 성적수정 ]");
		}
		
		
		/*
		if(input%2==0) System.out.println("짝수");
		else System.out.println("홀수");
		
		
		if(input>0) System.out.println("양수");
		else if(input==0) System.out.println("0");
		else System.out.println("음수");
		*/
		
	}

}
