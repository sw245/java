import java.io.File;
import java.io.IOException;

public class C08 {

	public static void main(String[] args) {

		File f = new File("c:/down/abc.txt");
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	// 파일 생성
			System.out.println("파일이 생성되었습니다.");
		}else {
			System.out.println("파일이 존재합니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
