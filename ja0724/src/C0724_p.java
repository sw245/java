import java.util.Arrays;

public class C0724_p {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		int j = 0;
		for(int i : arr) {
			i = ++j ;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
