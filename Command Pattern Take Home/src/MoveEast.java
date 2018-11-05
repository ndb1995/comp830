
public class MoveEast implements CommandInterface{

	private int xCoord, yCoord;
	
	MoveEast(int x, int y){
		this.xCoord = x;
		this.yCoord = y;
	}
	
	@Override
	public void execute() {
		Player.getInstance().setCoordinates(xCoord, yCoord);
		System.out.println("Player moved east: " + Player.getInstance().getCoordinates());
	}

	@Override
	public void undo() {
		Player.getInstance().deleteLastMove();
	}
}
