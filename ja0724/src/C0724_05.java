import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C0724_05 {

	public static void main(String[] args) {
		
		int[] input = new int[6];
		Integer[] input2 = {3,45,23,9,16,7};
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i<input.length; i++) {
			System.out.printf("%d 번째 입력 : \n",i+1);
			input[i] = scan.nextInt();
		}
		
		Arrays.sort(input);		// 순차정렬 - input의 배열을 바로 수정함 (보이는 것만 정렬 된 게 아님)
//		Arrays.sort(input,Collections.reverseOrder());	// 기본타입은 역순정렬 안 됨. 객체타입만 가능 
		Arrays.sort(input2,Collections.reverseOrder());	// 기본타입은 역순정렬 안 됨. 객체타입만 가능 
		System.out.println("입력번호 : "+Arrays.toString(input));
		System.out.println("입력번호 : "+Arrays.toString(input2));
		
		
	}

}
