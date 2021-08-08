package jets;

public class CargoPlane extends Jets {
	public CargoPlane(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}

	public CargoPlane() {

	}

	public void loadCargo() {
		System.out.println("The plane is loaded and ready for departure.");
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
