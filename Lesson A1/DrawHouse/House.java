import gpdraw.*;
/**
 * This will be used to create a house
 * 
 * @author Robert J Leggio lll
 * @V0.0.1
 */
public class House
{
    private DrawingTool marker;
    private SketchPad poster;
    private int printCredits;

    /**
     * this is used to hold
     * the variables
     */
    public House()
    {
     poster = new SketchPad(500,500);
     marker = new DrawingTool(poster);
    }

    /**
     * This method will run all of
     * the commands necessary to draw the square.
     */
    public void draw()
    {
     //this is the outline of the house   
     marker.up();
     marker.move(-150,-50);
     marker.down();
     marker.turn(-18.5);
     marker.forward(-300);
     marker.turnRight(90);
     marker.forward(150);
     marker.turnLeft(90);
     marker.forward(300);
     marker.turnLeft(90);
     marker.forward(150);
     //this is the roof of the house
     marker.up();
     marker.move(-150,100);
     marker.down();
     marker.turnRight(60);
     marker.forward(180);
     marker.turnRight(62);
     marker.forward(170);
     //this is used for the door of the house
     marker.up();
     marker.move(-15,-50);
     marker.down();
     marker.turn(48);
     marker.forward(-65);
     marker.turnLeft(88);
     marker.forward(30);
     marker.turnRight(88);
     marker.forward(65);
     //this is used for the window of the house
     marker.up();
     marker.move(-100,80);
     marker.down();
     marker.turnRight(132);
     marker.forward(34);
     marker.turnRight(90);
     marker.forward(33);
     marker.turnRight(89);
     marker.forward(34);
     marker.turnRight(89);
     marker.forward(33);
     marker.up();
     marker.move(70,80);
     marker.down();
     marker.forward(33);
     marker.turnRight(90);
     marker.forward(33);
     marker.turnRight(90);
     marker.forward(33);
     marker.turnRight(90);
     marker.forward(33);
     //this is an extra part of the house
     marker.up();
     marker.move(40,-100);
     marker.down();
     marker.turn(9.5);
     marker.forward(80);
     marker.turnLeft(90);
     marker.forward(10);
     marker.turnLeft(90);
     marker.forward(79);
     marker.turnRight(90);
     marker.forward(-10);
     marker.up();
     marker.forward(10);
     marker.down();
     marker.forward(100);
     marker.turnRight(90);
     marker.forward(80);
     marker.turnLeft(90);
     marker.forward(10);
     marker.turnLeft(90);
     marker.forward(80);
     marker.turnLeft(90);
     marker.forward(10);
     marker.up();
     marker.move(40,-160);
     marker.down();
     marker.turn(151.5);
     marker.forward(121);
     //this is the sign 
     marker.up();
     marker.move(52,-115);
     marker.down();
     marker.drawString("This is a virtual");
     marker.up();
     marker.move(52,-125);
     marker.down();
     marker.drawString("      House      ");
     marker.up();
     marker.move(52,-135);
     marker.down();
     marker.drawString("Created By:");
     marker.up();
     marker.move(52,-145);
     marker.down();
     marker.drawString("Robert Leggio");
     //this is the chimney
     marker.up();
     marker.move(65,154);
     marker.down();
     marker.turn(2);
     marker.forward(45);
     marker.turnLeft(91);
     marker.forward(10);
     marker.turnRight(89);
     marker.forward(15);
     marker.turnRight(92);
     marker.forward(35);
     marker.turnRight(89);
     marker.forward(15);
     marker.turnRight(90);
     marker.forward(10);
     marker.turnLeft(89);
     marker.forward(55);
     //this is the third window
     marker.up();
     
     
    }    
        
    /**
     * this is the credits
     * for the programer who made this possible
     */
    public void printCredits()
    {
       int printCredits;
       {
        System.out.println("________________________");
        System.out.println("This was all created by:");
        System.out.println("Robert J. Leggio lll");
        System.out.println("------------------------");
       }   
    }
     
     
        
        
}
