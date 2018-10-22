import java.util.Scanner;

public class RunHW6 {

	public static void main(String[] args) {
		GameCommandInvoker gamer = new GameCommandInvoker();
		Scanner scan = new Scanner(System.in);
		// this variable will be changed to false when we type in "quit" to end the while loop
		boolean run = true;
		while (run)
		{
			System.out.println("Command:");
			String cmd = scan.nextLine();
			// get the command and then the word. If no word, no problem with split, only one index will be filled
			String[] splited = cmd.split("\\s+");			
			switch(splited[0])
			{
			case "add":
				// pass in the word to be added
				AddCommand addcmd = new AddCommand(splited[1]);
				gamer.SetCommand(addcmd);
				gamer.execute();
				break;
			case "delete":
				// pass in the word to be deleted
				DeleteCommand delcmd = new DeleteCommand(splited[1]);
				gamer.SetCommand(delcmd);
				gamer.execute();
				break;
			case "undo":
				gamer.undo();
				break;
			case "redo":
				gamer.redo();
				break;
			case "quit":
				run = false;
				break;
			default: 
				System.out.println("Not a command"); 
			}
			// prevents a printout when quit is typed in
			if(run)
				System.out.println(ListOfWords.getInstance().toString());

		}
	}
}
