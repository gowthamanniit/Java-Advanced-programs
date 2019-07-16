class Customer
{
	int amount=10000;
	synchronized void withdraw(int amount1)
	{
		System.out.println("Going to withdraw");
		if(amount<amount1)
		{
			System.out.println("Less balance, waiting to deposit");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		amount-=amount1;
		System.out.println("Withdraw completed");
	}

synchronized void deposit(int amount1)
{
	System.out.println("Goint to deposit");
	amount+=amount1;
	System.out.println("Deposit completed");
	notify();
}
}
public class InterComm 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c=new Customer();
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
	}

}
