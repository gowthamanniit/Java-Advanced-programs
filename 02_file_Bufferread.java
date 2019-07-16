import java.io.*;
public class Bufferedread {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
			
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter a string:");
				String s1=br.readLine();
											
				System.out.println("Get the number:");
				String s2=br.readLine();
				System.out.println(s2);
				int no=Integer.parseInt(s2);
				
				
				System.out.println("s1"+s1);
				System.out.println("NO:"+no);
				
		}
}
