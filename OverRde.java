package javapro;

class Board1 {

	void write()
	{
		System.out.println("written in board");
	}
}
public class OverRde extends Board1
{
	void write()
		{
			System.out.println("over written");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OverRde r1=new OverRde();
        r1.write();
	}

}
