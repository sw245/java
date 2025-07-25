import java.util.Scanner;

public class C0725_05 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 입력하세요.");
			int input = scan.nextInt();
			
			if(input==0) break;
		}
		
		
		
		
		/*
		// 반복문
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		int i=0;
		sum = 0;
		
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		*/
		
		// 무한반복
//		while(true) {}
//		for(;;) 	{}		// 조건식이 없으면 무한반복
		
		/*
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		*/
	}

}
