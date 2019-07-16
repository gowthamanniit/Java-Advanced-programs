package javapro;
/* TreeSet- > data stored in order only
 * dupications not allowed 
 * 
 * */
 
import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> ts=new TreeSet<Integer>();
ts.add(102);
ts.add(104);
ts.add(103);
ts.add(104);
System.out.println(ts);
Iterator itr=ts.descendingIterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("fIRST DATA:"+ts.pollFirst());
System.out.println("Last data:"+ts.pollLast());
}

}
