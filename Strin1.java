package javapro;

import java.util.*;
public class Strin1 {
	public static void main(String args[])
	{
	String name="niit-karur";  
	
	char ch=name.charAt(3); //returns the char value at the 3rd index
	System.out.println("Index 3:"+ch);
	
	System.out.println("string length is: "+name.length());//10 is the length of string  
	
	String sf1=String.format("name is %s",name);  
	String sf2=String.format("value is %f",32.33434); 
	
	System.out.println(sf1);  
	System.out.println(sf2);  //Refer String Format too
	
	System.out.println(name.substring(2,4));//returns it  
	System.out.println(name.substring(2));//returns it-Karur 
	
	String name1="how are you";  
	System.out.println(name1.contains("are"));  
	
	 String date = String.join("/","25","06","2018");    
     System.out.println(date);   
     
     String s1="niit-karur";  
     String s2="niit-karur";  
     System.out.println(s1.equals(s2));//true because content and case is same
     
     String s3="";  
            
     System.out.println(s1.isEmpty());  
     System.out.println(s3.isEmpty()); //checks whether empty string
     
     String str1="java string";     
     String str2=" is immutable so assign it explicitly";
     str1=str1.concat(str2);  
     System.out.println(str1);  
     
     String a1="Java in simple ";  
     String replaceString=a1.replace('i','a');//replaces all occurrences of 'i' to 'a'  
     System.out.println(replaceString);  
     
     String sb1="JAVA";  
     String sb2="java";  
     System.out.println(sb1.equalsIgnoreCase(sb2));//true because content same and case ignored
     
     String sc1="java-string-split method";  
     String[] words=sc1.split("\\s");//splits the string based on whitespace  
     for(String w:words)
     {  
     System.out.println(w);          	 
	}
     
     String sd1 = "This is indexOf method";         
     // Passing Substring    
     int index = sd1.indexOf("method"); //Returns the index of this substring  
     System.out.println("index of substring "+index);    
     
     String se1="HELLO stRIng";  
     String strlower=se1.toLowerCase();  
     System.out.println(strlower);
     String s1upper=strlower.toUpperCase();  
     System.out.println(s1upper);  
     
     String sg1="  hello    niit   ";  
     System.out.println(sg1+"karur");//without trim()  
     System.out.println(sg1.trim()+" karur");//with trim()
     
     int value=30;  
     String sh1=String.valueOf(value);  
     System.out.println(sh1+10);//concatenating string with 10  
     
     String ak="hoiii!!!All the best bo bell";
     System.out.println(ak.startsWith("hoiii"));
    // String ak1=new String("!!!All the best");
     System.out.println(ak.endsWith(" do well"));	
     
     System.out.println(ak.lastIndexOf("b"));
	} 
}

