public class RunHW2 {

	public static void main(String[] args) {
		Car c1, c2, c3;
		
		c1 = new Car("2004", "Toyota", "Prius", "$8000", "Excellent");
	    c2 = new Car("1981", "Ford", "Pinto", "$2000", "Good");
	    c3 = new Car("2001", "Toyota", "Sienna", "$6000", "Good");
	 
	    System.out.println("Car 1: \n" + c1.getDescription());
	    System.out.println("Car 2: \n" + c2.getDescription());
	    System.out.println("Car 3: \n" + c3.getDescription());
	    
	    CarStrategy cs = new CarStrategy("I drove this car for 6 years!");
	    c2.setCarStrategy(cs);
	    
	    System.out.println("Car 1: \n" + c1.getDescription());
	    System.out.println("Car 2: \n" + c2.getDescription());
	    System.out.println("Car 3: \n" + c3.getDescription());	    
	}

}
