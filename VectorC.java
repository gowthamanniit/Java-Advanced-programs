package javapro;

import java.util.*;
public class VectorC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v1=new Vector<String>();
		v1.add("red");
		v1.add("blue");
		v1.add("green");
		v1.add("green");
		System.out.println(v1);
		
		//check size and capacity
		System.out.println("Size"+v1.size()); // no.of elements that currently hold
		System.out.println("Capasity:"+v1.capacity());//no of elements which can maximum hold.
		
		v1.addElement("yellow");
		v1.addElement("Orange");
		System.out.println("Size"+v1.size());
		System.out.println("Capasity:"+v1.capacity());
		
		if(v1.contains("red"))
		{
			System.out.println("REd color is present:"+v1.indexOf("red"));
			
		}
		else
		{
			System.out.println("Not present");
		}
		
		System.out.println("The last Element:"+v1.lastElement());
		System.out.println("First Element  "+v1.firstElement());
		
		System.out.println("Remove at index:"+v1.remove(3));
		System.out.println(v1);
		
		System.out.println("Hash code "+v1.hashCode());
		// hash code is an unique id no allocated to an object by JVM
		System.out.println("Element "+v1.get(1));
	
	}

}

/*
 * i=10;
 * printf(%d%d%d",i,++i,i++);
 */
