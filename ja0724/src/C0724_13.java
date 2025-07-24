import java.util.Scanner;

public class C0724_13 {

	public static void main(String[] args) {
		
		int[] num = new int[25];
		String[][] arr = new String[5][5];
		
		// 1-25까지 숫자 입력, 랜덤으로 번호 섞어서 arr 배열에 입력해서 출력
		
		// num에 숫자 입력
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		// num 숫자 섞기
		int temp;
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<num.length; i++) {
				int r = (int)(Math.random()*25);
				temp = num[i];
				num[i] = num[r];
				num[r] = temp;	
			}			
		}
		
		// arr에 섞은 숫자(num) 넣기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = num[5*i + j] + "";
			}
		}
		
		
		// arr 출력 및 입력한 숫자 X표시
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {

				System.out.println("[ 5 X 5 배열 ]");
				System.out.println("--------------------------------------------------");
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println("--------------------------------------------------");
				System.out.println("원하는 번호를 입력하세요.");
				
				String input = scan.next();
				
				X: for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						if(input.equals(arr[i][j])) {
							arr[i][j] = "X";
							break X;
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
