/*This class determines the Passenger id from the data and returns the calculations which are totalmiles,
totalCancelledFlights and totalFlights.
This class also determines the tier of the passenger depending on the total flight cancellation and the special case
which is if the passenger is classified in platinum pro or super executive platinum pro or not.
*/
public class Passenger {
    
    /**
     * @param tier - of type Tier is used for determining the passenger tier.
     * @param totalMiles - used to calcualte the total miles earned by the passenger.
     * @param totalCancelledFlights - used to calculate the totalCancelledFlights og the passenger.
     * @param totalFlights - used to calculate the total flight no matter if it was cancelled or not.
     * @check - used to determine if the passenger earned milage multiplier or not.
     * 
     */
    private int id;
    private Tier tier;
    private int totalMiles;
    private int totalCancelledFlights;
    private int totalFlights;
    private boolean check = true;
    
    /** 
     * @param = id is the id of the passenger.
     * @method setId(int id) - this method sets the id of the passenger to the current id.
     */
    public void setId(int id){
        this.id = id;
    }
    /** 
     * @method getId()- this method returns/gets the id of the passenger.
     */
    
    public int getId(){
        return this.id;
    }
    //This is a constructor that initializes the tier as no Tier.
    public Passenger()
    {
        tier = new noTier(totalMiles, totalCancelledFlights, totalFlights);
        //check = false;
    }
    
    /**
     * @method getName - return the name of the Tier.
     */
    public String getName() {  
         return tier.getName();
    }
    /**
     * @method getMiles() - returns the total miles earned by the passenger of a particular tier.
     */
    public int getMiles() {   
        return tier.getMiles();
    }
    
    /**
      * @method getCancelledFlights() - return the total cancelled flights. 
      */
    public int getCancelledFlights() { 
        return tier.getCancelledFlights();
    }
    

    public void setCheck(boolean check) // Used to set check which is used for calculating hasMultiplier().
    {
        this.check = check;
    }
    /** 
     * @method hasMulitplier()- this method return true if the flight was cancelled and passenger did not complain for all the flight.
     */
    public boolean hasMultiplier() {
         return this.check;  
    }
    /**
     * This method is used to determine the tier of the passenger as to whether if the passenger is in gold, platinum,
     * platinum pro, executive platinum or super executive platinum tier.
     */
    public void tierUpgrade() {
        if(totalCancelledFlights >= 25 && totalCancelledFlights < 50)
        {
            this.tier = new Gold(tier.getMiles(), totalCancelledFlights, totalFlights);
            
        }
        if(totalCancelledFlights >= 50 && totalCancelledFlights < 100)
        {
            if(hasMultiplier() == false){
                
            this.tier = new Platinum(getMiles(), totalCancelledFlights, totalFlights);
            }
            else if(hasMultiplier() == true){
                this.tier = new PlatinumPro(getMiles(), totalCancelledFlights, totalFlights);
            }
        }
        
        if(totalCancelledFlights >= 100)
        {
            
            if(hasMultiplier() == false ){
            this.tier = new ExecutivePlatinum(tier.getMiles(), totalCancelledFlights, totalFlights);
            }
            else {
                this.tier = new SuperExecutivePlatinum(tier.getMiles(), totalCancelledFlights, totalFlights);
            }
        }
    }
    /**
     * @param addFlifght(isCancelled) - adds flight of a the respective tier.
     * @param isCancelled - brings in true or false and depending on that calcualted the miles, cancelled flights
     * and totalFlights.
     */
    public void addFlight(boolean isCancelled) {    // adds a new flight
        tier.addFlight(isCancelled);    // add the flight to the current tier
        totalFlights++; // add 1 to the total number of flights
        
        if (isCancelled) {  // if the flight was cancelled
            totalCancelledFlights++;    // add 1 to the total number of cancelled flights
        }
        
    }
}