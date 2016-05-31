import gpdraw.*;
/**
 * This class is used to make an organic compound called Benzene
 * Its made up of a hexagon and a circle
 * 
 * @author: Robert J. Leggio lll 
 * @V0.0.1(lesson a2.1)
 */
public class LessonA2
{
    private DrawingTool marker;
    private SketchPad poster;
    private int printUseOfDrawCircles;
    /**
     * Constructor for objects of class Benzene
     */
    public LessonA2()
    {
      poster = new SketchPad(400,400);
      marker = new DrawingTool(poster);
    }

    /**
     * This method will run all the commands
     * necessary to draw the Benzene
     */
    public void draw()
    {
     //this is used for the outside of the benzene
     marker.up();
     marker.move(0,-100);
     marker.down();
     marker.turn(125);
     marker.forward(125);
     marker.turnLeft(55);
     marker.forward(100);
     marker.turnLeft(55);
     marker.forward(125);
     marker.turnLeft(62);
     marker.forward(125);
     marker.turnLeft(63);
     marker.forward(110);
     marker.turnLeft(55);
     marker.forward(135);
     //this is used to draw the circle in the center
     marker.up();
     marker.move(-5,25);
     marker.down();
     marker.drawCircle(80);
    }    
    
    /**
     * this is used to determine
     * the shape of the circle
     */
    public void drawCircle()
    
    {
     marker.drawCircle(50);
     marker.drawString("small");
     marker.up();
     marker.move(0,120);
     marker.down();
     marker.drawCircle(70);
     marker.drawString("Big");
     marker.up();
     marker.move(0,55);
     marker.down();
     marker.drawString("middle");
     marker.drawCircle(30);
     marker.up();
     marker.move(-70,120);
     marker.down();
     marker.drawString("Left");
     marker.drawCircle(30);
     marker.up();
     marker.move(0,190);
     marker.down();
     marker.drawString("above");
     marker.drawCircle(40);
     marker.up();
     marker.move(70,120);
     marker.down();
     marker.drawString("Right");
     marker.drawCircle(50);
    }    

    /**
     * this is used to determine
     * the shape of the circle
     */
    public void printUseOfDrawCircles()
    
    {
     int printUseOfDrawCircles;
     {
      System.out.println("_____________________________________");   
      System.out.println("this is only used for the author to");
      System.out.println("determine the right size of the cirle");
      System.out.println("-------------------------------------");
     }
 
    }    
        
        

}
