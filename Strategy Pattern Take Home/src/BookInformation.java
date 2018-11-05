import java.util.Comparator;

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

    public int compareTo(BookInformation book) {
        String compareAuthor=((BookInformation)book).getAuthor();
        /* For Ascending order*/
        return compareAuthor.compareTo( this.Author );

    }
    
    public int compareTo(BookInformation book) {
        String compareTitle=((BookInformation)book).getTitle();
        /* For Ascending order*/
        return compareTitle.compareTo( this.Title );

    }
    
    public int compareTo(BookInformation book) {
        String comparePublished=((BookInformation)book).getYearPublished();
        /* For Ascending order*/
        return comparePublished.compareTo( this.YearPublished );

    }
}
