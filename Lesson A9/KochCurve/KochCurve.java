import gpdraw.*;
/**
 * Write a description of class KochCurve here.
 * 
 * @author Robert Leggio III
 * @version 0.0.5
 */
public class KochCurve
{
    public int length;
    private DrawingTool pencil;
    private SketchPad paper;
    public int level;
     /**
     * Constructor for objects of class KochCurve
     */
    public KochCurve()
    {
        // setus up every method in the class on its positioning and 
        //creates the drawing tool and paper
        paper = new SketchPad(800,800);
        pencil= new DrawingTool(paper);
        pencil.up();
        pencil.move(-50,300);
        pencil.down();
        pencil.drawString("created by Robert J. Leggio III");
        pencil.up();
        pencil.home();
        pencil.turnRight();
        pencil.move(0 , 0);
        pencil.down();
    }
    /**
     * This is used to make the kochCurve
     */
     public void drawKochCurve(int level, int length)
    {
       // uses the recursive rule to draw until it hits level 1 
       if (level <= 1){
           pencil.forward(length);
       } else {
         pencil.down();
         drawKochCurve(level - 1, length/3);
         pencil.turnLeft(60);
         drawKochCurve(level - 1, length/3);
         pencil.turnRight(120);
         drawKochCurve(level - 1, length/3);
         pencil.turnLeft(60);
         drawKochCurve(level - 1, length/3);
       }
        
    }
    /**
     * this will call the drawKochCurve multiple times
     * and will create a snowflake
     */
    public void drawSnowFlake()
    {
     //calls the curve and uses the default level and length of 6 & 300
     drawKochCurve(6,300);
     pencil.turnRight(90);
     drawKochCurve(6,300);
     pencil.turnRight(90);
     drawKochCurve(6,300);
     pencil.turnRight(90);
     drawKochCurve(6,300);
    }   
    
    
}
