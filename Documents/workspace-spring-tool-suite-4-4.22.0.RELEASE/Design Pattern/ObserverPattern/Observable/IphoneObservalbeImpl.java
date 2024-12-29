package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserverInterface;

public class IphoneObservalbeImpl implements StockObservableInterface {

	List<NotificationAlertObserverInterface> observerList = new ArrayList();
	public int stockCount = 0;
	
	@Override
	public void add(NotificationAlertObserverInterface observer) {
		observerList.add(observer);

	}

	@Override
	public void remove(NotificationAlertObserverInterface observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifySubscriber() {
		for( NotificationAlertObserverInterface observer : observerList) {
			observer.update();
		}

	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount == 0) notifySubscriber();
		
		stockCount += newStockAdded;

	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

	
}
