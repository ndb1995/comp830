
public class Car{

	private String make;
	private String model;
	private int year;
	private String description;
	private int price;
	private String rating;
	private CarStrategy cs;
	
	public Car(String Make, String Model, int Year, int Price, String Rating) {
		make = Make;
		model = Model;
		year = Year;
		price = Price;
		rating = Rating;
		description = Make + " " + Model + " " + Year + " " + Price + " " +  Rating;
		// cs = new HondaStrategy();
	}

	public String getDescription() {
		if(cs != null)
			return cs.getExtendedDescription();
		else
			return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setStrategy(CarStrategy cs) {
		this.cs = cs;
	}
	
	public boolean isNull() {
		if (cs == null)
			return true;
		else 
			return false;
	}
	

	
}
