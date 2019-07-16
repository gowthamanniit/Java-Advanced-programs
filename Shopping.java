package javapro;

import java.util.Scanner;

class shop{
String name;
String products[] = new String[100];
int rate[] = new int [100];
void input()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the name");
	name = sc.next();
	System.out.println("enter the products");
	for(int i=0;i<3;i++)
	{
		products[i] = sc.next();
	}
	System.out.println("enter the rate");;
	for(int i=0;i<=2;i++)
	{
		rate[i] = sc.nextInt();
	}	
}
class Product extends shop{
int total=0;
void add() 
{
		for(int i=0;i<=2;i++)
		{
			    total = rate[i]+total;
				System.out.println(total);
		}
		if(total>5000)
		{
			System.out.println("get a coupen");
		}
}
}
public class Shopping extends Product{
	void come_again()
	{
		System.out.println("Thanks for coming" + name);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Shopping s = new Shopping();
		s.input();
		s.add();
		s.come_again();
	}
}
