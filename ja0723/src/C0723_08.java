import java.util.Scanner;

public class C0723_08 {

	public static void main(String[] args) {

		// array
		// > 같은 타입의 여러 변수를 하나의 묶음으로 다룸
		
		
		/*
		int score=0, score2=0, score3=0, score4=0, score5=0;
		System.out.println(score);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);
		System.out.println(score5);
		
		int[] s = new int[100];		// 초기값 : 숫자=> 0 / 문자=> null
		
		for(int i=0; i<100; i++) {
			System.out.println(s[i]);
		}
		*/
		
		/*
		// 배열 선언, 값 입력
		
		// 1
		int[] s = new int[6];
		
		for(int i=0; i<6; i++) {
			s[i] = i;
			System.out.println(s[i]);
		}
		
		// 2
		int[] m = {1,2,3,4,5,6};
		
		
		// 3
		int[] n = new int[] {1,2,3,4,5,6};
		*/
		
		/*
		// 공간 100의 배열을 만들고, 1-100의 숫자를 입력해서 출력
		
		int[] a100 = new int[100];
		
		for(int i=1; i<=100; i++) {
			a100[i-1] = i;
//			System.out.println(a100[i-1]);
		}
		
		System.out.println(a100[45]);
		*/
		
		
		// 5개 숫자 입력, 배열에 넣기, 출력
		
		Scanner scan = new Scanner(System.in);
		
		int[] n = new int[5];
		for(int i=0; i<5; i++) {
			System.out.printf("배열에 숫자를 입력하세요 (%d개 째)\n",i+1);
			int input = scan.nextInt();
			n[i] = input;
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("%d ",n[i]);
		}
		
	}

}
