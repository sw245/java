import java.util.Arrays;
import java.util.Comparator;

public class C0804_03 {

	public static void main(String[] args) {

		Integer[] A = new Integer[10];
		int[] a = new int[10];
		
		a[0] = 9;
		a[1] = 5;
		a[2] = 3;
		a[3] = 10;
		a[4] = 7;
		a[5] = 1;
		a[6] = 2;
		a[7] = 4;
		a[8] = 6;
		a[9] = 8;
		
		Arrays.sort(a);	// 순차정렬
		Comparator comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
			
		};
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
