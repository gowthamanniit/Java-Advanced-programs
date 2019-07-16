package javapro;

import java.util.Scanner;

class Shop1
{
String name;
String products[] = new String[100];
int rate[] = new int [100];
Scanner sc = new Scanner (System.in);

void input()
{
	System.out.println("enter the name");
	name = sc.next();
	System.out.println("enter the products");
	for(int i=0;i<3;i++)
	{
		products[i] = sc.next();
	}
	System.out.println("enter the rate");
	for(int i=0;i<3;i++)
	{
		rate[i] = sc.nextInt();
	}	
}
}
class Product1 extends Shop1{
int total=0;
void add() 
{
		for(int i=0;i<3;i++)
		{
			    total = total+rate[i];
				System.out.println(total);
		}
		if(total>5000)
		{
			System.out.println("get a coupen");
		}
}
}
public class Shopping1 extends Product1{
	void come_again()
	{
		System.out.println("Thanks for coming" + name);
	}
	public static void main(String[] args) 

	{
		// TODO Auto-generated method stub
		Shopping1 s = new Shopping1();
		s.input();
		s.add();
		s.come_again();
	}
}

