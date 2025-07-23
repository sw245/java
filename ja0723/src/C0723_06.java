import java.util.Scanner;

public class C0723_06 {

	public static void main(String[] args) {
		/*
		// 중첩 for문 - 구구단
		for(int i=2; i<=9; i++) {
			System.out.printf("[ %d 단 ]\n",i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
		*/
		
		
		/*
		// 2개 숫자 입력, 두 수와 사이의 단 수 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2부터 9까지의 숫자 중 하나를 입력하세요.");
		int m = scan.nextInt();
		System.out.println("2부터 9까지의 숫자 중 다른 하나를 입력하세요.");
		int n = scan.nextInt();
		
		if(m > n) {
			int temp;
			temp = m;
			m = n;
			n = temp;
		}
		
		for(int i=m; i<=n; i++) {
			System.out.printf("[ %d 단 ]\n",i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
		*/
		
		/*
		// 3중첩
		
		for(int i=0; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=9; k++) {
					System.out.println(""+i+j+k);
				}
			}
		}
		*/
		
		/*
		// 구구단을 출력
		
		for(int k=2; k<=9; k++) {
			System.out.printf("[ %d 단 ]\t\t",k);
		}
		System.out.println();
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.printf("%d X %d = %d\t",i,j,i*j);
			}
			System.out.println();
		}
		*/
		
		
		// * 찍기
		/*
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		System.out.printf("[%5d]\n",5);
		System.out.printf("[%05d]\n",5);
		
		for(int i=1; i<=100; i++) {
			System.out.printf("[%03d]\n",i);
		}
		*/
		
		int a = 077;
		
		System.out.println(a);
		
		String str = String.format("%03d",a);
		System.out.println(str);
		
		
	}

}
