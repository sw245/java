import java.util.ArrayList;
import java.util.Comparator;

public class C0804_02 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList();
		
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(9);
		list.add(8);
		list.add(6);
		list.add(7);
		list.add(15);
		list.add(12);
		
		
		// 정렬:  list[0] - list[1] 양수이면 자리 바꾸기
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;	// 순차정렬
				return o2 - o1;	// 역순정렬
			}
			
			
		});
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
	} // main

} // class


class DescComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		return (Integer)o2 - (Integer)o1;
	}
	
}