package jets;

public class SpyJet extends Jets {
	public SpyJet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}

	public SpyJet() {
	}

	public void spy() {
		System.out.println("RC135 collects data! It's super effective! Critical hit!");
	}

	@Override
	public void fly() {
		System.out.println("Model: " + model.toUpperCase() + "\tSpeed: " + speed + "\tRange:" + range + "\tPrice:" + price
				+ "\tFlight Time: " + flightTime + " hours");
	}
	
	@Override
	public String toString() {
		return "Model: " + model.toUpperCase() + "\tSpeed: " + speed + "\tRange:" + range + "\tPrice:" + price;
	}

}
