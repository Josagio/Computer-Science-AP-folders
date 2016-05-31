import gpdraw.*;
/**
 * Write a description of class LessonA22 here.
 * 
 * @author: Robert Leggio lll
 * @V0.0.5
 */
public class LessonA22
{
    private DrawingTool marker;
    private SketchPad poster;
    private int printASCII;
    /**
     * Constructor for objects of class LessonA22
     */
    public LessonA22()
    {
      poster = new SketchPad(600,600);
      marker = new DrawingTool(poster);
    }
    
    /**
     * this is used to
     * create the code used in
     * worksheet 2.2
     */
    public void draw()
    {
      marker.drawCircle(80);
      marker.up();
      marker.home();
      marker.forward(80);
      marker.down();
      marker.setDirection(0);
      marker.forward(80);
      marker.turnRight(90);
      marker.forward(160);
      marker.turnRight(90);
      marker.forward(160);
      marker.turnRight(90);
      marker.forward(160);
      marker.turnRight(90);
      marker.forward(80);
      marker.up();
      marker.home();
      marker.down();
      marker.drawCircle(113);
      marker.up();
      marker.home();
      marker.move(-25,0);
      marker.down();
      marker.drawString("Created By:");
      marker.up();
      marker.move(-25,-25);
      marker.down();
      marker.drawString("Robert Leggio");
      marker.up();
      marker.home();
      marker.forward(15);
      marker.down();
         
    }    
    
 
    
    
    
    
    
    
    
}
