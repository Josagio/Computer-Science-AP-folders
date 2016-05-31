
/**
 * Thid is a modified version of fibonacci
 * and will be usint the recursive rule of multiplication
 * 
 * @author Robert J. Leggio  
 * @version:0.0.2
 */
public class Multiplication
{
   private int limit;

    /**
     * different version of fibonacci using
     * multiplication as the replacements
     * this is used to setup the limit to help the calculation work
     */
    public Multiplication()
    {
        // adding a, b times
    }
    
    /**
     * The calculations for multiplications
     */
    public int calculateMultiplication(int valueA, int valueB)
   {
    int number = valueA;   
    if(valueB == 0){
        return 0;
    }else if(valueB == 1){
          return number;
        }else{
      return valueA + calculateMultiplication(valueA,valueB - 1);
    }   
    
   } 
  }

