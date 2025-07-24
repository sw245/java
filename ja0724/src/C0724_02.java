import java.util.Arrays;

public class C0724_02 {

	public static void main(String[] args) {

		
		
		int[] arr = {1,2,3,4,5};
		int num = 5;
	
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);	// 주소값 출력
		
		
		// num - 기본형 변수 값 복사
		int num2;
		num2 = num;
		System.out.println(num2);
		num = 10;
		System.out.println(num2);
		
		
		
		// arr2 - 배열 값 복사
		int[] arr2 = {0,0,0,0,0};
		System.out.println(Arrays.toString(arr2));	// 0,0,0,0,0
		arr2 = arr;	// >> 얕은 복사 (주소값만 복사) 
		System.out.println(Arrays.toString(arr2));  // 1,2,3,4,5 
		
		arr[0] = 100;
		arr[1] = 200;
		
		System.out.println(Arrays.toString(arr2));  // 100,200,3,4,5
		
		System.out.println(arr2);
	}

}
