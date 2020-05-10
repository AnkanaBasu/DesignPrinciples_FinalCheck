package ObserverPattern;

import java.util.Date;

public abstract class INotificationObserver {
	protected INotificationService service;
	protected String eventName;
	protected Date eventDate;
	protected String venue;
	protected int noOfTickets;
	public INotificationObserver(INotificationService service, String name, Date date,String venue,int noOfTickets) {
		super();
		this.service = service;
		this.eventName = name;
		this.eventDate=date;
		this.venue=venue;
		this.noOfTickets = noOfTickets;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}

	public abstract void nofication();
}
