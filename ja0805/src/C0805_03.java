import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class C0805_03 {

	public static void main(String[] args) throws Exception {

		
		// BufferWriter, FileWriter 사용
		FileWriter fw = new FileWriter("c:/aaa/a0805_02.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String[] str = {
				"1,홍길동,100,100,100,300,100.0\n",
				"2,유관순,90,90,90,270,90.0\n",
				"3,이순신,80,80,80,240,80.0\n",
				"4,강감찬,100,100,99,299,99.3\n"
		};
		
		
		for(int i=0; i<str.length; i++) {
			bw.write(str[i]);
		}
		bw.close();
		fw.close();
		
		
		System.out.println("done");
		
		
		/*
		// ------ BufferReader, FileReader 사용
		String fileName = "c:/aaa/a0805.txt";
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
			
		}
		*/
		
		/*
		// ----- FileReader 사용
		String fileName = "c:/aaa/a0805.txt";
		try {
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			while((data = fr.read()) != -1) {
				System.out.println((char)data);
			}
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		*/
		
	}

}
