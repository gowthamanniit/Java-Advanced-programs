package javapro;

public class Abstract1 {
	int i,j;
	int k[]=new int[10];
	int a[]= {0,1,2,3};
	String name;
	String name1[]=new String[10];
	String name2[]= {"aaa","bbb","ccc"}; //String literal	//Single dimension
	String name3[][]= new String[][]{{"aaa","bbb"},{"ccc","cvv"}}; //Multi dimension
	void print()
	{
		System.out.println("a:");
		
		for(i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("name2:");
		for(i=0;i<3;i++)
		{
			System.out.println(name2[i]);
		}

		System.out.println("name3:");
		for(i=0;i<2;i++)
		{
				System.out.println("   ");
			for(j=0;j<2;j++)
			{
				System.out.print(name3[i][j]+ "   ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract1 a1=new Abstract1();
		a1.print();
		
	}

}
