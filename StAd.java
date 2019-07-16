package javapro;

import java.util.Scanner;

public class StAd {
	int year;
	Scanner sc=new Scanner(System.in);
	void admission()
	{
		System.out.println("Enter the year:");
		year=sc.nextInt();
		try
		{
		if(year>2015)
			throw new YearException();
		else
			System.out.println("Eligible for Admission");
		}
		catch(YearException e1)
		{
			System.out.println("Exception arised");
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StAd s1=new StAd();
		s1.admission();
	}

}
