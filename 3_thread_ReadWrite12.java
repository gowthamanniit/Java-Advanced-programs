import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;
 class ReadWrite1 extends Thread
{
	private static final ReentrantReadWriteLock rdwrlock=new ReentrantReadWriteLock();
	public void run()
	{
		try
		{
			readData();
			Thread.sleep(3000);
			writeData();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	private void readData() {
		// TODO Auto-generated method stub
		try
		{
			rdwrlock.readLock().lock();
			System.out.println(Thread.currentThread().getName()+" is reading and the value is 5");
		}
		finally
		{
			System.out.println(Thread.currentThread().getName() +"is existing after reading");
		}
	}
	private void writeData() {
		// TODO Auto-generated method stub
		try
		{
			rdwrlock.writeLock().lock();
			Random rand=new Random();
			int n=rand.nextInt(50);
			System.out.println(Thread.currentThread().getName()+" has the write lock and is writing");
			System.out.println("The new value is :"+(5+n));
		}
		finally
		{
			System.out.println(Thread.currentThread().getName() +"is releasing the lock and existing after writing ");
			rdwrlock.writeLock().unlock();
		}
	}
}
	public class ReadWrite
	{
		public static void main(String[] args) throws Exception 
		{
		// TODO Auto-generated method stub
			ReadWrite1 rw1=new ReadWrite1();
			ReadWrite1 rw2=new ReadWrite1();
			ReadWrite1 rw3=new ReadWrite1();
			rw1.start();
			rw2.start();
			rw3.start();
			
		}

}
