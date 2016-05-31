
/**
 * Write a description of class piggyBank here.
 * 
 * @author: Robert J. Leggio III
 * @version: 0.0.1A
 */
public class PiggyBank
{
    private int nickels;
    private int pennys;
    private int dimes;
    private int quarters;
    private int dollers;
    private int storage;
    private int cents;
    private int quart;
    private int dime;
    private int nic;
    private int pen;
    private int total;
    private Machine calc;
    private int totalCoins;
    /**
     * Constructor for objects of class piggyBank
     */
    public PiggyBank()
    {
       cents = 0;
       quart = 0;
       dime = 0;
       nic = 0;
       pen = 0;
       total = 0;
       calc = new Machine(0);
    }
    
      /**
     * Constructor for objects of class for a pre-set piggyBank
     */
    public PiggyBank(int quarters,int dimes,int nickel,int penny)
    {
       quarters = quarters;
       dimes = dimes;
       nickels = nickels;
       pennys = penny; 
       quart = quarters * 25;
       dime = dimes * 10;
       nic = nickel * 5;
       pen = penny;
       total = quart + dime + nic + pen;
       totalCoins = quarters + dimes + nickels + penny;
       Machine calc = new Machine(total);
    }
    
    public void getTotal()
    { 
      Machine calc = new Machine(total);
      calc.calculate("Robert", total); 
    }   
    
    public void getCoins()
    {
      totalCoins = quarters + dimes + nickels + pennys;
      System.out.println("****************");  
      System.out.println("amount of coins =>");
      System.out.println("quarters:" + quarters);
      System.out.println("dimes:" + dimes);
      System.out.println("nickels:" + nickels);
      System.out.println("pennys:" + pennys);
      System.out.println("total coins:" + totalCoins);
      calc.totalCash(total);
      System.out.println("****************");
    }    
    
    public int addQuarters(int moreQuarters)
    {
      quarters += moreQuarters;
      return quarters;
    }   
    public int addDimes(int moreDimes)
    {
      dimes += moreDimes;
      return dimes;  
    }    
    public int addNickels(int moreNickels)
    {
      nickels += moreNickels;  
      return nickels;
    }    
    public int addPennys(int morePennys)
    {
      pennys += morePennys;
      return pennys;
    }    
}
