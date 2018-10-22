import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarStrategyTest {
	@Test
	public void test(){
		CarStrategy cs = new CarStrategy("test");
		assertEquals(cs.getExtendedDescription(),"test");
	}
}