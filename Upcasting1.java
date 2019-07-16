package javapro;
class Super
{
	void sample()
	{
			System.out.println("Method of super class");
	}
}
public class Upcasting1 extends Super
{
	void sample()
	{
	System.out.println("Method of sub class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Super s1=(Super)new Upcasting1();
		Super s1=new Upcasting1();
		Upcasting1 u1=(Upcasting1)s1;
		
		s1.sample();
		
		
		/*
		  Super obj = new Sub();
      Sub sub = (Sub) obj; sub.Sample();
      */
		
		
	}

}
