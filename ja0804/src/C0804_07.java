import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C0804_07 {

	public static void main(String[] args) throws Exception {

		
	File f = new File("c:/aaa/a1.jpg");
	
	FileInputStream fis = new FileInputStream(f);
	FileOutputStream fos = new FileOutputStream("c:/bbb/a2.jpg");
	
	
	while(true) {
		int read = fis.read();
		if(read == -1) break;
		fos.write(read);
	}
	
	fis.close();
	fos.close();
	
	System.out.println("파일 복사 완료");
		
		
		
		/*
		File f = new File("c:/aaa/a1.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f);
			int read = 0;
			while((read = fis.read()) != -1) {
				System.out.print((char)read);
			}
			System.out.println();
			fis.close();
			
			
		} catch (Exception e) {	e.printStackTrace(); }
		
		System.out.println("프로그램 종료.");
		*/
		
		
	} // main

} // class
