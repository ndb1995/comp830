import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InventoryItemTest {

	InventoryItem item;

	@BeforeEach
	public void setUp() {
		item = new InventoryItem("Laptop", 1, "Asus NJ550X", 1);
	}

	@Test
	public void Test() {
		
		// create a spy mock object with inputed values
		InventoryItem spy = Mockito.spy(item);
		// create a regular mock object values to be added later
		InventoryItem mock = Mockito.mock(InventoryItem.class);
		
		// add values to the mock object
		Mockito.when(mock.getName()).thenReturn("Asus NJ550X");
		Mockito.when(mock.getWeight()).thenReturn(1);
		Mockito.when(mock.getCount()).thenReturn(1);
		Mockito.when(mock.getType()).thenReturn("Laptop");
		
		// assert the mock object to the spy object
		assertEquals(mock.getName(), spy.getName());
		assertEquals(mock.getWeight(), spy.getWeight());
		assertEquals(mock.getCount(), spy.getCount());
		assertEquals(mock.getType(), spy.getType());

	}

}
