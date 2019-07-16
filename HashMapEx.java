package javapro;

import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100,"Abi");
		hm.put(101,"hari");
		hm.put(102,"Mohammed");
		hm.put(103,"Antony");
		
		System.out.println("HashMap List:"+hm);

		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		hm.remove(102);
		System.out.println("After remove:" +hm); //key based
		
		hm.remove(100,"Abi");
		System.out.println(hm);  //key and value
		
		hm.replace(101, "Karthick");
		System.out.println("After replacing 'hari' as 'karthick'"+hm);
		
		hm.replaceAll((k,v)->"vijay");
		System.out.println("After replacing All:"+hm);
		
		
	}

}

