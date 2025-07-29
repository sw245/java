
public class RanNum {
	
	static int[] arr = new int[10];	// 클래스 변수 - 객체선언X, 공용, 클래스명.변수명
	int a;

	// (static)클래스 초기화 블럭 - 생성자가 생성되기 전에 실행됨. 객체선언없이 바로 실행.
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			
		}
		
	}
	
}	
	
	
