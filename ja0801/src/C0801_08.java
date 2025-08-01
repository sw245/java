import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C0801_08 {

	public static void main(String[] args) {

		// 컬렉션
		
		// list - 순서 O, 중복 O 
		// set - 순서 X, 중복 X	>> 두 테이블을 합쳤을 때 동일 값은 한 번만 입력되도록 할 때
		// map - 순서 X, 키 중복 X, 값 중복 O
		
		
		// Set
		// HashSet
		
		HashSet set = new HashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		set.add(6);
		set.add(5);
		set.add(4);

		
		// 순서가 없으므로 for문을 사용해서 출력할 수 없음
		// 출력 >> iterator 사용
		
		// Iterator 객체 선언
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------------");
		while(it.hasNext()) {	// iterator는 일회성임. 한 번 쓰고 나면 다시 선언해야 함...
			System.out.println(it.next());
		}
		
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(4);
		
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
