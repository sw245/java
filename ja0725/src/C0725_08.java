import java.util.Arrays;
import java.util.Scanner;

public class C0725_08 {

	public static void main(String[] args) {

		// 로또번호 맞추기
		
		int[] num = new int[45];
		
		// 번호 넣기
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		
		int temp;
		
		
		for(int i = num.length - 1; i>0; i--) {
			int r = (int)(Math.random()* (i+1));
			temp = num[i];
			num[i] = num[r];
			num[r] = temp;
			
		}
		
		
		int[] lotto = new int[6];
		int[] mynum = new int[6];
		
		System.arraycopy(num, 0, lotto, 0, 6);
		
		
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			
			System.out.printf("로또번호를 입력하세요. (%d/6)\n",i+1);
			mynum[i] = scan.nextInt();
		}
		
		int[] wins = new int[6];
		
		int count = 0; 
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(mynum[i]==lotto[j]) {
					wins[count] = mynum[i];
					count++;
					break;
				}
			}
		}
		
		
		System.out.print("입력번호 : ");
		System.out.println(Arrays.toString(mynum));
		System.out.print("로또번호 : ");
		System.out.println(Arrays.toString(lotto));
		System.out.print("맞힌 번호 : ");
		for(int i=0; i<count-1; i++) {
			System.out.print(wins[i]+" ");
		}
		
		/*
		// 번호 섞기 >> 무작위성 테스트
		
		
		int[] count = new int[25];
		int temp;
		for(int k=0; k<10000; k++) {
			
			
			for(int i=0; i<num.length; i++) {
				num[i] = i+1;
			}
			
			
			for(int j=0; j<10; j++) {
				for(int i=0; i<num.length; i++) {
					int rannum = (int)(Math.random()*25);
					temp = num[i];
					num[i] = num[rannum];
					num[rannum] = temp;
				}			
			}
			
			count[num[0]-1]++;
			
		}
		
		System.out.println(Arrays.toString(count));
		
		// gpt 추천
		// 최소 366, 최대 448
		// 강사님
		// 최소 360, 최대 443
		// 내 거
		// 최소 342, 최대 444		-3
		
		// 최소 370, 최대 422		-100
		// 최소 359, 최대 440		-100
		
		*/
		
		
		
		
//		System.out.println(Arrays.toString(num));
		
		
	}

}
