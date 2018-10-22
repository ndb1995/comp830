import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class CarTest {

	private Car car;

	public void createCar(){
		car = new Car("2004", "Toyota", "Prius", "$8000", "Excellent");
	}

	@Test
	public void testCar() {
		CarStrategy strat = Mockito.mock(CarStrategy.class);
		Mockito.when(strat.getExtendedDescription()).thenReturn("test");
		car.setCarStrategy(strat);
		assertEquals(car.getDescription(), "2004 Toyota Prius $8000 Excellent");
	}
	
}