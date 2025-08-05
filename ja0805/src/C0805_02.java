import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C0805_02 {

	public static void main(String[] args) throws IOException {
		
		/*
		// 글자 출력
		byte[] b = new byte[1024];
		File f = new File("c:/aaa/a0805.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
			int read = 0;
			while((read = fis.read()) != -1) {
				System.out.println((char)read);	// char로 변환하면 글자를 읽어올 수 있음
				
			}
			fis.read();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	// 폴더, 파일의 존재 확인
		
		System.out.println("프로그램 종료");
		*/

		/*
		// --------------- 파일 복사 -----------------
		File f2 = new File("c:/img/");
		if(!f2.exists()) {
			f2.mkdirs();
		}
		
		// 파일 읽어오기
		FileInputStream fis = new FileInputStream("c:/aaa/a1.jpg");
		// 파일 저장하기
		FileOutputStream fos = new FileOutputStream("c:/img/1.jpg");
		
		while(true) {
			int read = fis.read();
			System.out.println(read);
			if(read == -1) break;
			fos.write(read);
			
		}
		
		fis.close();
		fos.close();
		
		System.out.println("프로그램 종료");
		*/
		
		File f = new File("c:/aaa/a0805_01.txt");
		String content = "1,홍길동,100,100,100,300,100.0";
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(content.getBytes());	// write -> 글자를 byte단위로 분리저장
		
		fos.close();
		System.out.println("글자를 저장합니ㅏㄷ.");
		
		
		
		
	}

}
