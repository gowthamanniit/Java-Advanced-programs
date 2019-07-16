/* Collection Framework
 * Set, List, Map
 * Set--> HashSet, TreeSet
 * HashSet- unorder, easily retrieve
 * TreeSet--> order, slow
 * dupilication not allowed 
 * 
 * HashSet<String> hs=new HashSet<>();
 * hs.add("asdfgh");
 * hs.remove("sdasdas");
 * HashSet<String> hs1=new HashSet<>();
 * hs1.add();
 * hs1.add();
 * hs1.add(hs);
 * hs1.clear();
 * 
 * Iterator --> iterator()
 * traverse ,
 * Iterator<String> it1=hs.iterator();
 * while(hs.hasNext()
 * {
 * 	it1.next();
 * }
 * 
 */

package javapro;
import java.util.*;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();	
		set.add("Ram");
		set.add("Ragav");
		set.add("prathi");
		set.add("Ragav");
		set.remove("Ram");
		System.out.println("Set display:"+set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
				System.out.println("Set "+itr.next());
		}
		HashSet<String> set1=new HashSet<String>();	
		set1.add("ravi");
		set1.add("Ragavi");
		set1.add("prathi");
		set.addAll(set1);
		
		Iterator<String>itr1=set1.iterator();
		while(itr1.hasNext())
		{
			System.out.println("Set 1 :"+itr1.next());
		}
		set.removeAll(set1);
	
		System.out.println("After remove set1:"+set);
		set.clear();
		System.out.println("Nothing in the set"+set);
	}
}

