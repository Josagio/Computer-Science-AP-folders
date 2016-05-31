
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    private int number;

    /**
     * Constructor for objects of class Fibonacci
     */
    public Fibonacci()
   {
    // nothing is used in the default fibonacci construcror

   }
   

   /**
     * This will calculate fibonacci
     * and get you the fibonacci number
     */
   public int printFibonacci(int number)
    {
     
        if((number == 0) || (number == 1)){
            return number;
    }else{
        return printFibonacci(number -2) + printFibonacci(number -1);
    }
    
    }
}
