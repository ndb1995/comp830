import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InventoryTest {

	private Inventory objUnderTest;
	
	@BeforeEach
	public void setUp() {
		objUnderTest = new Inventory();
	}

	@Test
	public void testAddInventory() {
		Inventory mock = Mockito.mock(Inventory.class);
		
		// inventory is a collection of inventory items, so we must create inventory item objects and add them
		InventoryItem i1 = new InventoryItem("Desktop Mouse", 1, "Logitech G430", 11);
		InventoryItem i2 = new InventoryItem("Sweatshirt", 2, "Nike Sweatshirt", 18);
		
		// add inventory items to our inventory object
		objUnderTest.addItemToInventory(i1);
		objUnderTest.addItemToInventory(i2);
		
		// use a mockito object to force a return to what we want
		Mockito.when(mock.getWeight()).thenReturn(3);
		Mockito.when(mock.getCount()).thenReturn(2);
		Mockito.when(mock.toString()).thenReturn("Your inventory has:\n" + "Logitech G430 type (Desktop Mouse), wt: 1, there are 11 left\n" + "Nike Sweatshirt type (Sweatshirt), wt: 2, there are 18 left\n");
		
		assertEquals(mock.getWeight(), objUnderTest.getWeight());
		assertEquals(mock.getCount(), objUnderTest.getCount());
		assertEquals(mock.toString(), objUnderTest.toString());		
		
	}
	
	@Test
	public void testDeleteInventory() {
		Inventory mock = Mockito.mock(Inventory.class);		
		
		// add inventory item objects
		InventoryItem i1 = new InventoryItem("Desktop Mouse", 1, "Logitech G430", 11);
		InventoryItem i2 = new InventoryItem("Sweatshirt", 2, "Nike Sweatshirt", 18);
		
		Mockito.when(mock.getWeight()).thenReturn(2);
		Mockito.when(mock.getCount()).thenReturn(1);
		
		// add inventory items to our inventory object
		objUnderTest.addItemToInventory(i1);
		objUnderTest.addItemToInventory(i2);
		objUnderTest.dropInventoryItem(i2);
		
		assertEquals(objUnderTest.dropInventoryItem(i2), false);
	}
}
