import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

	@Test
	public void addTest(){
		GameCommandInvoker game = new GameCommandInvoker();
		AddCommand cmd = new AddCommand("test");
		game.SetCommand(cmd);
		game.execute();
<<<<<<< HEAD
		
=======
>>>>>>> 43cf9190d8a88549d066f65d86c04c9d2211ab4b
		assertEquals(ListOfWords.getInstance().toString(),"[test]");
	}
	
	@Test
	public void deleteTest(){
		GameCommandInvoker game = new GameCommandInvoker();
		DeleteCommand cmd = new DeleteCommand("test");
		game.SetCommand(cmd);
		game.execute();
<<<<<<< HEAD
		
=======
>>>>>>> 43cf9190d8a88549d066f65d86c04c9d2211ab4b
		assertEquals(ListOfWords.getInstance().toString(),"[]");
	}
}
