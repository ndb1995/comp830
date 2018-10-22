import java.util.Random;

public class HW1 {

	public static void main(String[] args) {
		// create the singleton instance
		DiceController dice = DiceController.getInstance();

		// access the distribution method from the instance
		dice.showDistribution();
	}
}

class DiceController{
	private static DiceController uniqueInstance; 

	private DiceController() {

	}

	public static DiceController getInstance() {
		if (uniqueInstance == null) {	
			uniqueInstance = new DiceController();
		}
		return uniqueInstance;
	}

	public void showDistribution() {
		int[] count = new int[6];

		for(int x = 0; x < 36; x++) {
			// creates new dice object every run through in order to get new rolls
			Dice die1 = new Dice(6);
			Dice die2 = new Dice(6);
			// depending on what the dice roll equals, the array counter goes up 1
			if(die1.returnDie() == 1|| die2.returnDie() == 1)
				count[0]++;
			else if(die1.returnDie() == 2|| die2.returnDie() == 2)
				count[1]++;
			else if(die1.returnDie() == 3|| die2.returnDie() == 3)	
				count[2]++;
			else if(die1.returnDie() == 4|| die2.returnDie() == 4)
				count[3]++;
			else if(die1.returnDie() == 5|| die2.returnDie() == 5)
				count[4]++;
			else 
				count[5]++;
		}

		// will iterate 6 times
		for(int x = 0; x < count.length; x++) {
			// adjust the index by 1
			System.out.print(x + 1 + ": ");
			// run the loop for the size of the number in the index location and print out an x for the size
			for (int y = 0; y < count[x]; y++) {
				System.out.print("x");
			}
			// new line
			System.out.println("");
		}
	}
}

// class to make dice
class Dice{
	private int die;   
	Random randy = new Random();
	public Dice(int sides) {
		die = randy.nextInt(sides) + 1;
	}
	
	// if you want to access the die, must use public method
	// instead of accessing the variable
	public int returnDie() {
		return die;
	}


}
