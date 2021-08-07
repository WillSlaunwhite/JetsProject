package jetsApp;
import jets.*;

public class JetsApp {
	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.launch();
		
	}
	
	public void launch() {
		// method in airfield that reads five jets
		// and stores them in the public list in 
		// public list in airfield
		
		AirField af = new AirField();
		af.createListOfJets("jets.txt");
		
	}

}
