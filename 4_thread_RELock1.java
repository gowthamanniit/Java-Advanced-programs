import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReLock implements Runnable{
	final Lock lock=new ReentrantLock();
	String name;
	Thread t;
	public void createThreads(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("Creating new Thread:"+t.getName());
		t.start();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ReLock re=new ReLock();
	re.createThreads("Thread 1");
	re.createThreads("Thread 2");
	re.createThreads("Thread 3");
	
	}
	public void run()
	{
		do
		{
			try 
			{
				if(lock.tryLock(500,TimeUnit.MILLISECONDS))
				{
					try {
						System.out.println(Thread.currentThread().getName()+"Acquire to lock");
					Thread.sleep(1000);
					}
					finally
					{
						lock.unlock();
						System.out.println(Thread.currentThread().getName()+"Released the Lock");
					}
					break;
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+"Could not acquire the lock, need to try for the lock again");
					}
				}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}while(true);
	}

}
