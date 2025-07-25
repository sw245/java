import java.util.Arrays;
import java.util.Scanner;

public class C0725_09 {

	public static void main(String[] args) {
		
		String[] num = new String[45];
		
		// 5 X 9 출력
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<5; j++) {
				num[5*i + j] = 5*i + j + 1 + "";
				System.out.print(num[5*i + j]+"\t");
			}
			System.out.println();
		}
		
		
		// 섞기
		
		String temp;
		int r;
		
		for(int i= num.length - 1; i>0; i--) {
			r = (int)(Math.random() * (i + 1));
			temp = num[i];
			num[i] = num[r];
			num[r] = temp;
		
		}
		
//		System.out.println(Arrays.toString(num));
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		// 섞은 것 출력
		
		while(true) {
			System.out.println("[ 랜덤번호 출력 ]");
			System.out.println("----------------------------------");
			
			for(int i=0; i<9; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(num[5*i + j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("----------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			String choice = scan.next();
			
			for(int i=0; i<num.length; i++) {
				if(choice.equals(num[i])) {
					num[i] = "X";
					break;
				}
			}
			
			
			
		}
		
		
		
	}

}
