package jets;
import jetsApp.*;

public class JetsInterface {
	// 1. List fleet
	// 2. Fly all jets
	// 3. View fastest jet						must search collection for appropriate jet.
	// 4. View jet with longest range			must search collection for appropriate jet.
	// 5. Load all cargo jets					load cargo and fighter are defaults add three more
	// 6. Dogfight!								load cargo and fighter are default add three more
	// 7. Add a jet to fleet					can add a custom jet to the fleet using jetimpl
	// 8. Remove a jet 							can select a jet to delete by number
	// 9. Quit
	
	public void launchMainInterface() {
		// main menu here
		
		System.out.println(
				"Choose an option \n" +
				"1. List fleet \n" +
				"2. Fly all jets \n" +
				"3. View fastest jest \n" +
				"4. View jet with longest range \n" +
				"5. Load cargo \n" +
				"6. Spy \n" +
				"7. Search for aircraft \n" +
				"8. Pew Pew! \n" +
				"9. Add a jet to Fleet \n" +
				"10. Remove a jet from Fleet \n" +
				"11. Quit"
				);
	}
	
	
}
