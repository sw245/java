import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06 {

	public static void main(String[] args) {
		
		// 파일을 읽어와서 문자로 변환해서 출력하는 방식
		// 문자를 읽어와서 출력하는 방식
		
		try {
			FileReader fr = new FileReader("c:/down/a.txt");
			BufferedReader br =  new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("메모장을 닫습니다.");
		}
		
	}

}
