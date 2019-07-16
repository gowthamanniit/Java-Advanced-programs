package javapro;

import java.util.Scanner;

class Apple
{
	String name;
    Scanner sc=new Scanner(System.in);
    void multilevel()
    {
    	name="arsath";
    }
}
class Bird extends Apple
{
	int no;
	void adhar()
	{
		no=10;
		System.out.println("name have added in adhar card"+name);
	}
}
class C extends Bird
{
	  void pan()
	  {
		  System.out.println(no);
	  System.out.println("name have added in pan card:"+name);
	
	  }
}

public class MultiLevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		c1.multilevel();
		c1.adhar();
		c1.pan();
		
		
	}

}
