
public class Person {

	String name;
	String address;
	int memberId;
	
	Person(){}
	
	Person(int memberId){
		this.memberId = memberId;
	}
	
	Person(int memberId, String name){
		this.memberId = memberId;
		this.name = name;
	}
	
	
	
	@Override // 상속에서 메소드를 재정의
	public String toString() {
		getClass().getName();
		return ""+memberId+","+getClass().getName();
	}
	
}
