import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CarTest {

	private Car car;

	void createCar(){
		car = new Car("2004", "Toyota", "Prius", "$8000", "Excellent");
	}

	@Test
	void testCar() {
		CarStrategy strat = Mockito.mock(CarStrategy.class);
		Mockito.when(strat.getExtendedDescription()).thenReturn("Extended description");
		car.setCarStrategy(strat);
		assertEquals(car.getDescription(), "Extended description");
	}
	
}