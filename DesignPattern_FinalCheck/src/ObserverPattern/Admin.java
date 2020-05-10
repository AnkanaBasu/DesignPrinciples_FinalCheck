package ObserverPattern;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Admin extends INotificationObserver {
	private static final Logger LOGGER = LoggerFactory.getLogger(Admin.class);
	public Admin(INotificationService service, String name, Date date,String venue,int noOfTickets) {
		super(service, name, date, venue, noOfTickets);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nofication() {
		// TODO Auto-generated method stub
		LOGGER.info("For Event "+eventName+" more than 100 tickets are booked");
		LOGGER.info("Event Details:: \nName: "+eventName+"\nDate: "+eventDate+"\nVenue: "+venue+"\n");
	}

}
