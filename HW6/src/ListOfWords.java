import java.util.ArrayList;

public class ListOfWords {
	private static ListOfWords uniqueInstance; 
	private ArrayList<String> listOfWords = new ArrayList<String>();
	
	
	// method to set our singleton
	 public static ListOfWords getInstance() {
		 if(uniqueInstance == null) {
			 uniqueInstance = new ListOfWords();
		 }
		 return uniqueInstance;
	 }
	 
	 public void addWord(String word) {
		 listOfWords.add(word);
	 }
	 
	 public void deleteWord(String word) {
		 listOfWords.remove(word);
	 }
	 
	 public String toString() {
		 return listOfWords.toString();
	 }
}
