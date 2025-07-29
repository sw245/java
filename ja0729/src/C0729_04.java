
public class C0729_04 {

	public static void main(String[] args) {

		Data1 d1 = new Data1();    d1.value = 50;    Data2 d2 = new Data2(30);
		
		
	}

}


class Data1{
	Data1(){}	// 생성자 없으면 기본생성자 자동 생성
	int value;
}

class Data2{
	int value;
	Data2(){}		// 기본생성자
	Data2(int x){	// 매개변수가 있는 생성자, 전체생성자
		value = x;
	}
}