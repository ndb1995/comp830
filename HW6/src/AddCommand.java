
public class AddCommand implements GameCommandInterface{

	private String myString;
	
	public AddCommand(String s) {
		myString = s;
	}
	
	@Override
	public void execute() {
		ListOfWords.getInstance().addWord(myString);
	}

	@Override
	public void undo() {
		ListOfWords.getInstance().deleteWord(myString);	
	}

	@Override
	public void redo() {
		// execute is basically the same thing as a redo, so no point in writing the code twice
		execute();
	}
	

}
