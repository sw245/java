import java.util.Arrays;

public class C0724_08 {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9};
		int[] arr2 = new int[5];
		
		
		// 얕은 복사 - arr, arr2가 같은 주소를 가지게 됨.
		arr2 = arr;
		
		
		// 깊은 복사
		// 1.
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		
		// 2. arraycopy(원래 배열이름, 첫시작, 복사하는 배열이름, 첫시작, 개수)
		System.arraycopy(arr, 0, arr2, 0, 5);
		
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
