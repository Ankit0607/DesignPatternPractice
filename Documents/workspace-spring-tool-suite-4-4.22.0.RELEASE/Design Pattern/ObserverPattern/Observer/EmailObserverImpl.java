package Observer;

import Observable.StockObservableInterface;

public class EmailObserverImpl implements NotificationAlertObserverInterface{

	String email;
	StockObservableInterface observable;
	
	public EmailObserverImpl(String email, StockObservableInterface observable) {

		this.email = email;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMail(email, "product is in stock hurry up");
		
	}
	
	private void sendMail(String email, String msg) {
		System.out.println("mail send to: "+ email);
	}
	

}
