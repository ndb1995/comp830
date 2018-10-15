import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCarStrategy {

	@Test
	void testCarStrategy() {
		// object to test with
		Car c1 = new Car("Honda", "Accord", 2001, 5000, "10/10");
		
		assertEquals(c1.getDescription(),"Honda Accord 2001 5000 10/10");
	}

}
