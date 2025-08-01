import java.util.ArrayList;
import java.util.List;


public class C0801_07 {

	public static void main(String[] args) {

		
		// 제너릭: 특정 객체만 입력 가능하도록 제어
		
//		ArrayList<Person> list = new ArrayList<Person>();
		// <Person> : Person 타입만 추가할 수 있음.
		//  		> 조상 클래스를 등록하면 자손 객체도 추가 가능
		
		
		
//		Person p1 = new Person(10000,"홍길자");
		
		/*
		list.add(p1);
		list.add(new Person(10001));
		list.add(new Person(10002));
		list.add(new Person(10003));
		list.add(new Person(10004));
		list.add(new Person(10005));
		list.add(new Person(10006));
		list.add(new Person(10007));
		*/
		
		/*
		list.add(p1);
		list.add(new Person(10001,"홍길동"));
		list.add(new Person(10007,"유관순"));
		list.add(new Person(10005,"이순신"));
		list.add(new Person(10006,"강감찬"));
//		list.add(new Stuscore());			>> 제너릭 때문에 에러
		list.add(new Person(10008,"김구"));
		list.add(new Person(10002,"유관순"));
		list.add(new Person(10003,"이순신"));
		
		// id 10006 삭제 후 전체 출력
//		list.remove(6);
//		list.remove(4);
		
		
		// id가 10005인 사람을 제거
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).memberId == 10005) {
				list.remove(i);
				break;
			}
		}
		
		
		
		for(int i=0; i<list.size(); i++) {
//			System.out.println((Person)list.get(i));
//			System.out.println(list.get(i));	//  >> object 타입이어도 toString은 작동
			// 아이디와 이름 출력
			System.out.println(list.get(i).memberId + ", " +list.get(i).name);
		}
		*/
		
		
		
		
		
		/*
		// 컬렉션 - List 인터페이스
		
		ArrayList list = new ArrayList();
		
		list.add(1);	// >> Integer타입 
		list.add(2);	 
		list.add(2);	 
		list.add(3);	 
		list.add(6);	 
		list.add(4);	 
		list.add(5);	 
		list.add(2);

		// 삭제
//		list.remove(3);
		
		// 전체 삭제
		list.clear();
		
		// 출력 > iterator 또는 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
//		ArrayList arrList = new ArrayList();
//		List list = new ArrayList();
		*/
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(6);
		
		
		
		int prevSize = list.size();
		
		for(int i=0; i<prevSize; i++) {
			list.remove(0);
		}
		
		
		/*
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		*/
		
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
