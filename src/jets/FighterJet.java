package jets;

public class FighterJet extends Jets {
	public FighterJet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}

	public FighterJet() {
	}

	public void dogfight() {
		System.out.println("The fighter engages enemy combatants!");
	}

	@Override
	public void fly() {
		System.out.println("Model: " + model.toUpperCase() + "\tSpeed: " + speed + "\tRange: " + range + "\tPrice: " + getPriceInDollars(price)
				+ "\tFlight Time: " + flightTime + " hours");
	}
	
	@Override
	public String toString() {
		return "Model: " + model.toUpperCase() + "\tSpeed: " + speed + "\tRange:" + range + "\tPrice:" + getPriceInDollars(price);
	}

}
