
public class SubscribesThrees implements Observer{

	@Override
	public boolean update(Event e) {
		// Equaling zero makes the number divisible by 3
		if(e.getEventData() % 3 == 0){
			System.out.printf("Event %d is divisible by 3: %d%n", e.getEventNumber(), e.getEventData());
			return true;
		}
		return false;
	}

}
