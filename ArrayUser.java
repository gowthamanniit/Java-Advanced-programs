package javapro;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(1001,"Kayal");
		Student1 s2=new Student1(1002,"Balaji");
		
		ArrayList<Student1> al=new ArrayList<Student1>();
		ArrayList<Student1>a2=new ArrayList<Student1>();
		
		al.add(s1);
		//System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student1 s11=(Student1)itr.next();
			System.out.println(s11.regno+ " "+s11.name);
			
		}
		a2.add(s2);
		Iterator itr1=a2.iterator();
		while(itr1.hasNext())
		{
			Student1 s12=(Student1)itr1.next();
			System.out.println(s12.regno+" "+s12.name);
		}
	}

}
