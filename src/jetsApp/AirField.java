package jetsApp;
import jets.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AirField {
	public List<Jets> listOfJets = new ArrayList<>();
		
	public void createListOfJets(String fileName){
		BufferedReader br = null;
		try { 
			br = new BufferedReader(new FileReader(fileName));
			String line;
			int counter=0;
			while((line = br.readLine()) != null) {
				String[] list= line.split(",");
				String newModel = list[0];
				double newSpeed=Double.parseDouble(list[1]);
				int newRange=Integer.parseInt(list[2]);
				long newPrice=Long.parseLong(list[3]);
				
				
				switch(counter) {
					case(0):
						SatellitePlane awacs = new SatellitePlane(newModel, newSpeed, newRange, newPrice);
						listOfJets.add(awacs);
						counter++;
						continue;
					case(1):
						CargoPlane cargo = new CargoPlane(newModel, newSpeed, newRange, newPrice);
						listOfJets.add(cargo);
						counter++;
						continue;
					case(2):
						SpyPlane rc = new SpyPlane(newModel, newSpeed, newRange, newPrice);
						listOfJets.add(rc);
						counter++;
						continue;
					case(3):
						AttackPlane jet = new AttackPlane(newModel, newSpeed, newRange, newPrice);
						listOfJets.add(jet);
						counter++;
						continue;
					case(4):
						Fighter fighter = new Fighter(newModel, newSpeed, newRange, newPrice);
						listOfJets.add(fighter);
						counter++;
						
				}
				
			}
			
		}
		catch(IOException e) {
			System.err.println(e);
		}
		finally {
			if (br != null) {
				try {
					br.close();
				}
				catch(IOException e) {
					System.err.println(e);
				}
			}
		}
	}
}
