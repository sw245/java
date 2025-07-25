import java.util.Arrays;
import java.util.Scanner;

public class C0725_06 {

	public static void main(String[] args) {
		
		/*
		String str = new String("");
		
		// 배열 >> 객체 생성 구문 
		int[] arr = new int[5];
		arr[2] = 1;
		
		System.out.println(Arrays.toString(arr));
		
		
//		int[] arr = {1,2,3,4,5}; // 값 넣기 위해 재선언 불가
//		arr = {1,2,3,4,5}; // 값만 넣기 불가
		
		int[] arr2 = {1,2,3,4,5};
		int[] arr3 = new int[] {6,7,8,9,10};
		
		
		int[] arr4 = new int[5];
		
		for(int i=0; i<5; i++) {
			arr4[i] = i+1;
		}
		*/
		
		/*
		// 45개 배열 생성, 1~45 숫자 입력
		
		int[] arr45 = new int[45];
		
		for(int i=0; i<45; i++) {
			arr45[i] = i+1;
		}
		
		System.out.println(Arrays.toString(arr45));
		*/
		
		Scanner scan = new Scanner(System.in);
		
		/*
		// 랜덤 숫자 출력 ... (슬롯머신)
		
		while(true) {
			
			
			int rnum2 = (int)(Math.random()*10) + 1;
			int rnum = (int)(Math.random()*10) + 1;
			int rnum3 = (int)(Math.random()*10) + 1;
			
			
			System.out.println(rnum2);
			System.out.println(rnum);
			System.out.println(rnum3);
			
			if(rnum == rnum2 && rnum == rnum3) {
				System.out.println("Jackpot");
			}else if(rnum == rnum2 || rnum == rnum3 || rnum2 == rnum3 ) {
				System.out.println("Lucky");
			}
			
			
			String input = scan.nextLine();
			
			if(input.equals("exit")) break;
			
	
		}
		*/
		
		// 6/45
		
		int[] lotnum = new int[45];
		
		for(int i=0; i<lotnum.length; i++) {
			lotnum[i] = i+1;
		}
		
		
		int temp;
		for(int j=0; j<3; j++) {
			for(int i=0; i<lotnum.length; i++) {
				int rannum = (int)(Math.random()*45);
				temp = lotnum[i];
				lotnum[i] = lotnum[rannum];
				lotnum[rannum] = temp;
			}			
		}
		
//		System.out.println(Arrays.toString(lotnum));
		
		int[] innum = new int[6];
		for(int i=0; i<innum.length; i++) {
			System.out.printf("번호를 입력하세요. (%d/6)\n",i+1);
			innum[i] = scan.nextInt();
		}
		
		int[] lotto = new int[6];
		
		System.arraycopy(lotnum, 0, lotto, 0, 6);
		
		for(int i=0; i<innum.length; i++) {
			
		}
		
		
	}

}
