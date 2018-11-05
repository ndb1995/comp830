import java.util.ArrayList;
import java.util.Collections;

public class SortByYearPublished implements BookStrategy {

	public void sort(ArrayList<BookInformation> books) {
		ArrayList<String> sortedYear = new ArrayList<String>();
		ArrayList<Integer> sortedIndex = new ArrayList<Integer>();
		int positionInList;

		for (BookInformation b : books) {
			if (!sortedYear.contains(b.getYearPublished())) {
				sortedYear.add(b.getYearPublished());
			}

		}

		Collections.sort(sortedYear);

		for (String s : sortedYear) {
			positionInList = 0;

			for (BookInformation b : books) {
				if (b.getYearPublished() == s) {
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
