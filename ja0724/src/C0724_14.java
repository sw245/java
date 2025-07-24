import java.util.Arrays;

public class C0724_14 {

	public static void main(String[] args) {
		// 1차원 배열 -> 1-25까지 순차번호 입력
		// 랜덤으로 번호 섞기
		// 2차원 배열 -> [5][5] 랜덤번호 입력해서 출력
		
		/* 아까 했음 ㅎ */
		
		//
		
		int[] arr = new int[25];	// 0,1만 넣기 (랜덤)
		
		/*
		for(int i=0; i<arr.length; i++) {
			int rnum = (int)(Math.random()*2);
			arr[i] = rnum;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		*/
		
		// 1을 7개만 넣기 후 랜덤
		
		for(int i=0; i<7; i++) {
			arr[i] = 1;
		}
		
		
		
		/*
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
			sum += arr[i];
			if(sum<7) {
				arr[i] = 1;
				sum += arr[i];
			}
		}
		*/
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
