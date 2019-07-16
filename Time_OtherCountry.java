//Format date along with other country time

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.*;
public class Time{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentdate=new Date();
		System.out.println("Current date:"+currentdate);
		String datetostr1=DateFormat.getInstance().format(currentdate);
		System.out.println("Formatted:"+datetostr1);
		
		String datetostr=DateFormat.getDateInstance().format(currentdate);
		System.out.println("Formated:"+datetostr);
		
		String date1=DateFormat.getTimeInstance().format(currentdate);
		System.out.println("Time:"+date1);
		
		String datetime=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentdate);
		System.out.println("Date and Time:"+datetime);
		
		LocalDateTime ldt=LocalDateTime.of(2019,Month.JANUARY,29,15,16);
		ZoneId india=ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone1=ZonedDateTime.of(ldt, india);
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime zone=zone1.withZoneSameInstant(tokyo);
		System.out.println(zone);
		
	}

}
