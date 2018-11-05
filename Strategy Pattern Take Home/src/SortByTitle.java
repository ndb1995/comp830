import java.util.ArrayList;
import java.util.Collections;

public class SortByTitle implements BookStrategy {

	public void sort(ArrayList<BookInformation> books) {
		ArrayList<BookInformation> NewOrderList = new ArrayList<BookInformation>();

		ArrayList<String> sortedTItle = new ArrayList<String>();
		ArrayList<Integer> sortedIndex = new ArrayList<Integer>();
		int positionInList;

		for (BookInformation b : books) {
			if (!sortedTItle.contains(b.getTitle())) {
				sortedTItle.add(b.getTitle());
			}

		}

		Collections.sort(sortedTItle);

		for (String s : sortedTItle) {
			positionInList = 0;

			for (BookInformation b : books) {
				if (b.getTitle() == s) {
					sortedIndex.add(positionInList);

				}
				positionInList++;
			}

		}

		for (Integer i : sortedIndex) {
			System.out.println(books.get(i).getAll());
		}
	}

}
