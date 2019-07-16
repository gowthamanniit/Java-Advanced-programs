package javapro;
interface Member
{
	void para();
}
public class abupro {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member()
				{
					public void para()
					{
						System.out.println("typewriting");
					}
				};
				m1.para();
	}

}
