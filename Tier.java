/**
 * This class is a base class of form of an interface that is used to determine the class of passemnger
 * This is an interfce class that can be used by other classes that implements the the Tier class
 * 
 * Since this class is an interface it does not determine anything. It is just used to set a reference for other class.
*/
public interface Tier{
    public String getName();  //Method to return the name of the Tier
    public int getMiles(); // Method to return the miles of the passenger
    public int getCancelledFlights(); //Method to return the total cancelled flights.
    public int getFlights(); // Method to return total flights no matter if they are cancelled or not.
    public void addFlight(boolean isCancelled); // This methods add a flight as a cancelled flight if it was cancelled.
}
