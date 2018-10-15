public class Car {
	
	String year, make, model, price, rating;
	CarStrategy cStrat = null;
	
	public Car (String year, String make, String model, String price, String rating) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
		this.rating = rating;
	}
	
	public String getDescription() {
		String ret = "Make: " + make + "\n";
		ret += "Model: " + model + "\n";
		ret += "Year: " + year + "\n";
		ret += "Price: " + price + "\n";
		ret += "Rating: " + rating +"\n";
		
		if (cStrat != null) {
			ret += cStrat.getExtendedDescription();
		}
		return ret;
	}

	public void setCarStrategy(CarStrategy cs) {
		cStrat = cs;
	}
	
	public void removeCarStrategy() {
		cStrat = null;
	}

}