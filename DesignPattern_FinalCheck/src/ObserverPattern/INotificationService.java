package ObserverPattern;

public interface INotificationService {
	public void subscribe(INotificationObserver observer);
	public void unsubscribe(INotificationObserver observer);
	public void notifyObserver();
}
