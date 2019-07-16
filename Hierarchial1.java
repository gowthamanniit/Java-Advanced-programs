package javapro;
class  ID 
{
	int reg;
	void regno()
	{
		reg=4546;
	}
	
}
class Emp extends ID
{
	String name1= "Kanna";
	void display1()
	{
		System.out.println(name1);
		System.out.println(reg);
	}
}
class Cus extends ID
{
	String name2= "Tamil";
	void display2()
	{
		System.out.println(name2);
		System.out.println(reg);
	}
}
public class Hierarchial1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		e1.regno();
		e1.display1();
		Cus c1=new Cus();
		c1.regno();
		c1.display2();
			
	}

}
