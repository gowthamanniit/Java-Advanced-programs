package javapro;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		ll.add("bbb");
		System.out.println(ll);
		
		ll.add(2,"fff");
	
		System.out.println("After Adding"+ll);
		
		ll.addFirst("eee");
		System.out.println("Adding First:"+ll);
		ll.add("aaa");
		ll.addLast("ggg");
		System.out.println("Adding Last:"+ll);
		               
		ll.remove("eee");
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
		
		ll.removeFirstOccurrence("aaa");
		System.out.println(ll);
		
		ll.removeLastOccurrence("bbb");
		System.out.println(ll);
	
		//ll.addAll(1,ll2);
	}

}

