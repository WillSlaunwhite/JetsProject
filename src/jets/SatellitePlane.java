package jets;

public class SatellitePlane extends Jets{
	public SatellitePlane(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}
	
	public SatellitePlane() {
		
	}
	
	public void searchForAircraft() {
		System.out.println("AWACS searches for Aircraft and finds nothing!");
	}
	
	@Override
	public void fly() {
		System.out.println("model - " + model + " speed - " + speed + " range - " + range + " price - " + price
			+ " flight time - " + flightTime);
	}
	
	@Override
	public String toString() {
		return "model - " + model + "   speed - " + speed + "   range - " + range + "   price - " + price;
	}

}
