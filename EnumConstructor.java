package javapro;
enum Names
{
	Park(65),Lavs(54),Abi(57),Niva(70),Kicha(60),Selami(58);
	int rollno;
	Names(int rollno)
	{
		this.rollno=rollno;
	}
}

public class EnumConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Names n1:Names.values())
		{
			System.out.println(n1 +" "+n1.rollno);
		}
	}

}
