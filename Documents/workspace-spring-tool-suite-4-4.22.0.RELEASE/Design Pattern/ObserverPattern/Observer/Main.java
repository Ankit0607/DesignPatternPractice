package Observer;

import Observable.IphoneObservalbeImpl;
import Observable.StockObservableInterface;

public class Main {

	public static void main(String[] args) {
		StockObservableInterface iphone = new IphoneObservalbeImpl();

		NotificationAlertObserverInterface observer1 = new EmailObserverImpl("xyz1@gmail.com", iphone);
		NotificationAlertObserverInterface observer2 = new EmailObserverImpl("xyz2@gmail.com", iphone);
		NotificationAlertObserverInterface observer3 = new EmailObserverImpl("xyz3@gmail.com", iphone);
		
		iphone.add(observer3);
		iphone.add(observer2);
		iphone.add(observer1);
		
		iphone.setStockCount(10);
	}

}
