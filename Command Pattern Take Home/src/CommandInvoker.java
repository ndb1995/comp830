import java.util.Arrays;
import java.util.Stack;

public class CommandInvoker {
	private Stack<CommandInterface> cmdList = new Stack<CommandInterface>();
	
	public void execute() {
		if(!cmdList.isEmpty()) {
			cmdList.peek().execute();
		}
	}
	
	public void undo() {
		// can't undo if the stack is empty
		// this will take the first item off undo and put it onto redo
		if(!cmdList.isEmpty()){
			// this actually gets one the commands to execute the undo function
			cmdList.peek().undo();
			// take off the last command
			cmdList.pop();
		}
	}
	
	public void setCommand(CommandInterface ci) {
		// the first command that is entered into the program should start to fill the undo stack
		cmdList.push(ci);
	}
}
