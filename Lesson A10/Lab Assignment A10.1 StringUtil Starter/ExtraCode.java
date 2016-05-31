
/**
 * This is just left here from string util unless it will be used in the future
 * originally was the last two methods in stringUtil
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtraCode
{
    
    
    /**
      *  Returns a String that is s converted into shorthand
      *  Lab Assignment A9.1 Problem #5
      */
      public static String shorthand(String s){
        
        //Because 'U' would be replaced at the removeChar call below,
        //replace "you" with a large number for now.  A number this large
        //would be nearly impossible to encounter on accident, so no
        //accidental replacements should occur (such as could happen by
        //using something like "***" instead)
        s = replace("and", "&", s);
        s =replace("you", "123456789012345678901234567890", s);
        s = replace("to", "2", s);
        s = replace("for", "4", s);
        
        //Finish removing here
        
        //correct for U error
        s = replace("123456789012345678901234567890", "U", s);
        
        return s;
        
      }
     
     /**
      * Replaces all occurrences of x in s with y
      */
     private static String replace(String x, String y, String s){
         String convert;
         
         //Type the necessary control statement here
         
     }
}
