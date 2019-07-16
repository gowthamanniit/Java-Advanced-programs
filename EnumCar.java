package javapro;
 enum Car
 {
	 tata(2),audi(50),fiat(50),honda(12);
	 int price;
	 Car(int p)
	 {
		 price=p;
	 }
	 int getPrice()
	 {
		 return price;
		 
	 }
 }
public class EnumCar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("All car Price:");
		for(Car c:Car.values())
			System.out.println(c + " Costs" +c.getPrice() +"thousand dollors");
	}

}
