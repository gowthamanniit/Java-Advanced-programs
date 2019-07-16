package javapro;
class Student<T>
{
	void display(T a)
	{
		System.out.println(a);
	}
}
public class GClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student <String> s1=new Student<>();
		s1.display("Hai");
		Student <Integer> s2=new Student<>();
		s2.display(123);
		Student<Float>s3=new Student<>();
		s3.display(12.44f);

	}

}
