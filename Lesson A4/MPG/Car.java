
/**
 * Write a description of class Car here.
 * 
 * @author: Robert J. Leggio III
 * @version: v0.0.1
 */
public class Car
{
    private int myStartMiles;  //Start reading
    private int myEndMiles;    //End Reading
    private double myGallonsUsed; //Gallons of gas used during trip
    private int odemeterReading;
    private int gallon;
    private double fillup;
    private double mpgValue;
    /**
     * Creates a new instance of a car object with the startin
     * odemeter readings
     */
    public Car(int odometerReading)
    {
     myStartMiles = odemeterReading;
    }
  
    public void fillup(int odemeterReading, double gallons)
    {
      myEndMiles = odemeterReading;
      myGallonsUsed = gallons;
    }    
    
    public double calculateMPG()
    {
     double mpgValue;
     mpgValue = (myEndMiles - myStartMiles) / myGallonsUsed;
     return mpgValue;   
    }   
    
    public double resetMPG()
    {
      mpgValue = 0;
      return mpgValue;
    }   
    
  

}    
