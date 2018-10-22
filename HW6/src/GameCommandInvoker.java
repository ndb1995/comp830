import java.util.Stack;

public class GameCommandInvoker {

	// these stacks will be the redo and undo stacks. They will be mirror opposites of each other
	private Stack<GameCommandInterface> cmdListUndo = new Stack<GameCommandInterface>();
	private Stack<GameCommandInterface> cmdListRedo = new Stack<GameCommandInterface>();

	public void execute() {
		// can't execute if the stack is empty
		// this will return the game command interface at the top of the stack and run its execute function
		if(!cmdListUndo.isEmpty()) {
			cmdListUndo.peek().execute();
		}
	}
	
	public void redo() {
		// can't redo if the stack is empty
		// this will take the first item off redo and put it onto undo
		if(!cmdListRedo.isEmpty()){
			// this actually gets one the commands to execute the redo function
			cmdListRedo.peek().redo();
			// this is what takes off the top redo and adds it to the undo stack
			cmdListUndo.push(cmdListRedo.pop());
		}
	}
	
	public void undo() {
		// can't undo if the stack is empty
		// this will take the first item off undo and put it onto redo
		if(!cmdListUndo.isEmpty()){
			// this actually gets one the commands to execute the undo function
			cmdListUndo.peek().undo();
			// this is what takes off the top undo and adds it to the redo stack
			cmdListRedo.push(cmdListUndo.pop());
		}
	}
	
	public void SetCommand(GameCommandInterface gci) {
		// the first command that is entered into the program should start to fill the undo stack
		cmdListUndo.push(gci);
	}
	
	
}
