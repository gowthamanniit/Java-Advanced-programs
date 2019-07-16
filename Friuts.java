package javapro;

public class Friuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]jumblewords=new String[][]{{"elapp","apple"},{"argneo","orange"},{"agrspe","grapes"}};
		System.out.println("Friuts are:");
		for(String[]i:jumblewords) {
			for(String j:i)
			{
				System.out.println(j);
			}
		}
		

	}

}
