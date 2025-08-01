
public class C01 {

	public static void main(String[] args) {
		
//		MServiceImpl mServiceImpl = new MServiceImpl();
		MServiceImpl2 mServiceImpl = new MServiceImpl2();
		
		mServiceImpl.selectAll();
		mServiceImpl.selectOne();;
		
		
//		MService mService = new MServiceImpl();
		MService mService = new MServiceImpl2();

		mService.selectAll();
		mService.selectOne();
		
		
	}

}
