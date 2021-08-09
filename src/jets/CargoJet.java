package jets;

public class CargoJet extends Jets {
	public CargoJet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = (Math.floor((range / speed) * 100) / 100);
	}

	public CargoJet() {
	}

	public void loadCargo() {
		System.out.println("The " + this.model.toUpperCase() + " is loaded and ready for departure.");
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
