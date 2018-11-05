import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortByAuthor implements BookStrategy {

	public void sort() {
		BookLibrarian bl = new BookLibrarian();
		ArrayList<BookInformation> Books = bl.getBookInformation();
		Collections.sort(Books);

		for (int i = 0; i < Books.size(); i++) {
			System.out.println(Books.get(i));
		}
	}

}
