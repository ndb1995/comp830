
public class RunHW2 {

	public static void main(String[] args) {

		Car c1 = new Car("Honda", "Accord", 2001, 5000, "10/10");
		Car c2 = new Car("Ford", "F150", 1995, 10000, "10/10");
		Car c3 = new Car("BMW", "Sedan", 1995, 15000, "10/10");
		
		
		System.out.println("Old description: " + c1.getDescription());
		c1.setStrategy(new HondaStrategy());
		System.out.println("New description: " + c1.getDescription());
		
		
		System.out.println("Old description: " + c2.getDescription());
		c2.setStrategy(new FordStrategy());
		System.out.println("New description: " + c2.getDescription());
		
		
		System.out.println("Old description: " + c3.getDescription());
		c3.setStrategy(new BmwStrategy());
		System.out.println("New description: " + c3.getDescription());
		
	}

}


