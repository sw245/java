import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성할 파일의 이름을 입력하세요.");
		String fileName = sc.next();
//		System.out.println("c:/down/"+fileName);
		
		File f = new File("c:/down/"+fileName);
		if(f.exists()) {
			System.out.println("이미 있는 파일 이름입니다.");
		}else {
			try {
				f.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("파일 생성에 실패했습니다.");
			}
			
		}
		
	}

}
