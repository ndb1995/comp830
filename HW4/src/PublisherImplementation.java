import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class PublisherImplementation implements PublisherInterface{

	// will be our list of observers
	private ArrayList <Observer> subscribers;
	// will be our hashmap that contains the count for the different observer objects we create
	private HashMap<Observer, Integer> count = new HashMap<Observer, Integer>();

	public PublisherImplementation() {
		subscribers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		subscribers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		subscribers.remove(o);
		// we also have to remove the count or else it will contain the old count and get removed immediately
		// this is basically like resetting a count to zero ie count = 0;
		count.remove(o);
		
	}

	@Override
	public void notifyObservers(Event e) {
		for(Observer observers : subscribers) {
			// if the update comes back as true then we will put our observer in the hashmap as a key and add 1 to its value
			if(observers.update(e)) {
				count.put(observers, (0) + 1);
			};
		}
	}
	
	// this will return a new event, with a different event number (loop iteration) and new event data (random integer 1-5000)
	private Event generateEvent(int eN, int eD) {
		 return new Event(eN, eD);
	}
	
	public void runSimulation() {
		Random randy = new Random();
		
		// create our objects
		SubscribesEvens evens = new SubscribesEvens();
		SubscribesOdds odds = new SubscribesOdds();
		SubscribesThrees threes = new SubscribesThrees();
		
		// and then register them
        registerObserver(evens);
        registerObserver(odds);
        registerObserver(threes);

		for(int x = 0; x < 200; x++) {
			notifyObservers(generateEvent(x,randy.nextInt(5000) + 1));

			// if subscribers is divisible by 40
			// this will account for 40, 80, 120, 160, and 200 instead of doing a statement for each of them
			if (x % 40 == 0) {
				
				// if subscribers doesn't contain odds or threes we are allowed to register them again
                if (!subscribers.contains(odds))
                    registerObserver(odds);
                if (!subscribers.contains(threes))
                    registerObserver(threes);
			}
			
			// the counts for these could be 0, so in order to avoid null pointer exception
			// we will use get or default, which is a hashmap method designed to avoid returning nulls
            if (count.getOrDefault(odds, 0) > 20)
                removeObserver(odds);
            if (count.getOrDefault(threes, 0) > 6)
            	removeObserver(threes);
		}
	}
}
