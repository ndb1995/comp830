
public class RunStrategy {

	
	
	public static void main(String[] args) {
		BookLibrarian bl = new BookLibrarian();
		bl.setStrategy(new SortByAuthor());
	}
}
