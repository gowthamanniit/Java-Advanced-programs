import java.text.SimpleDateFormat;
import java.util.*;
public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale list[]=SimpleDateFormat.getAvailableLocales();
		Set s1=new TreeSet();
		for(int i=0;i<list.length;i++)
		{
			s1.add(list[i].getDisplayName()+"          "+list[i].toString());
		}
		Iterator it=s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}

}
