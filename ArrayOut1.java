package javapro;

public class ArrayOut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]= {1,2,3,4,5,6};
		try
		{
		for(int i=0;i<8;i++)
		{
			System.out.println(list[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
		
			System.out.println("index out of range");
		}
	}

}
