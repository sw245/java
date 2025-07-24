
public class C0724_03 {

	public static void main(String[] args) {

		
		//로또번호 생성기
		
//		int lotto = (int)(Math.random()*3) + 1;	// < 안 씀?
		
		// 1~45까지 배열 생성
		int[] num = new int[45];
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		
		// 번호 섞기
		int rnum;
		int temp;	// 임시 저장
		
		
		for(int j=0; j<10; j++) {
			
			for(int i=0; i<45; i++) {
				rnum = (int)(Math.random()*45);
				temp = num[i];
				num[i] = num[rnum];
				num[rnum] = temp;
			}
		}
		
		
		// 번호 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		for(int i=0; i<6; i++) {
			System.out.print(num[i]+" ");
		}
		
	}
	

}
