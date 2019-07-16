package javapro;
import java.util.Scanner;
public class StMet1 {
	Scanner sc=new Scanner(System.in);
	String name[]=new String[5];
	int regno[]=new int[5],i;
	String college[]=new String[10];
	void method()
	{
		for(i=0;i<2;i++)
		{
			System.out.println("Enter the name:");
			name[i]=sc.next();
			System.out.println("reg num:");
			regno[i]=sc.nextInt();
			System.out.println("Enter the college:");
			college[i]=sc.next();
			
		}
		for(i=0;i<2;i++)
        {		
        	System.out.println(name[i]);
        	System.out.println(regno[i]);	
    		System.out.println(college[i]);


		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StMet1 s1=new StMet1();
		s1.method();
		//s1.print();
	}
	//int[] age = new int[5];
}
