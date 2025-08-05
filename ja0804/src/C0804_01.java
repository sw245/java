import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class C0804_01 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add(1); 
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(2);
		set.add(1);
		
		
		// set은 순서가 없어서 무조건 Iterator를 사용해야 함.
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		ArrayList list = new ArrayList();	// 컬렉션 중 List - 순서가 있음
		
//		for(int a=0; a<10; a++) {
//			list.add(a+1);
//		}
		
		
		
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		list.add(100);	// Integer클래스로 추가됨
		list.add(1);	
		list.add(5);	
		list.add(2);

		
		// 원래 컬렉션 출력은 Iterator를 사용해야 함
		Iterator it = list.iterator();	
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		};
		
		/*
		list.add(5);	
		list.add(6);	
		list.add(7);	
		list.add(8);	
		list.add(9);	
		list.add(10);
		list.add(11);	// ArrayList의 공간이 자동으로 10개 추가됨
		 */
		
		
		
		/*
		// 인터페이스 - 전부 추상메서드인 클래스
		List list2 = new ArrayList();	// 인터페이스는 객체선언 불가	>> 다형성 이용
		
		int[] list3 = new int[10];
		list3[0] = 1;
		list3[1] = 2;
		list3[2] = 3;
		*/
		
		
		
	}

}
