
public class ThreadPriority extends Thread
{
	public void run()
	{
			System.out.println("Priority of thread"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t=new ThreadPriority();
		ThreadPriority t1=new ThreadPriority();
		t.setPriority(MAX_PRIORITY);
		t1.setPriority(MIN_PRIORITY);
		t.start();
		t1.start();
		
		ThreadPriority t2=new ThreadPriority();
		t2.setPriority(6);
		System.out.println("User Prioriry"+t2);
	}

}
