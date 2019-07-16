package javapro;
/*List--> ArrayList, LinkedList, Vector
 * ArrayList-->
 * No order, dupilcated allow
 * 
 */
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(365);
		al.add(240);
		al.add(543);
		al.add(240);
		System.out.println(al);
		
		//Iterator interface
		/*Iterator itr1=al.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}*/
		
		//for each
		
	/*	for(Integer it:al)
		{
			System.out.println(it);
		}*/
		
		//through ListIterator
		/*ListIterator<Integer> list1=al.listIterator(al.size());
		while(list1.hasPrevious())
		{
			Integer in=list1.previous();
			System.out.println(in);
			
		}*/
		
		//for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}

}
