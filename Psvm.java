package javapro;

public class Psvm {

	public static void main(String args[]) //Passing data at main function 
	{
		// TODO Auto-generated method stub
		System.out.println("Parent*** class");
		
	}
 /*	public static void main(int args[])    //overload , is possible , still JVM call psvm(st args[])
	{
		System.out.println("child class");
	}*/
	class Stv extends Psvm                // inheritance is possible, still JVM execute Parent class
	{
		void ta()
		{
		System.out.println("Child class");
		}
	}

}
