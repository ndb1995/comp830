public class BookInformation {
	String Author;
	String Title;
	String YearPublished;
	String Summary;

	public BookInformation(String Author, String Title, String YearPublished, String Summary) {
		super();
		this.Author = Author;
		this.Title = Title;
		this.YearPublished = YearPublished;
		this.Summary = Summary;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String Author) {
		this.Author = Author;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public String getYearPublished() {
		return YearPublished;
	}

	public void setYearPublished(String YearPublished) {
		this.YearPublished = YearPublished;
	}

	public String getSummary() {
		return Summary;
	}

	public void setSummary(String Summary) {
		this.Summary = Summary;
	}

	// this method will be used to print the current values of the instance of bookinformation
	public String getAll() {
		return ("Author: " + Author + " Title: " + Title + " Year Published: " + YearPublished);
		
	}
}
