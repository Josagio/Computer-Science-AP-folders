
/** 
 * 
 * A class to solve various loop problems
 * 
 * @author 
 * @version Computer Science AP 2015-2016
 *
 */

public class FunLoops{
    
 /**
   *  Strategy:  compare square and sum, if equal then print, else 
   *  increase appropriate value.  The values of square and sum will 
   *  leap-frog each other, occasionally landing on each other which 
   *  means we have found a magic square.
   */
  public static void magicsquare (long n){
    long  square;        // to hold square of number
    long  number = 1;   // used as source of square value
    long  sum = 0;       // running sum: 1,3,6,10,15,etc.
    long  inc = 1;       // used to get next running sum
    int   count = 1;     // how many magic squares found
    System.out.println("Magic Squares");
    square = n * n;
    System.out.println("___Created By: Robert J. Leggio III___");
    while (count <= n){
        square = number * number; //get current square
        if (square == sum){
             System.out.println("; " + square);
             ++count;
             ++number; //get ready to find the next one
        }else{
           if(sum < square){
             sum += inc;
             ++inc;
            }else{
                //square is smaller, increment number
                ++number;
         }
            
        }
    }
    System.out.println();
    System.out.println("Finished");
  }
    
 /**
  * Determines the Least Common Multiple of two integers For Example the Least Common
  * Multiple of the following pairs:
  *    2, 3		    LCM = 6
  *    4, 10		LCM = 20
  *    12, 15		LCM = 60
  *    7, 70		LCM = 70
  */
  public static void lcm (int a, int b){
    int small, big, temp;  
    System.out.print("Least Common Multiple of " + a + " and " + b);
    if (a < b){
        small = a;
        big = b;
    }else{    
     small = b;
     big = a;
    }
    temp = big;
    while (temp % small != 0){
        temp += big;
    }
    
    System.out.println(" is " + temp);
  
  } 
}

