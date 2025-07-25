
public class C0725_07 {

	public static void main(String[] args) {
		
		/*
		// 2차원 배열
		
		int[][] score = new int[5][3];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				score[i][j] = (3*i) + j + 1;
				System.out.printf("%-2d ",score[i][j]);
			}
			System.out.println();
		}
		*/

		
		// 1차원배열 1-25 입력
		// 랜덤섞기 출력
		
		int[] arr = new int[25];
		System.out.print("순차출력 : ");
		for(int i=0; i<25; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int temp;
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<25; i++) {
				int r = (int)(Math.random()*25);
				temp = arr[i];
				arr[i] = arr[r];
				arr[r] = temp;
				
			}			
		}
		
		System.out.print("랜덤번호 : ");
		for(int i=0; i<25; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n");
		
		// 2차원배열에 랜덤번호 입력
		
		int[][] arr_2 = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr_2[i][j] = arr[(i*5) + j];
				System.out.print(arr_2[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		// 2차원배열 입력 없이 그냥 5 X 5 출력
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[5*i + j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
