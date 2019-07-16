package javapro;

import java.util.Scanner;

class single
		{
		
		long phno;
		String name;
		Scanner Sc=new Scanner("System.in");
		void details()
		{
			System.out.println("enter the number:");
			name=Sc.nextLine();
			System.out.println("enter the phonenumber:");
			phno=Sc.nextLong();
		}
	}
	 class inheritence extends single{
			int salary;
			void sal()
			{
				System.out.println("enter the salary:");
				salary=Sc.nextInt();
			}
		
	 }
public class name1 extends inheritence{
	void display()
	{
		System.out.println("name:"+name);
		System.out.print("phonenumber:"+phno);
		System.out.println("salary:"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//inheritence i1=new inheritence();
		name1 i1=new name1();
		
				i1.details();
				i1.sal();
				i1.display();
	}
				
	}


