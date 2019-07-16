package javapro;
import java.lang.*;
public class checkedExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("DataTypes.class");
			System.out.println("This class is inside the package");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
