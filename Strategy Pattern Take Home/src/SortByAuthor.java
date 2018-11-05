import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortByAuthor implements BookStrategy {

	public void sort(ArrayList<BookInformation> books) {
		ArrayList<String> sortedAuthor = new ArrayList<String>();
		ArrayList<Integer> sortedIndex = new ArrayList<Integer>();
		int positionInList;

		// first we need to get each individual author from our arraylist
		for (BookInformation b : books) {
			if (!sortedAuthor.contains(b.getAuthor())) {
				sortedAuthor.add(b.getAuthor());
			}

		}

		// then use the built in collections library in order to sort the authors
		Collections.sort(sortedAuthor);

		// next we to see what index in the original book arraylist the author is at
		for (String s : sortedAuthor) {
			positionInList = 0;

			// we will check to see if the author matches, if he does we record the index position so we can print in the correct order later on
			for (BookInformation b : books) {
				if (b.getAuthor() == s) {
					sortedIndex.add(positionInList);

				}
				positionInList++;
			}

		}

		// then we go through the sorted index, which will grab the indexes that are
		// sorted from sort authors and display a proper list
		// we are basically just getting the sorted index and picking the correct book
		// so instead of printing index 1,2,3 etc we might print index 1,5,19,4 etc
		for (Integer i : sortedIndex) {
			System.out.println(books.get(i).getAll());
		}
	}

}
