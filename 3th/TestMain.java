import java.util.concurrent.CountDownLatch;

public class TestMain{

	static public native int native_call(int a);	
	static private CountDownLatch mConnectedSignal = new CountDownLatch(1);
	public static void main(String[] args){
		System.out.println(mConnectedSignal);
		mConnectedSignal.countDown();
		System.out.println(mConnectedSignal);
		System.out.println(System.getProperty("java.library.path"));
		System.out.println(native_call(2)+"");
		
		
	}

	static{
		System.loadLibrary("TestMain");
	}
	

}
