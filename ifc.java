package javapro;
interface bike123
{
	void register();
	void horn();
}
interface censor12 
{
	void enable();
}
/*class kingbike12
{
	void admin()
{
	System.out.println("new bike launched");
	}
}*/
public class ifc implements censor12,bike123{

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("bike got registered");
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		System.out.println("bike got fixed");
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		System.out.println("All censors got enabled");
	}
	

//public class ifc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifc if1=new ifc();
		//if1.admin();
		if1.register();
		if1.horn();
		if1.enable();
	}

}
