package jets;

public class SpyPlane extends Jets {
	public SpyPlane(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}

	public SpyPlane() {

	}

	public void spy() {
		System.out.println("RC135 collects data! It's super effective! Critical hit!");
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
