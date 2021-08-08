package jetsApp;


import java.util.Scanner;
import jets.*;

public class JetsApp {
	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.launch();
	}

	public void launch() {
		AirField af = new AirField();
		af.createListOfJets("jets.txt");

		Scanner sc = new Scanner(System.in);
		while(true) {
			printMenu();
			int choice;
			System.out.print("Choice: " ); 
			choice = sc.nextInt();
			
			
			
			switch(choice) {
				case(1):
					System.out.println("\t\t\tList of Jets");
					System.out.println("\t===========================================\n");
					for (Jets j : af.listOfJets) {
						System.out.println(j.toString());
					}
					continue;
					
				case(2):
					for (Jets j : af.listOfJets) {
						j.fly();
					}
					continue;
					
				case(3):
					Jets jet = new JetsImpl();
					for (Jets j : af.listOfJets) {
						if (j.getSpeed() > jet.getSpeed()) {
							jet = j;
						}
					}
					System.out.println(jet.toString());
					continue;
					
				case(4):
					Jets newjet = new JetsImpl();
					for(Jets j : af.listOfJets) {
						if(j.getRange() > newjet.getRange()) {
							newjet = j;
						}
					}
					System.out.println(newjet.toString());
					continue;
					
				case(5):
					CargoPlane cargo = new CargoPlane();
					cargo.loadCargo();
					continue;
					
				case(6):
					SpyPlane rc = new SpyPlane();
					rc.spy();
					continue;
					
				case(7):
					SatellitePlane awacs = new SatellitePlane();
					awacs.searchForAircraft();
					continue;
					
				case(8):
					AttackPlane a10 = new AttackPlane();
					a10.pewPew();
					continue;
				case(9):
					Fighter fighter = new Fighter();
					fighter.dogfight();
					continue;
					
				case(10):
					String model; double speed; int range; long price;
					System.out.println("What model is the jet?");
					System.out.print("model: "); sc.nextLine();
					model = sc.nextLine();
					
					System.out.println("What's its max speed?");
					System.out.print("speed: ");
					speed = sc.nextDouble();
					
					System.out.println("What's its range?");
					System.out.print("range: "); 
					range = sc.nextInt();
					
					System.out.println("What's its price?");
					System.out.print("price: ");
					price = sc.nextLong();
					
					JetsImpl newJet = new JetsImpl(model, speed, range, price);
					af.listOfJets.add(newJet);
					continue;
					
				case(11):
					System.out.println("Which jet would you like to remove?");
					int i=1;
					for (Jets j : af.listOfJets) {
						System.out.println(i + ": " + j.toString());
						i++;
					}
					int remove = sc.nextInt();
					af.listOfJets.remove(remove-1);
					
					continue;
					
				case(12):
					System.out.println("Goodbye");
					break;
			}
			break;
		}
			
	}
		

	public void printMenu() {
		System.out.println("\nChoose an option \n" + "1. List fleet \n" + "2. Fly all jets \n"
				+ "3. View fastest jest \n" + "4. View jet with longest range \n" + "5. Load cargo \n" + "6. Spy \n"
				+ "7. Search for aircraft \n" + "8. Pew Pew! \n" + "9. Add a jet to Fleet \n"
				+ "10. Remove a jet from Fleet \n" + "11. Quit");

	}

}
