import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarStrategyTest {
	@Test
	public void test(){
		CarStrategy cs = new CarStrategy("2004 Toyota Prius $8000 Excellent");
		assertEquals(cs.getExtendedDescription(),"2004 Toyota Prius $8000 Excellent");
	}
}