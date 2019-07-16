package javapro;
class Native
{
	static
	{
		System.loadLibrary("Native Library Path");
	}
	public native void method1();
		
}
public class Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Native n1=new Native();
		n1.method1();
	}
}

/* native modifier- external files are loaded into java file, native languages - c,c++ files, it's not highly recommeded
 * volatile keyword- thread safe like synchronization it reflects on other thread
 */
// transiet variable eg, transient int year; here , year doesn't get serialized, (serialized- object state into serial bytes//
