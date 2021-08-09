package jets;

public abstract class Jets {
	protected String model;
	protected double speed;
	protected int range;
	protected long price;
	protected double flightTime;
	private boolean inFlight;

	public Pilot pilot;

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
		speedInMiles /= 767;
		speedInMiles = Math.floor((speed * 100)) / 100;
		return speedInMiles;
	}

	public void fly() {
		System.out.println("Model: " + model.toUpperCase() + "\tSpeed: " + speed + "\tRange: " + range + "\tPrice: "
				+ getPriceInDollars(price) + "\tFlight Time: " + flightTime + " hours");
	}

	public boolean isInFlight() {
		return inFlight;
	}

	public void setInFlight(boolean inFlight) {
		this.inFlight = inFlight;
	}

	@Override
	public String toString() {
		return "Model: " + model.toUpperCase() + "\tSpeed: " + speed + "\tRange:" + range + "\tPrice:" + price;
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

	public String getPriceInDollars(long price) {
		String dollarAmount = "";
		if ((price / 1000000000) >= 1) {
			price /= 1000000000;
			dollarAmount = String.valueOf(price).concat(" billion");
			return dollarAmount;
		} else if ((price / 1000000) >= 1) {
			price /= 1000000;
			dollarAmount = String.valueOf(price).concat(" million");
			return dollarAmount;
		} else if ((price / 1000) >= 1) {
			price /= 1000;
			dollarAmount = String.valueOf(price).concat(" thousand");
			return dollarAmount;
		} else {
			dollarAmount = "0";
			return dollarAmount;
		}

	}

	public void setPrice(long price) {
		this.price = price;
	}

}
