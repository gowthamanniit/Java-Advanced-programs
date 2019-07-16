package javapro;
import java.text.*;
import java.util.*;
public class Rupees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4546;
		NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("de","DE"));
		String formatted=nft.format(n); 
		System.out.println(formatted);
	}

}
