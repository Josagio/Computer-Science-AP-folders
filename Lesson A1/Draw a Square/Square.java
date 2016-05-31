import gpdraw.*;
/**
 * Square: This class will create a piece of paper and a pencil,
 * place the pencil on the paper, and then draw a square.
 * 
 * @author Robert J. Leggio lll
 * @V0.0.2 (Lesson A1)
 */
public class Square
{
    private DrawingTool pencil;
    private SketchPad paper;
    private int printDelay;
     
    /**
     * Constructor:
     * Instantiates paper and pencil to basic
     * values.
     */
    public Square()
    {
        paper = new SketchPad(300, 300);
        pencil = new DrawingTool(paper);
    }

     /**
      * This method will run all of the 
      * commands necessary to draw the square.
      */
    public void draw()
    {
      pencil.forward(100);
      pencil.turnLeft(90);
      pencil.forward(100);
      pencil.turnLeft(90);
      pencil.forward(100);
      pencil.turnLeft(90);
      pencil.forward(100);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     /**
      * This was created during the delay in
      * class
      */
    public void printDelay()
    {
      int printDelay;
      {
         System.out.println("____________________________"); 
         System.out.println("hello world,");
         System.out.println("my name is Robert J. Leggio");
         System.out.println("Im the author of this code");
         System.out.println("----------------------------");
      }    
    }   
    
    
    
    
}
