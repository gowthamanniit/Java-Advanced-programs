package javapro;

import java.lang.reflect.Method;

public class ClassNot {
public ClassNot()
{
	Class c;
	try
	{
		c=Class.forName("single");
		Method m[]=c.getDeclaredMethods();
		System.out.println(m[0].toString());
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassNot();
	}

}
