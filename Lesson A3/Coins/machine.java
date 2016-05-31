
/**
 * Write a description of class machine here.
 * 
 * @author: Robert Leggio III 
 * @version: 0.0.3
 */
public class machine
{
    private int c;
    private int cents;
    private int quarter;
    private int dime;
    private int penny;
    private int nickel;
    private int p;
    private int q;
    private int d;
    private int n;
    private int r;
    private int remainder;
    private int value;
    private int leftovers;
    private String user;
    private int cash;
    private int change;
    /**
     * Constructor for objects of class machine
     */
    public machine(int cents)
    {
      c = cents;  
      q = 25;
      d = 10;
      n = 5;
      p = 1;
    }

    public void calcuate(String user)
    {  
      System.out.println("______coin machine____");
      System.out.println("####################");
      System.out.println("hello " + user + ",");
      System.out.println("here is your change");
      System.out.println(c + " cents  =>");
      int quarter = c / q;
      System.out.println("Quarter(s)" + quarter);
      int remainder = c % q;
      int dime = remainder / d;
      System.out.println("Dime(s)" + dime);
      int value = remainder % d;
      int nickel = value / n;
      System.out.println("Nickel(s)" + nickel);
      int leftover = value % n;
      int penny = leftover;
      System.out.println("Penny(s)" + penny);
      int cash = c / 100;
      int change = c % 100;
      System.out.println("Total: $" + cash + "." + change);
      System.out.println("-----------------------");
      System.out.println("created by Robert Leggio");
      System.out.println("Version: 0.0.3");
    }    
    
    
}
