package jets;

public class AttackJet extends Jets {
	public AttackJet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}

	public AttackJet() {
	}

	public void pewPew() {
		System.out.println("A10 goes pew pew! Buzz buzz!");
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
