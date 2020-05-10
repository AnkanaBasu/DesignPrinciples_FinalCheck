package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService {
	List<INotificationObserver> observers = null;
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);
	public NotificationService() {
		super();
		observers = new ArrayList<INotificationObserver>();
	}
	@Override
	public void subscribe(INotificationObserver observer) {
		// TODO Auto-generated method stub
		LOGGER.info("Admin of the event "+observer.eventName+" has subscribed successfully\n");
		observers.add(observer);

	}

	@Override
	public void unsubscribe(INotificationObserver observer) {
		// TODO Auto-generated method stub
		LOGGER.info("Admin of the event "+observer.eventName+" has unsubscribed successfully\n");
		observers.remove(observer);

	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (INotificationObserver observer : observers) {
			if (observer.getNoOfTickets() > 100) {
				observer.nofication();
			}
		}
	}

}
