package javapro;

import java.text.DateFormat;
import java.util.*;
public class Date123{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentdate=new Date();
		System.out.println("Current date:"+currentdate);
	String datost=DateFormat.getInstance().format(currentdate);
	System.out.println("Formatted:"+datost);
		
		String datetostr=DateFormat.getDateInstance().format(currentdate);
		System.out.println("Formated:"+datetostr);
		
		String date1=DateFormat.getTimeInstance().format(currentdate);
		System.out.println("Time:"+date1);
		
		String datetime=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentdate);
		System.out.println("Date and Time:"+datetime);
		
	}

}

