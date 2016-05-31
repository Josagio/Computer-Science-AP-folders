import gpdraw.*;
/**
 * Write a description of class Muller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muller
{    
    private DrawingTool pencil;
    private SketchPad paper;
    /**
     * Constructor for objects of class Muller
     */
    public Muller()
    {
     paper = new SketchPad(500, 500);
     pencil = new DrawingTool (paper);
    }

    public void draw()
    {
      //this is used to draw the muller
      pencil.up();
      pencil.turn(-90);
      pencil.down();
      pencil.forward(45);
      pencil.turnLeft(135);
      pencil.forward(15);
      pencil.up();
      pencil.backward(15);
      pencil.turnRight(269.1);
      pencil.down();
      pencil.forward(16);
      pencil.up();
      pencil.home();
      pencil.down();
      pencil.turn(90);
      //other side of muller
      pencil.forward(45);
      pencil.turnLeft(135);
      pencil.forward(15);
      pencil.up();
      pencil.backward(15);
      pencil.turnRight(269.1);
      pencil.down();
      pencil.forward(16);
      pencil.up();
      //top of muller
      pencil.home();
      pencil.forward(35);
      pencil.turn(-90);
      pencil.down();
      pencil.forward(35);
      pencil.turnLeft(40);
      pencil.forward(15);
      pencil.up();
      pencil.backward(15);
      pencil.turnRight(85);
      pencil.down();
      pencil.forward(16);
      //otherside of top muller
      pencil.up();
      pencil.home();
      pencil.forward(35);
      pencil.down();
      pencil.turn(90);
      pencil.down();
      pencil.forward(35);
      pencil.turnLeft(40);
      pencil.forward(15);
      pencil.up();
      pencil.backward(15);
      pencil.turnRight(85);
      pencil.down();
      pencil.forward(16);
    }   
}
