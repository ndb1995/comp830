
public class Car {

	private String make;
	private String model;
	private int year;
	private String description;
	private int price;
	private double rating;
	private CarStrategy cs;
	
	public Car(String Make, String Model, int Year, String Description, int Price, double Rating) {
		make = Make;
		model = Model;
		year = Year;
		description = Description;
		price = Price;
		rating = Rating;
	}
	
	// not exactly sure what I should be setting here
	public void setDescription(String description) {
		
	}
	
	public String getDescription() {
		// is cs does equal null, give it the default description passed in to the constructor
		// is cs does not equal null, that means a strategy has been passed in to the instance, call the extended description
		if(cs != null)
			return cs.getExtendedDescription();
		else
			return description;
	}
	
	// this will set the CarStrategy object
	public void setCarStrategy(CarStrategy cs) {
		this.cs = cs;
	}
}
