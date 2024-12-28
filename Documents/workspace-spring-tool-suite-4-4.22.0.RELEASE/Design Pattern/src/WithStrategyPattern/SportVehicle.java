package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportVehicleStrategy;

public class SportVehicle extends Vehicle{

	SportVehicle(){
		super(new SportVehicleStrategy());
	}
}
