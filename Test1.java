package javapro;
import java.util.Scanner;
public class Test1 {
static int a,b;
/*static {						
	//static block
	System.out.println("hai");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
sc.close();
}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		char c[]=new char[20];
		System.out.println("Enter the string");
		name=sc.next();
		c=name.toCharArray();
		for(int i=0,j=1;i<c.length;i++,j++)
		{
			if(c[i]==c[j])
			{
			System.out.println(c[i]);
			}			
		}		
		sc.close();
	}
}
