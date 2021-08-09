package jets;

public class SatelliteJet extends Jets{
	public SatelliteJet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}
	
	public SatelliteJet() {
	}
	
	public void searchForAircraft() {
		System.out.println("AWACS searches for Aircraft and finds nothing!");
	}
	
	@Override
	public void fly() {
		System.out.println("Model: " + model.toUpperCase() + "\tSpeed: " + speed + "\tRange: " + range + "\tPrice: " +  getPriceInDollars(price)
				+ "\tFlight Time: " + flightTime + " hours");	
	}
	
	@Override
	public String toString() {
		return "Model: " + model.toUpperCase() + "\tSpeed: " + speed + "\tRange:" + range + "\tPrice:" + getPriceInDollars(price);
	}

}
