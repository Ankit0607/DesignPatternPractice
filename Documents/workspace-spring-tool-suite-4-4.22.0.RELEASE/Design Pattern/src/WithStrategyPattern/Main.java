package WithStrategyPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle veh = new SportVehicle();
		veh.drive();
		
		veh = new SportVehicle();
		veh.drive();
		
		veh = new OffRoadVehicle();
		veh.drive();
		
		veh = new GoodsVehicle();
		veh.drive();
		

	}

}
