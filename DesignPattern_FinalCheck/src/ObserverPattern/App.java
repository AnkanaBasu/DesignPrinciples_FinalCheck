package ObserverPattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        INotificationService service=new NotificationService();
        INotificationObserver admin1=new Admin(service, "Spring festival",new SimpleDateFormat("dd/MM/yyyy").parse("09/03/2020"), "RBU", 120);
        INotificationObserver admin2=new Admin(service, "Fosills Concert",new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2020"), "NajrulManch", 230);
        INotificationObserver admin3=new Admin(service, "Hand Craft Festival",new SimpleDateFormat("dd/MM/yyyy").parse("12/04/2020"), "RBU", 78);
        
        service.subscribe(admin1);
        service.subscribe(admin2);
        service.subscribe(admin3);
        
        service.notifyObserver();
         
        service.unsubscribe(admin2);
        
        service.notifyObserver();
	}

}
