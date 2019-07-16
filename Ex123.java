package javapro;

public class Ex123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2000;
		try 
		{
		if(year<2001)
			throw new YearException();
		else
			System.out.println("Valid");
		}
	
		catch(Exception e)
		{
			System.out.println("Year Exception arised");
		}
	}
}

