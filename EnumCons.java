package javapro;
enum Mobile
{
	Samsung(10),redmi(15),sony(20);
   int id;
   Mobile(int id1) //or id
   {
	   id=id1; //or this.id=id;
   }
}
public class EnumCons {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Mobile m1:Mobile.values())
		{
			System.out.println("Mobile"+m1+ " ID is " + m1.id);
		}
	}

}
