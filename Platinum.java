import java.util.*;
/**
This class implements from the base class that returns the total miles, total cancellation flights, and total flights
 * calculated over the year for a particular passenger.
 * The passenger will be converted into this class if that passenger has between 50-99 flight cancellations and will
 * get each flight cancellation worth 1000 miles.
 
 * In this class as well each method returns something depending on the need.
 */

public class Platinum implements Tier {
    /**
     * @param miles miles are used to calculate and return the total miles earned by the passenger.
 * @param cancelledFlights is used to calculate the total cancelled flight of the passenger and return it.
 * @param totalFlights is used to calcualte the total flights whether it was cancelled or not of the passenger and return it.
 * */
    private int miles;
    private int cancelledFlights;
    private int totalFlights;
    
    public  Platinum(int miles, int cancelledFlights, int totalFlights)
    {
        this.miles = miles;
        this.cancelledFlights = cancelledFlights;
        this.totalFlights = totalFlights;
    }
    /**
     * @method getName - return the name of the Tier.
     */
     
    public String getName()
    {
        return "Platinum";
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
            miles += 1000;
            cancelledFlights++;
        }
        totalFlights++;
    }

}