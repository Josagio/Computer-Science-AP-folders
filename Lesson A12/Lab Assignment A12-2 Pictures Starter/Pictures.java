import gpdraw.*;
import java.util.Random;
import java.awt.Color;

/** 
 * 
 * A class to draw various visuals using loops.
 *
 * @author 
 * 
 */

public class Pictures{
   
    /**
     * Prints a Multiplication table given the number of rows and columns
     * @param  rownum  Number of rows
     * @param  colnum  Number of columns
     */
   public static void printTable (int rownum, int colnum){
      int  row, col;
      int temp;
      col=1;
      System.out.print("   |");
      for(row = 1; row <= rownum; row++){
          System.out.print(pad(row) + " ");
        }
      System.out.println();
      //creates a space in the 
      System.out.print("---+");
      for(row = 1; row <= rownum; row++){
          System.out.print("----");
        }
        System.out.println();
        //main table
      for(row = 1; row <= rownum; row++){
          System.out.print(pad(row) + "|");
         for(col = 1; col <= colnum; col++){
             System.out.print(pad(row * col) + " ");
            }
         System.out.println();
        } 
     
      System.out.println();
      System.out.print("_________________________________________________________________________");
      
   }
   
    private static String pad(int x) {
      String s = new String();
      if (x < 10) s = "  " + x;
      else if (x < 100) s = " " + x;
      else s = "" + x;
      return s;
   }
   

   /**
    * Displays a pyramid pattern of stars 
    * @param  n  Number of lines to print
    */
   public static void pyramid (int n){
      int line, blanks, stars, temp;

      System.out.println();
      for (line = 1; line <= n; line++){
          blanks = n - line;
          stars = line * 2 - 1;
          for(temp = 1; temp <= blanks; temp++){
              System.out.print(" ");
            }
          for ( temp = 1; temp <= stars; temp++){
              System.out.print("*");
            }
            System.out.println();
        }
   }

   
   /**
    * Draws a sunburst pattern using the DrawingTool. The sunburst consists of 360 lines
    * each one degree apart. Uses the Color Class to change the colors of the pattern
    */
  public static void drawSunburst(){
    int max = 500;
    DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
	Random die = new Random();

    pen.down();
    for (int line = 0; line < 360; line++){
        pen.setColor(new Color(die.nextInt(256), die.nextInt(256), die.nextInt(256)));
        pen.forward(max / 2 - 30);
        pen.backward(max / 2 - 30);
        pen.turnRight(1);
    }
    

    // Draw 120 lines from center of drawing area to edge
    
  }

}
