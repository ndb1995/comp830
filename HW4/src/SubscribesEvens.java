
public class SubscribesEvens implements Observer{

	@Override
	public boolean update(Event e) {
		// divisible by 2 means it is an even number
		if(e.getEventData() % 2 == 0){
			System.out.printf("Event %d is even: %d%n", e.getEventNumber(), e.getEventData());
			return true;
		}
		return false;
	}

}
