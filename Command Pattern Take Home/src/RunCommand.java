import java.util.Random;

public class RunCommand {

	public static void main(String[] args) {
		int number;
		Player p = new Player();
		CommandInvoker ci = new CommandInvoker();
		
		for(int x = 0; x < 50; x++) {
			Random randy = new Random();
			number = randy.nextInt(4) + 1;
			switch(number)
			{
			case 1:
				// pass in the word to be added
				MoveNorth moveNorth = new MoveNorth(0,1);
				ci.setCommand(moveNorth);
				ci.execute();
				break;
			case 2:
				// pass in the word to be deleted
				MoveEast moveEast = new MoveEast(1,0);
				ci.setCommand(moveEast);
				ci.execute();
				break;
			case 3:
				MoveSouth moveSouth = new MoveSouth(0,-1);
				ci.setCommand(moveSouth);
				ci.execute();
				break;
			case 4:
				MoveWest moveWest = new MoveWest(0,-1);
				ci.setCommand(moveWest);
				ci.execute();
				break;
			default: 
				System.out.println("Not a command"); 
			}
		}
		for(int x = 0; x < 50; x++) {
			ci.undo();
		}
		

	}

}
