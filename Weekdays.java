package javapro;
import java.util.Scanner;
public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter an integer:");
		n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.print("Sunday"+n);
			break;
		case 2:
			System.out.print("Monday"+n);
			break;
		case 3:
			System.out.print("Tuesday"+n);
			break;
		case 4:
			System.out.print("Wednesday"+n);
			break;
		case 5:
			System.out.print("Thursday");
			break;
		case 6:
			System.out.print("Friday"+n);
			break;
		case 7:
			System.out.print("Saturday"+n);
			break;
		}
		}
		
	}


