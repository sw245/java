import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05 {

	public static void main(String[] args) {
		File f = new File("c:/down/a.txt");
		
	
		try {
			// 2byte 크기를 가져와서 출력함
			FileInputStream fis = new FileInputStream("c:/down/a.txt");
			int read = 0;
			try {
				while((read = fis.read()) != -1) {
					System.out.println((char)read);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 잘 종료되었습니다.");	
			
	}

}
