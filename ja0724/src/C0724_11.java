import java.util.Scanner;

public class C0724_11 {

	public static void main(String[] args) {
		
		String[] name = {
				"홍길동","유관순","이순신","강감찬","김구",
				"김유신","홍길자","홍길순","관순스","순신스",
				"love","same","Java","javascript","python",
				"PYTHON","JAVA","C","c++","Love","LOVE"
		};
		
		
		// .contains() : 문자열에 해당 단어가 있는지 확인 - true, false
		// .toLowerCase() : 문자열을 소문자로 치환
		
		
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {

				System.out.println("찾고자 하는 이름을 입력하세요.");
				String search = scan.next();
				
				for(int i=0; i<name.length; i++) {
					if(name[i].toLowerCase().contains(search)) {
						System.out.println(name[i]);
					}
				}
			}
		}
		
	}

}
