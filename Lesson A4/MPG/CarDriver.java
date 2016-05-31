
/**
 * Write a description of class CarDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarDriver
{
    private Car auto;
    
    /**
     * Constructor for objects of class CarDriver
     */
    public CarDriver()
    {
        auto = new Car(15);
    }

    public void testCar()
    {
      Car auto = new Car(15);
      int testOdometerReading = 15;
      System.out.println("________________________________");
      System.out.println("New car odometer reading: " + testOdometerReading);
      auto.fillup(150,8);
      System.out.println("Miles per gallon: " + auto.calculateMPG());
      System.out.println("Miles per gallon: " + auto.calculateMPG());
      auto.resetMPG();
      auto.fillup(350, 10);
      auto.fillup(450, 20);
      System.out.println("Miles per gallon: " + auto.calculateMPG());
      auto.resetMPG();
      auto.fillup(603, 25.5);
      System.out.println("Miles per gallon: " + auto.calculateMPG());
      System.out.println("----------------------------------");
      System.out.println("Created by: Robert J. Leggio III");
      System.out.println("Version: 0.0.9");
      System.out.println("___________________________________");
    }   
    
   
}
