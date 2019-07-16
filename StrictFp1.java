package javapro;

public class StrictFp1 {
public strictfp double sum()
{
	double num1=10e+10;
	double num2=6e+08;
	return (num1+num2);
	}
public static strictfp void main(String[] args) {
		// TODO Auto-generated method stub
StrictFp1 f1=new StrictFp1();
System.out.println(f1.sum());
	}

}