package innerClasses;

import java.util.HashMap;

public class VehicleType {

	
	interface Vehicle{
		public void noOfWheels();
			
	}
	
	class  Bus implements Vehicle{
		 
	@Override
		public void noOfWheels() {
			System.out.println("6");
			
		}
	}
	
	class Car implements Vehicle{

		@Override
		public void noOfWheels() {
			System.out.println("4");
			
		}
	}
	
	public static void main(String[] args) {
		 VehicleType vt = new VehicleType();
		// Map m = new HashMap<>();
	}
}
