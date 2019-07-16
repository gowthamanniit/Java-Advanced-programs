package javapro;

import java.util.Scanner;

/* assertion-
 * to restrict the user, it is not hightly recommeded
 */
public class Assert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int value;
	System.out.println("Enter");
	Scanner sc=new Scanner(System.in);
	value=sc.nextInt();
	assert value>=20 : "not valid";
	System.out.println("Valid");
	}

}
