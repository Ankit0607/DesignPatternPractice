package WithStrategyPattern;

import WithStrategyPattern.Strategy.SpecialDriveStrategy;

public class SpecialVehicle extends Vehicle{

	SpecialVehicle(){
		super(new SpecialDriveStrategy());
	}
}
