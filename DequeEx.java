package javapro;

import java.util.ArrayDeque;
import java.util.Deque;

/*Unlike queue, we can add and remove from both sides.
 * null elements are not allowed in deque
 * no capasity restriction
 * faster than linked list and arraylist
 */
public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String> dq=new ArrayDeque<String>();

	dq.add("abc");
	dq.add("cef");
	dq.add("qwe");
	dq.add("ngh");

	dq.add("ijk");
	
	System.out.println(dq);
	
	dq.pop();
	System.out.println(dq);
	
	dq.pollFirst();
	System.out.println(dq);
	
	dq.offerFirst("www");
	System.out.println(dq);
	
	
	}

}
