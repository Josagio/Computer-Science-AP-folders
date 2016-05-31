
/**
 * Write a description of class machine here.
 * 
 * 1.   Methods are not documented
 * 
 * @author: Robert Leggio III 
 * @version: 0.0.3
 */
public class Machine
{
    private int cent;
    private int cents;
    private int quarters;
    private int dime;
    private int penny;
    private int nickels;
    private int pen;
    private int quart;
    private int dimes;
    private int nic;
    private int remainder;
    private int value;
    private int leftovers;
    private String user;
    private int cash;
    private int change;
    /**
     * Constructor for objects of class machine
     */
    public Machine(int cents)
    {
      cent = cents;  
      quarters = 25;
      dimes = 10;
      nickels = 5;
      penny = 1;
    }

    public void calculate(String user, int cent)
    {  
      System.out.println("______coin machine____");
      System.out.println("####################");
      System.out.println("hello " + user + ",");
      System.out.println("here is your change");
      System.out.println(cent + " cents  =>");
      int valueQuarter = cent / quarters;
      System.out.println("Quarter(s)" + valueQuarter);
      int remainder = cent % quarters;
      int dime = remainder / dimes;
      System.out.println("Dime(s)" + dime);
      int value = remainder % dimes;
      int nickel = value / nickels;
      System.out.println("Nickel(s)" + nickel);
      int leftover = value % nickels;
      int penny = leftover;
      System.out.println("Penny(s)" + penny);
      int cash = cent / 100;
      int change = cent % 100;
      System.out.println("Total: $" + cash + "." + change);
      System.out.println("-----------------------");
      System.out.println("created by Robert Leggio");
      System.out.println("Version: 0.0.3");
    }    
    public void totalCash(int cents)
    {
      int cent = cents;  
      int cash = cent / 100;
      int change = cent % 100;    
      System.out.println("Total: $" + cash + "." + change);
    }   
}