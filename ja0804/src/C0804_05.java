import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C0804_05 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		
		// HashMap >> 자체 Iterator가 없음? >> Set으로 변환해서 출력
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 또는 키 입력으로 값 출력
		
		System.out.println(map.get("aaa"));
		
		if(map.containsKey("bbb")) {
			System.out.println("bbb");
		}
		
	}

}
