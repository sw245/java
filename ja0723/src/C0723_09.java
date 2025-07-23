import java.util.Scanner;

public class C0723_09 {

	public static void main(String[] args) {
		
		/*
		int[] score = {10,20,5,2,3};
		
		for(int i=0; i<score.length; i++) {
			System.out.printf("%d ",score[i]);
		}
		*/
		
		// 1~100 랜덤숫자 생성
		// 5번 입력, 업다운 알려주기, 끝난 후 입력한 숫자 배열로 출력, + 정답
		
		Scanner scan = new Scanner(System.in);
		
		int r = (int)(Math.random()*100) + 1;
		int[] arr_in = new int[20];
		int i = 0;
		
		System.out.println("[ 랜덤숫자 맞히기 ]");
		for(i=0; i<arr_in.length; i++) {
			System.out.printf("[ %d번째 시도 ]\n",i+1);
			System.out.println("1부터 100까지의 숫자를 하나 입력하세요.");
			int input = scan.nextInt();
			arr_in[i] = input;
			
			if(input == r) {
				System.out.println("정답입니다.");
				break;
			}else if(input > r) {
				System.out.println("입력값이 큽니다.");
			}else if(input < r) {
				System.out.println("입력값이 작습니다.");
			}
			
			if(i == arr_in.length - 1) {
				System.out.println("정답 : "+r);
			}
			
			
		}
		
		System.out.print("입력한 숫자 : ");
		for(int j=0; j<=i; j++) {
			System.out.printf("%d ",arr_in[j]);
		}
		
	}

}
