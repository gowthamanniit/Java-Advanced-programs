import java.util.concurrent.atomic.AtomicInteger;
public class Atomi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicInteger value=new AtomicInteger(5);
		System.out.println("Initial Value : "+value.get());
		value.getAndIncrement();
		System.out.println("After Decreament :"+value.get());
		value.set(40);
		System.out.println("After set the value: "+value.get());
		value.getAndDecrement();
		System.out.println("After Decreament: "+value.get());
		value.compareAndSet(39,45);
		System.out.println("After updating :"+value.get());
		
	}

}
                 