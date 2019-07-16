package javapro;
interface inf1
{
	void method1();	
}
public class Interface12 implements inf1{
	@Override
	public
	 void method1() {
		// TODO Auto-generated method stub
		System.out.println("Interface executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface12 i12=new Interface12();
		i12.method1();
	}}


//In interface, method can only be defined, it has to be implemented in class 