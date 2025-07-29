
public class MyMath {
	
	static long c;		// 클래스 변수
	long a, b;	// 인스턴스 변수 - 자동초기화됨
	
	long add() {	// 인스턴스 메서드  static 없음
		int d = 0;	// 지역변수 - 값을 입력해야 함. 자동초기화 안 됨
		return a + b;
	}
	
	static long add(long a, long b) {	// 클래스 메서드
		return a + b;
	}
	
}
