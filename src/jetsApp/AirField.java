package jetsApp;
import jets.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AirField {
	
	// need to file read here from jets.txt
	// read the five jets to the array list in AirField
	// "the method to parse a file into Jet objects should
	// return a List<Jet> with parameter String "jets.txt"
	// use String.split() to break each line using commas
	// to break each line in the file into data

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
				
				
//				List<String> = (line.split(",");
				switch(counter) {
					case(0):
						AWACS awacs = new AWACS(newModel, newSpeed, newRange, newPrice);
						awacs.fly();
						counter++;
				}
				
				
				
				
				listOfJets.add(null);
						
						
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
