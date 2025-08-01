
public class C0801_05 {

	public static void main(String[] args) {
		
		String[] a = { "a.txt", "b.txt", "cc.txt", "abc.png", "taasd.jpg", "rtrasd.png", "asd.png" };
		int txt_count = 0;
		int png_count = 0;
		int jpg_count = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i].endsWith("txt")) {
				txt_count++;
			}else if(a[i].endsWith("png")){
				
			}
		}
		System.out.println("텍스트 파일의 개수는 "+txt_count+"개입니다.");
	}

}
