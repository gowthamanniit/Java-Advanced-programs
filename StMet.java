package javapro;
//static method
public class StMet {
	String name;
	int regno;
	static String college="";
	static void collegeName()
	{
		college="MCET";
		//System.out.println("Collegname:"+college);
		
	}
	StMet(String x,int y)
	{
		name=x;
		regno=y;
	}
	void display()
	{
		System.out.println("Student name:"+name);
		System.out.println("Register no:"+regno);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StMet.collegeName();

		StMet s1=new StMet("Abhi",112);
		StMet s2=new StMet("Ragavi",113);

		s1.display();
		System.out.println(college);

		s2.display();
		System.out.println(college);
		
	}

}
