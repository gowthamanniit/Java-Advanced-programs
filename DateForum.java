package javapro;
import java.text.DateFormat;
import java.util.*;
public class DateForum {
 public static void main(String agrs[])
 {
	 Date Currentdate=new Date();
	 System.out.println("Current date:"+Currentdate);
	 String datetostr=DateFormat.getInstance().format(Currentdate);
	 System.out.println("Formatted:"+datetostr);
	 
	 
 }
}
