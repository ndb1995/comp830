
public class RunHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize object and give values to the constructor
		Car c1 = new Car("Honda", "Accord", 2001, "this is my second car", 5000, 10.0);
		Car c2 = new Car("Ford", "F150", 1995, "this is my third car", 10000, 5.0);
		Car c3 = new Car("BMW", "Sedan", 1995, "this is my fourth car", 15000, 7.5);
		
		// print the initial description given to the instance
		System.out.println(c1.getDescription());
		System.out.println(c2.getDescription());
		System.out.println(c3.getDescription());
		
		// give it a more advanced description for each different instance
		c1.setCarStrategy(new CarStrategy("This is a more advanced description for the Honda Accord"));
		System.out.println(c1.getDescription());
		
		c2.setCarStrategy(new CarStrategy("This is a more advanced description for the Ford F150"));
		System.out.println(c2.getDescription());
		
		c3.setCarStrategy(new CarStrategy("This is a more advanced description for the BMW Sedan"));
		System.out.println(c3.getDescription());
		
		// works correctly if a null value is passed into it as well
		c3.setCarStrategy(new CarStrategy(null));
		System.out.println(c3.getDescription());

	}

}
