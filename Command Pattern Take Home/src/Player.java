import java.util.ArrayList;

public class Player {
	private static Player uniqueInstance; 
	private static int xCoord;
	private static int yCoord;
	private ArrayList<String> coords = new ArrayList<String>();

	
	Player(){
		xCoord = 0;
		yCoord = 0;
	}
	
	// method to set our singleton
	 public static Player getInstance() {
		 if(uniqueInstance == null) {
			 uniqueInstance = new Player();
		 }
		 return uniqueInstance;
	 }
	 
	 // this will set the coordinates for whatever number is passed in
	 // north = +1 y
	 // south = -1 y
	 // east = +1 x
	 // west = -1 x
	 public void setCoordinates(int x, int y) {
		 xCoord += x;
		 yCoord += y;
		 coords.add("X: " + String.valueOf(xCoord) + " Y: " + String.valueOf(yCoord));
	 }
	 
	 // return the coordinates as a string
	 public String getCoordinates() {
		String coordinates = "X: " + String.valueOf(xCoord) + " Y: " + String.valueOf(yCoord);
		return coordinates;
	 }
	 
	 public void deleteLastMove() {
		 coords.remove(coords.size() - 1);
		 System.out.println(coords.toString());
	 }
}
