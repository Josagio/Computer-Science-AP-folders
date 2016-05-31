import gpdraw.*;
/**
 * This is to draw a face
 * 
 * @author Robert J. Leggio lll 
 * @V0.0.6(lesson A1)
 */
public class Face
{
    

   private DrawingTool marker;
   private SketchPad poster;
    
    
    /**
     * this is going to be used 
     * to create a face
     */
    public Face()
    {
      poster = new SketchPad(600,600);
      marker = new DrawingTool(poster);
    }

     /**
      * This method will run all of the 
      * commands necessary to draw the square.
      */
    public void draw()
    {
      marker.forward(120);
      marker.turnRight(45);
      marker.forward(80);
      marker.turnLeft(90);
      marker.forward(80);
      marker.turnLeft(90);
      marker.forward(80);
      marker.turnLeft(90);
      marker.forward(80);
      marker.up();
      marker.turnRight(90);
      marker.forward(100);
      marker.down();
      marker.drawString("  A");
      marker.move(-100,0);
      marker.up();
      marker.move(-175,100);
      marker.down();
      marker.move(175,100);
      marker.drawString("  B");
    
    }
    
     /**
      * This method
      * will draw the outside of the face
      */
     public void drawHead()
     {
      //this is the outline of the head   
      marker.move(0,0);
      marker.forward(200);
      marker.turnLeft(90);
      marker.forward(200);
      marker.turnLeft(90);
      marker.forward(200);
      marker.turnLeft(90);
      marker.forward(200);
      //this is the smile of the face
      marker.up();
      marker.turnLeft(90);
      marker.forward(50);
      marker.turnLeft(90);
      marker.forward(50);
      marker.turnLeft(90);
      marker.down();
      marker.forward(20);
      marker.turnRight(90);
      marker.forward(99);
      marker.turnRight(90);
      marker.forward(20);
      //this is the nose of the face
      marker.up();
      marker.move(-100,100);
      marker.down();
      marker.forward(25);
      marker.move(-100,100);
      marker.turnLeft(130);
      marker.forward(25);
      // this is the left eye
      marker.up();
      marker.move(-60,150);
      marker.down();
      marker.turnRight(10);
      marker.forward(10);
      marker.turnRight(20);
      marker.forward(10);
      marker.turnRight(30);
      marker.forward(10);
      marker.turnRight(40);
      marker.turnRight(10);
      marker.forward(10);
      marker.turnRight(20);
      marker.forward(10);
      marker.turnRight(30);
      marker.forward(10);
      marker.turnRight(40); 
      marker.turnRight(10);
      marker.forward(10);
      marker.turnRight(20);
      marker.forward(10);
      marker.turnRight(30);
      marker.forward(10);
      marker.turnRight(40);
      marker.turnRight(10);
      marker.forward(10);
      marker.turnRight(20);
      marker.forward(10);
      marker.turnRight(30);
      //this is the right eye
      marker.up();
      marker.move(-130,170);
      marker.down();
      marker.turnLeft(10);
      marker.forward(10);
      marker.turnLeft(20);
      marker.forward(10);
      marker.turnLeft(30);
      marker.forward(10);
      marker.turnLeft(40);
      marker.turnLeft(10);
      marker.forward(10);
      marker.turnLeft(20);
      marker.forward(10);
      marker.turnLeft(30);
      marker.forward(10);
      marker.turnLeft(40); 
      marker.turnLeft(10);
      marker.forward(10);
      marker.turnLeft(20);
      marker.forward(10);
      marker.turnLeft(30);
      marker.forward(10);
      marker.turnLeft(40);
      marker.turnLeft(10);
      marker.forward(10);
      marker.turnLeft(20);
      marker.forward(10);
      marker.turnLeft(30);
     }   
     
      
         
         
         
    
    
    
    
    
}
