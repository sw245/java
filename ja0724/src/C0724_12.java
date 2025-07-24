
public class C0724_12 {

	public static void main(String[] args) {
		
		// 1~25까지의 숫자를 입력해서 출력하기
		// 랜덤으로 번호를 섞어 출력하기
		
		
		// 입력
		int[] num = new int[25];
		
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		// 2차원 배열에 입력하기
		int[][] arr2 = new int[5][5];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = num[5*i + j];
			}
		}
		
		
		
		
		// 섞기
		int temp;
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<num.length; i++) {
				int r = (int)(Math.random()*25);
				temp = num[i];
				num[i] = num[r];
				num[r] = temp;
			}
		}
		
		// 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
			
		}
		System.out.println("\n");
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.printf("%-2d ",arr2[i][j]);
			}
			System.out.println();
		}

		
		
	}

}
