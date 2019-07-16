package javapro;
class milk
{
	int m;
	milk()
	{
		m=20;
	}
		void pay()
		{	
			System.out.println("milk is pure");
		}
	}
public class ConsInher extends milk 
{
	void cost()
	{
		System.out.println("cost is"+" "  +m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsInher i1=new ConsInher();
		i1.pay();
		i1.cost();
	}

}
