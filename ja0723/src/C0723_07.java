import java.util.Scanner;

public class C0723_07 {

	public static void main(String[] args) {
		
		
		/*
		int sum = 0;
		int i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println("합계 : "+sum);
		
		
		i = 1;
		sum = 0;
		for(i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("합계 : "+sum);
		*/
		
		
		/*
		// while문
		// 1~100까지의 합을 구하고 500이 넘는 시점의 i, sum 출력
		
		int sum = 0;
		
		int i = 1;
		for(i=1; i<=100; i++) {
			sum += i;
			
			if(sum >= 500) {
				break;
			}
		}
		
		System.out.println("i : "+i);
		System.out.println("sum : "+sum);
		*/
		
		
		/*
		int i = 2;
		
		
		System.out.println("구구단");
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.printf("%d X %d = %d\t",i,j,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
			*/
		
		Scanner scan = new Scanner(System.in);
		
		
		/*
		int r = (int)(Math.random()*100) + 1;
		// 10번 입력받아서 번호 맞추기, 1~100
		
		
		
		
		
		int i = 1;
		
		while(i<=10) {
			System.out.printf("[ %d번째 시도 ]\n",i);
			System.out.println("1부터 100까지의 숫자 중 하나를 입력하세요.");
			int input = scan.nextInt();
			if(input == r) {
				System.out.println("정답입니다.");
				break;
			}else if(input > r) {
				System.out.println("입력값이 큽니다.");
				System.out.printf("입력값 : %d\n",input);
			}else if(input < r) {
				System.out.println("입력값이 작습니다.");
				System.out.printf("입력값 : %d\n",input);
			}
			
			if(i==10) {
				System.out.println("정답 : "+r);
			}
			
			i++;
			
		}
		*/
		
		
		// 입력된 숫자에서 멈추는 프로그램
		
		System.out.println("0부터 출력할 숫자를 입력하세요.");
		int input = scan.nextInt();
		
		System.out.println("1) 짝수만 출력\t2) 홀수만 출력\t3) 모든 수 출력");
		int choice = scan.nextInt();
		
		int i = 0;
		while(true) {
			switch(choice) {
			case 3: case 1:
				System.out.println(2 * i);
				if(choice == 1) break;
			case 2:
				System.out.println((2 * i)+ 1);
			}
			
			if(input == 2*i +1 || input == 2*i) break;

			i++;
			
				
		}
		
			
		
		
		
	}

}
