package Observable;

import Observer.NotificationAlertObserverInterface;

public interface StockObservableInterface {
	
	public void add(NotificationAlertObserverInterface observer);
	public void remove(NotificationAlertObserverInterface observer);
	public void notifySubscriber();
	public void setStockCount(int newStockAdded);
	public int getStockCount();
	

}
