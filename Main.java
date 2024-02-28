import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

/* 

In this program we will demmostrate a rewards program in which we input a flight-data.txt file
that reads in passenger data, flight cancellation and passenger complain. Through this program
we have to calculate the tier status of a particular passenger, mileage earned through total cancellation
flights. We use the concepts of object oriented programming with the use of interface and 
polymorphism to perform the calculations and determine the passenger's tier and milage earned.
This project reads data from a file and demonstrates the calculation.

*/
public class Main
{
	public static void main(String[] args)throws IOException {
		Scanner scnr = new Scanner(System.in);
		int id;
	String cancflight;
		
		String complain;
		ArrayList<Passenger> p = new ArrayList<Passenger>();
		
	FileInputStream fileByteStream = null; // File input stream
    Scanner inFS = null;                   // Scanner object
    fileByteStream = new FileInputStream("flight-data.txt");
    inFS = new Scanner(fileByteStream);
		
		while(inFS.hasNextLine()) //Reads until end of file.
		{
		    String line = inFS.nextLine();
		    String[] values = line.split(" "); //splits input file into an array to use it for calculation.
		    id = Integer.parseInt(values[0]);
		    Passenger passenger = new Passenger();
		    boolean found = false;
		    for(int i = 0; i < p.size(); i++)
		     {
		         if(p.get(i).getId() == id)
		         {
		             passenger = p.get(i);
		             found = true;
		             if(values[1].equals("Y")) // if flight cancellation == Y
		             {
		                 p.get(i).addFlight(true);
		                 
		                 if(values[2].charAt(0) == 'Y') //if complain == Y
		                 {
		                     p.get(i).setCheck(false);
		                 }
		             }
		             else
		             {
		                 p.get(i).addFlight(false);
		             }
		         }
		     }
		     if(found == false)
		     {
		         
		     passenger.setId(id);
		     if(values[1].equals("Y")) // if flight cancellation == Y
		             {
		                 passenger.addFlight(true);
		                 if(values[2].equals("Y")) //if flight cancellation = Y
		                 {
		                     passenger.setCheck(false);
		                 }
		             }
		     else
		             {
		                 passenger.addFlight(false);
		             }
		     
		     
		     p.add(passenger);
		     }
		     passenger.tierUpgrade();
		}
		fileByteStream.close();
		
		int keepGoing = 0;
		boolean foundPass = false;
		do{
		    
		    System.out.print("Enter a passenger id: ");
		         int passId = scnr.nextInt();
		         
		int psize = p.size();
		     for(int i = 0; i < p.size(); i++)
		     {
		         
		         if(p.get(i).getId() == passId) { 
		             foundPass = true;
		             System.out.println();
		             System.out.println("Rewards tire: " + p.get(i).getName());
		             System.out.println("Total Miles earned: " + p.get(i).getMiles());
		             System.out.println("Total cancellations accumulated over the year: " + p.get(i).getCancelledFlights());
		             System.out.println("Earned milage multiplier: " + p.get(i).hasMultiplier());
		         }
		        
		     }
		     if(foundPass == false){
		         System.out.println("Passenger not found");
		     }
		     
		  System.out.println("Enter 1 to continue the search: ");
	      keepGoing = scnr.nextInt();
		}while(keepGoing == 1);
		
	}
}
