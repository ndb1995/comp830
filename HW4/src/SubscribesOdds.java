
public class SubscribesOdds implements Observer{

	@Override
	public boolean update(Event e) {
		// not divisible by 2 means it is an odd number
		// %d does integers, %n applies a new line
		if(e.getEventData() % 2 != 0){
			System.out.printf("Event %d is odd: %d%n", e.getEventNumber(), e.getEventData());
			return true;
		}
		return false;
	}

}
