package jets;
import jetsApp.*;

public class AWACS extends Jets{
	public AWACS(String model, double speed, int range, long price) {
		this.setModel(model);
		this.setSpeed(speed);
		this.setRange(range);
		this.setPrice(price);
		
	}
	public AWACS() {
		
	}
	@Override
	public void fly() {
		System.out.println( "Jets [model=" + this.getModel() + ", speed=" + this.getSpeed() + ", range=" + this.getRange() + ", price=" + this.getPrice() + "]");
	}

}
