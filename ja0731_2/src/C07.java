import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C07 {

	public static void main(String[] args) throws IOException {	// throws 비권장

		FileReader fr = new FileReader("c:/down/a.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		
		
		System.out.println("프로그램이 잘 종료되었습니다.");
	}

}
