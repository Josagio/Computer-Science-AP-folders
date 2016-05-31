import java.util.*;
/**
 *  A utility class for Strings.
 *
 *  @author     <Robert J. Leggio>
 *  @created    <0.0.7>
 */

public class StringUtil {
    private static boolean vowels;
    /**
     *  Returns String s converted into Pig Latin.
     *  This method calls the helper method deWord(s)
     *  which will return the word in Pig latin
     */
    public static String PigLatin(String s){
        //Type code here
        return deWord(s);
    }

    /**
     * Recursively splits the String into individual 
     * words and calls latinate.
     */
    private static String deWord(String s){
        String front, back;
        if(s.indexOf(' ') > -1){
            front = s.substring(0, s.indexOf(' '));
            back = s.substring(s.indexOf(' ')+1);
            return latinate(front + "" + deWord(back));  
        }else{
            return latinate(s);
        } 
        //Type code here
    }

    /**
     * Applies the rules for Pig Latin to the String.
     * precondition: s is a single word with no spaces
     * Lab Assignment A9.1 Problem #4
     */
    private static String latinate(String s){   
        String start, end, trans;
        boolean vowels = false;
        if(s.indexOf('a') > -1){  
            //Check first case: if no vowels, return word + "ay"
            vowels = true;
        }
        
        if(s.indexOf('e') >-1){
            vowels = true;
        }
        
        if(s.indexOf('i') >-1){
            vowels = true;
        }
        
        if(s.indexOf('o') >-1){
            vowels = true;
        }
        
        if(s.indexOf('u') >-1){
            vowels = true;
        }

        //Check second case: if first letter is a vowel return, "yay"
        String temp =s.toLowerCase();
        char first = temp.charAt(0);
        if (first == 'a' || first == 'e' || first == 'i' ||
             first == 'o' || first == 'u'){
            return s + "yay";
           }
        //Otherwise, place front consonants on the back + "ay"
        int decide;
        char it;
        char capital;
        decide = s.indexOf('a');
        it = 'a';
        //Type your control statements here
        if ((decide > s.indexOf('e') && s.indexOf('e') != -1) || decide == -1){
            decide = s.indexOf('e');
            it = 'e';
        }    
        
         if ((decide > s.indexOf('i') && s.indexOf('i') != -1) || decide == -1){
            decide = s.indexOf('i');
            it = 'i';
        }    
        
         if ((decide > s.indexOf('o') && s.indexOf('o') != -1) || decide == -1){
            decide = s.indexOf('o');
            it = 'o';
        }    
        
         if ((decide > s.indexOf('u') && s.indexOf('u') != -1) || decide == -1){
            decide = s.indexOf('u');
            it = 'u';
        }    
        start = s.substring(0, s.indexOf(it));
        end = s.substring(s.indexOf(it));
        
        
        //check for capitalization
        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
           start = start.toLowerCase();
           capital = end.charAt(0);
           trans = Character.toString(capital).toUpperCase();
           trans += end.substring(1);
           end = trans;
            
            
        }
        
        
       
        // return end + start + ay
        return end + start + "ay";
     
   }
    
    
    /**
     *  Returns true if s is a palindrome, false if not.
     *  This method will use the helper method compress(s)
     *  Lab Assignment A9.1 Problem #3
     */
     public static boolean palindrome(String s){
        s = removeChar(' ', s);
        s = removeChar('\'', s);
        s = removeChar('.',s);
        s = removeChar(':',s);
        s = removeChar(';',s);
        s = removeChar(',',s);
        s = removeChar('?',s);
        s = removeChar('!',s);
        s = removeChar('"',s);
        s = removeChar('@',s);
        s = removeChar('#',s);
        s = removeChar('$',s);
        s = removeChar('%',s);
        s = removeChar('^',s);
        s = removeChar('&',s);
        s = removeChar('*',s);
        s = removeChar('+',s);
        s = removeChar('_',s);
        s = removeChar('-',s);
        s = removeChar('=',s);
        return match(s);
     }
     
     /**
      * Removes all punctuation and converts s to lower case.
      */
     private static String compress(String s){
        //Type the necessary statements here
        return s;
     }
     
     /**
      * Returns a String with the specified char removed from s
      */
     private static String removeChar(char c, String s){
        String one, two;
        //Type control structure to remove the specified character
        //come back to 
        return s;
        //DO NOT FORGET
     }
     
     /**
      * Recursively Compares front and end values.  If they match, remove them
      * and call the method again with the ends removed.  If they 
      * ever don't match, return false.  If we reach 0 or 1 length, return true.
      */
     private static boolean match(String s){
        String reduce;
        int length = s.length();
        //If length is 1, we've reduced as far as possible.
        if (length == 1){
            return true;
        }
        //If length is 2, we can't reduce anymore so evaluate here
        if ( length == 2){
            if (s.charAt(0) == s.charAt(length - 1)){
                return true;
            }else{
                return false;
            }
        }
        //Otherwise, remove ends and call match again
       if (s.charAt(0) == s.charAt(length -1)){
           reduce = s.substring(1, length-1);
           return match(reduce);
        }else{
            return false;
        }
     }
    
    
    /**
     *  Returns a String that is s in reverse.
     *  Lab Assignment A9.1 Problem #2
     */
     public static String reverse(String s){
        int length = s.length();
        String front, back;
          if(length > 1){
            front = s.substring(0);
            back = s.substring(s.indexOf(0)+1);
            return (front + reverse(back));  
        }else {
            return latinate(s);
        } 
        //Type the necessary control statement here
        
     }

     
     
    }


