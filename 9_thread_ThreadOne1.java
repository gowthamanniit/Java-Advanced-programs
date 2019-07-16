
public class ThreadOne extends Thread{

	public void run()
	{
		System.out.println("Thread Running");
	//	System.out.println("--->"+Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			System.out.println(i +" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadOne t1=new ThreadOne();
		ThreadOne t2=new ThreadOne();
		System.out.println("Before starting "+t1.isAlive());
		System.out.println("-->"+t1.getName());
		t1.start();
		System.out.println("After start "+t1.isAlive());
		t1.join(1000);
		System.out.println("-->"+t2.getName());
		System.out.println("Current Running"+currentThread().getName());
		System.out.println("ID of t1:"+t1.getId());
		
		t2.start();
	}

}


