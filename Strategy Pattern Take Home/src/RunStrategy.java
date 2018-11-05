import java.util.Scanner;

public class RunStrategy {

	
	
	public static void main(String[] args) {
		BookLibrarian bl = new BookLibrarian();
		Scanner input = new Scanner(System.in);
		boolean run = true;
		// we will run the command asking what way the user wants to sort the books and then set the strategy
		while(run){
			System.out.println("Choose sort method (Title) (Author) (Year) (Quit):");
			String command = input.nextLine().toUpperCase();
			switch(command)
			{
			case "TITLE":
				bl.setStrategy(new SortByTitle());
				break;
			case "AUTHOR":
				bl.setStrategy(new SortByAuthor());
				break;
			case "YEAR":
				bl.setStrategy(new SortByYearPublished());
				break;
			case "QUIT":
				run = false;
				break;
			default: 
				System.out.println("Not a command"); 
			}
}
	}
}
