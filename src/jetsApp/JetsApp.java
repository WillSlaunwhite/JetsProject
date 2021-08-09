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
		while (true) {
			printMenu();
			int choice;
			System.out.print("Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case (1):
				System.out.println("\t\t\tList of Jets");
				System.out.println("\t===========================================\n");
				for (Jets j : af.listOfJets) {
					System.out.println(j.toString());
				}
				continue;

			case (2):
				String jetType;
				System.out.println("What Jet type would you like to launch?\n"
						+ "\nSatellite Jet \t Cargo Jet \t Attack Jet \t Spy Jet \t Fighter Jet \t All Other ");
				sc.nextLine();
				jetType = sc.nextLine().replaceAll(" ", "");
				if(jetType=="AllOther") { jetType = "JetsImpl"; }
				
				for (Jets j : af.listOfJets) {
					String test = j.getClass().toString();
					if (test.toUpperCase().contains(jetType.toUpperCase())) {
						System.out.println("\n\t\t\t======= " + j.getModel().toUpperCase() + "s Take Flight =======");
						
						j.fly();
					}
				}
				continue;

			case (3):
				System.out.println("\t\t\tJets Take Flight");
				System.out.println("\t=============================================\n");
				for (Jets j : af.listOfJets) {
					j.fly();
				}
				continue;

			case (4):
				Jets jet = new JetsImpl();
				for (Jets j : af.listOfJets) {
					if (j.getSpeed() > jet.getSpeed()) {
						jet = j;
					}
				}
				System.out.println("\t\t\tFastest Jet");
				System.out.println("\t===========================================\n");
				System.out.println(jet.toString());
				continue;

			case (5):
				Jets newjet = new JetsImpl();
				for (Jets j : af.listOfJets) {
					if (j.getRange() > newjet.getRange()) {
						newjet = j;
					}
				}
				System.out.println("\t\t\tFurthest Range");
				System.out.println("\t===========================================\n");
				System.out.println(newjet.toString());
				continue;

			case (6):
				for (Jets j : af.listOfJets) {
					if (j instanceof CargoJet) {
						((CargoJet) j).loadCargo();
					}
				}
				continue;

			case (7):
				for (Jets j : af.listOfJets) {
					if (j instanceof SpyJet) {
						((SpyJet) j).spy();
					}
				}
				continue;

			case (8):
				for (Jets j : af.listOfJets) {
					if (j instanceof SatelliteJet) {
						((SatelliteJet) j).searchForAircraft();
					}
				}
				continue;

			case (9):
				for (Jets j : af.listOfJets) {
					if (j instanceof AttackJet) {
						((AttackJet) j).pewPew();
					}
				}
				continue;

			case (10):
				for (Jets j : af.listOfJets) {
					if (j instanceof FighterJet) {
						((FighterJet) j).dogfight();
					}
				}
				continue;

			case (11):
				String model;
				double speed;
				int range;
				long price;
				System.out.println("What model is the jet?");
				System.out.print("model: ");
				sc.nextLine();
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

			case (12):
				System.out.println("Which jet would you like to remove?");
				int i = 1;
				for (Jets j : af.listOfJets) {
					System.out.println(i + ": " + j.toString());
					i++;
				}

				int remove = sc.nextInt();
				af.listOfJets.remove(remove - 1);
				continue;

			case (13):
				System.out.println("Goodbye");
				break;

			default:
				System.out.println("\n\n\nInvalid input, please try again.\n\n");
				continue;
			}
			sc.close();
			break;
		}

	}

	public void printMenu() {
		System.out.println("\nChoose an option \n" + "1. List fleet \n" + "2. Fly specific type of jet \n"
				+ "3. Fly all jets \n" + "4. View fastest jet \n" + "5. View jet with longest range \n"
				+ "6. Load cargo \n" + "7. Spy \n" + "8. Search for aircraft \n" + "9. Pew Pew! \n" + "10. Dogfight! \n"
				+ "11. Add a jet to Fleet \n" + "12. Remove a jet from Fleet \n" + "13. Quit");

	}

}
