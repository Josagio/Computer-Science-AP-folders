import java.util.Scanner;
/**`
 * Checks size and weight of a package
 * 
 * @author: Robert J. Leggio III
 * @version:0.0.1
 */
public class CheckMail
{
    private int myWeight, myLength, myWidth, myHeight;

    /**
     * Constructor: initializing fields to default values
     */
    public CheckMail()
    {
       myWeight = myLength = myWidth = myHeight = 1;
       System.out.println("Check Mail Machine");
       System.out.println("by: Robert J. Leggio III");
       System.out.println("Version:0.0.8");
       System.out.println("Please enter your measurements for your mail");
       System.out.println("#########################");
    }
    /**
     * Constuctors: Initialize fields to user values
     */
    public CheckMail(int weight,int length ,int width, int height)
    {
       myWeight = weight;
       myLength = length;
       myWidth = width;
       myHeight = height;
       System.out.println("Check Mail Machine");
       System.out.println("by: Robert J. Leggio III");
       System.out.println("Version:0.0.8");
       System.out.println("#########################");
    }  
    /**
     * Obtains data from the user
     */
    public void dataInput()
    {
      //initializes the keyboard to be used  
      Scanner keyboard = new Scanner(System.in);
      int temp = 0;
      System.out.println("************************************");
      System.out.print("Enter the weight --->");
      //lets the user type the int
      myWeight = keyboard.nextInt();
      
      
      System.out.println("Enter three deimensions seoarated by spaces -->");
      myLength = keyboard.nextInt();
      myWidth = keyboard.nextInt();
      myHeight = keyboard.nextInt();
    
      if(myWidth > myLength){
          temp = myWidth;
          myWidth = myLength;
          myLength = temp;
          // learn how to swap them with only two statements      
      }   
      if(myHeight > myLength){
        temp = myHeight;
        myHeight = myLength;
        myLength = temp;
      }
         
      System.out.println("input Complete");
      System.out.println("**************************************");
    }
    
    /**
     * Print out the solution
     */
    public void printAnswer()
    {
      int girth;  
      final int MAX_WEIGHT = 70;
      final int MAX_GIRTH = 100;
        
      girth = myLength + (myWidth * 2) + (myHeight * 2);
      
      System.out.println("___________Measurements________");
      System.out.println("Weight =" + myWeight + " lbs");  
      System.out.println("Length =" + myLength); 
      System.out.print("there two dimensions =");
      System.out.println(myWidth + "        " + myHeight);
      System.out.println();//print a blank  line
      System.out.print("  package is -");
      System.out.println("--------------------------------");
      
      //Check package size and weight
     System.out.println("________________Validation___________________");
             if ((girth+myLength>= MAX_GIRTH)&&(myWeight>= MAX_WEIGHT)){
        System.out.println("The package is too large and too heavy");
       } else if ((girth+myLength>=MAX_GIRTH)){
            System.out.println("The package is too large");
        }
        else if ((myWeight>=MAX_WEIGHT)){
            System.out.print("The package is too heavy");
        }else{
                System.out.println("The package is Suitible for use");
            }
     System.out.println("-------------------------------------------");       
    }  
}
