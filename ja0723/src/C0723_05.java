import java.util.Scanner;

public class C0723_05 {

	public static void main(String[] args) {
		/*
		// 1~10 숫자의 합을 출력하시오.
		
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		
		System.out.println("합계 : "+sum);
		*/
		
		
		
		// 두 수 입력, 두 수와 두 수 사이의 모든 정수의 합
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		double d_input1 = scan.nextDouble();
		int input1 = (int)d_input1;
		System.out.println("두번째 숫자를 입력하세요.");
		double d_input2 = scan.nextDouble();
		int input2 = (int)d_input2;
		
		if(input2 > input1) {
			int temp;
			temp = input1;
			input1 = input2;
			input2 = temp;
		}
		
		int sum = 0;
		for(int i=input2; i<=input1; i++) {
			sum += i;
		}
		
		int sum_from1 = 0;
		for(int i=1; i<=(input1 - input2); i++) {
			sum_from1 += i;
		}
		
		int sum2 = input2 * (input1 - input2 + 1) + sum_from1 ;
		
		
		System.out.println("두 수와 두 수 사이의 모든 정수의 합 : "+sum);
		System.out.println("더 빠른 방법? > "+sum2);
		
		
		
		// 1~100 합 출력 , 특정 합에서 멈추기
		
		/*
		int i = 1;
		int sum = 0;
		for(i=1; i<=100; i++) {
			sum += i;
			
			if(sum>500) {
				break;
			}
		}
		
		System.out.println(i-1);
		System.out.println(sum-i);
		*/
		
		
	}

}
