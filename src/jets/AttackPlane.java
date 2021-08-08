package jets;

public class AttackPlane extends Jets {
	public AttackPlane(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}

	public AttackPlane() {

	}

	public void pewPew() {
		System.out.println("A10 goes pew pew! Buzz buzz!");
	}

	@Override
	public void fly() {
		System.out.println("model - " + model + ", speed - " + speed + ", range - " + range + ", price - " + price
				+ " flight time - " + flightTime);
	}
	
	@Override
	public String toString() {
		return "model - " + model + "   speed - " + speed + "   range - " + range + "   price - " + price;
	}
}
