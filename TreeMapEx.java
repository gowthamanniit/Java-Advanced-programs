package javapro;

import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(101,"Ram");
		tm.put(103,"Ravi");
		tm.put(105, "Radha");
		tm.put(104, "Poorna");
		tm.put(102,"Ragav");
		tm.put(105, null);
		tm.put(120, null);
		
		System.out.println(tm);
		System.out.println("Descending Order :"+tm.descendingMap());
		
		System.out.println("head Map: "+tm.headMap(102,true)); // returns less than or equal to specified key
		
		System.out.println("Tail map :"+tm.tailMap(102,true)); //return more than or equal to specified key
		
		System.out.println("Sub map  :"+tm.subMap(102, true,104,true)); // in between specified key
	}

}
/*Storing key-value pairs in sorted order., unique elements, cannot have null key,but can 

have multiple null values, ascending order.*/