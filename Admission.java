package javapro;

import java.util.Scanner;

public class Admission {
	int year;
	Scanner sc=new Scanner(System.in);
	void yearEnquiry()
	{
	
		System.out.println("Enter the year of Student's birth");
		year=sc.nextInt();
		try
		{
		if(year>=2015)		
			throw new YearException();
		else
			System.out.println("Eligible for admission");
		}
		catch(YearException e1)
		{
			System.out.println("The student is under age");
		}
			
	}
	
	public static void main(String arga[])
	{
		Admission a1=new Admission();
		a1.yearEnquiry();
	}

}
