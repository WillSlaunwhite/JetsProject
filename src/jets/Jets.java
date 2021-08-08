package jets;

public abstract class Jets {
	protected String model;
	protected double speed; // needs to be given in mph and mach
	protected int range;
	protected long price;
	protected double flightTime;

	public Jets(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flightTime = range / speed;

	}

	public Jets() {
		
	}

	public double getSpeedInMach(double speedInMiles) {
		double speed = 0;
		speed*=.0013;
		speed = Math.floor((speed*100)) / 100;
		return speed;
	}

	public void fly() {
		System.out.println("model - " + model + " speed - " + speed + "speed in mach - " + this.getSpeedInMach(speed) + " range - " + range + " price - " + price
				+ " flight time - " + flightTime + "\n");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "model - " + model + "   speed - " + speed + "   range - " + range + "   price - " + price;
	}

}
