package callflowdynamicallypoc;
import java.lang.Thread;

public class GetThread  implements Runnable{

	static long getThread() {
		return  Thread.currentThread().getId();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
