package javapro;

//import java.util.Scanner;

public class ConsOver {
	ConsOver(int a)
	{
		System.out.println("A : "+a);
	}
	ConsOver(int a,int b)
	{
		System.out.println("a+b   :" +(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the numbers to pass as argument when object is created.");
		//Scanner sc=new Scanner(System.in);
		//int x=sc.nextInt();
		//int y=sc.nextInt();
		ConsOver n1=new ConsOver(2,3);
		ConsOver n2=new ConsOver(12);
	}

}
/* Driving licence(name, id1, id2,id3)
{

}
DrivingLicence(id1,id2)
{

}
DrivingLic(id1)
{

}*/