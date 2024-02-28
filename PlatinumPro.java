import java.util.*;
/**
 * This is a special class of platinum for passengers who had 50-99 flight cancellations but did not complain for any
 * of them. such passengers get 2000 miles for each flight cancellation.

 * @param miles miles are used to calculate and return the total miles earned by the passenger.
 * @param cancelledFlights is used to calculate the total cancelled flight of the passenger and return it.
 * @param totalFlights is used to calcualte the total flights whether it was cancelled or not of the passenger and return it.
 * 
 * In this class as well each method returns a something that is required for the calculations.
*/


public class PlatinumPro implements Tier{
    /**
     * @param miles miles are used to calculate and return the total miles earned by the passenger.
 * @param cancelledFlights is used to calculate the total cancelled flight of the passenger and return it.
 * @param totalFlights is used to calcualte the total flights whether it was cancelled or not of the passenger and return it.
 * */
    
     private int miles;
    private int cancelledFlights;
    private int totalFlights;
    
    
    public PlatinumPro(int miles, int cancelledFlights, int totalFlights ){ //Constructor
        this.miles = miles;
       this.cancelledFlights = cancelledFlights;
        this.totalFlights = totalFlights;
    }
    /**
     * @method getName - return the name of the Tier.
     */
    
    public String getName()
    {
        return "Platinum Pro";
    }
    
    /**
     * @method getMiles() - returns the total miles earned by the passenger.
     */
    public int getMiles(){
         return miles;
     }
     
     /**
      * @method getCancelledFlights() - return the total cancelled flights. 
      */
    public int getCancelledFlights(){
        return cancelledFlights;
    }
    
    /** 
     * @method getFlights() - returns the total number of flights.
     */
    public int getFlights(){
        return totalFlights;
    }
    
    /**
     * @param isCancelled - brings in true or false and depending on that calcualted the miles, cancelled flights
     * adn totalFlights.
     */
    public void addFlight(boolean isCancelled){
    if(isCancelled)
    {
        this.miles += 2000;
        cancelledFlights++;
    }
    totalFlights++;
    }
}