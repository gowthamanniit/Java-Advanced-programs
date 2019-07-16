package javapro;
import java.text.DateFormat;
import java.util.*;

public class DateForm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	                                                   
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,new Locale("en","IN"));
		String date=df.format(new Date());
		System.out.println(date);
		
		//DateFormat dt=DateFormat.getTimeInstance(DateFormat.FULL,new Locale("en","IN")); //for india
		DateFormat dt=DateFormat.getTimeInstance(DateFormat.FULL,new Locale("pl","PL"));  // Germany
		String time=dt.format(new Date());
		System.out.println(time);
	}

}
