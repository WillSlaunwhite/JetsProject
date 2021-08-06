package jets;

public abstract class Jets {
	private String model;
	private double speed;  // needs to be given in mph and mach
	private int range;
	private long price;
	
	public void fly() {
		// prints details of jet and the amount of time the jet can
		// fly until it runs out of fuel (based on speed and range)
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

	
}
