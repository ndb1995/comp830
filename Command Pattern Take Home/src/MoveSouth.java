
public class MoveSouth implements CommandInterface{

	private int xCoord, yCoord;
	
	MoveSouth(int x, int y){
		this.xCoord = x;
		this.yCoord = y;
	}
	
	@Override
	public void execute() {
		Player.getInstance().setCoordinates(xCoord, yCoord);
		System.out.println("Player moved south: " + Player.getInstance().getCoordinates());
		
	}

	@Override
	public void undo() {
		Player.getInstance().deleteLastMove();
	}
}
