
public class SimpleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread();
		System.out.println(t);
		t.setName("MainThread");
		System.out.println("Now Thread Name:"+t);
		
		try {
			t.sleep(5000);
			} catch (InterruptedException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("Now thread after 5 sec");
	}

}
