import java.util.Scanner;

public class C0723_04 {

	public static void main(String[] args) {
		
		// 반복문 - for, while
		
		/*
		// for
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}	// 0,1,2,3,4,5,6,7,8,9 출력 / 출력 이후 i의 값은 10
		
		
		// while
		int j = 0;
		while(j<10) {
			System.out.println(j);
			j++;
		}
		
		
		// do-while문 - 최초 1번 반드시 동작
		int k=0;
		do {
			System.out.println(k);
			k++;
		}while(k<10);
		*/
		
		
		
		/*
		// 1-10 합 > 55 / 1-100 합 > 5050 / 1-1000 합 > 500500 / 1-10000 합 > 50005000
		int sum = 0;
		int i;
		for(i=1; i<=10; i++) {
//			System.out.println(i);
			sum += i;
		}
//		System.out.println(i);	// for문 안에서 선언된 변수는 for문 밖에서 유지되지 않음
		System.out.printf("[ 1 ~ %d까지의 합 : %d ]\n",(i-1),sum);
//		System.out.println("합계 : "+sum);
		*/
		
		/*
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		*/
		
		/*
		// 무한반복
//		for(;;) {
//			
//		}
		
//		for(int i=0;;i++) {
//			System.out.println(i);
//		}
		
		
		while(true) {
			
		}
		*/
		
		/*
		int a = 1;
		int b = 2;
		int c,d = 0;
		int e=0, f=10;
		// 같은 타입의 경우 한 줄로 변수 선언 처리 가능
		*/
		
		// 숫자 맞추기 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		int r = (int)(Math.random()*10) + 1;
		
		for(int i=0; i<5; i++) {
			System.out.printf("[ %d번째 시도 ]\n",(i+1));
			System.out.println("1부터 10까지의 숫자를 하나 입력하세요.");
			double d_input = scan.nextDouble();
			int input = (int)d_input;
			
			if(input > 10 || input < 1) {
				System.out.println("잘못된 입력입니다.");
			}else if(input == r) {
				System.out.println("정답입니다.");
				break;
			}else if(input > r) {
				System.out.println("입력한 값이 답보다 큽니다.");
			}else if(input < r) {
				System.out.println("입력한 값이 답보다 작습니다.");
			}
			
			if(i==4) {
				System.out.println("정답 : "+r);
			}
			
		}
		
		
		
		
	}

}
