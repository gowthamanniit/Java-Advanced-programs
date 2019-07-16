package javapro;

public class ThrowEx {
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not Allowed to Vote");
		else
			System.out.println("Allowed to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			validate(10);
	}

}
