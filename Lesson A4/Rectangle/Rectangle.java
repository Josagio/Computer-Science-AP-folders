import gpdraw.*;
/**
 * Write a description of class Rectangle here.
 * 
 * @author; Robert J. Leggio III 
 * @version: 0.0.1
 */
public class Rectangle
{
    private DrawingTool pencil;
    private SketchPad paper;
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private double myLength;
    private RectangleDriver quadrilateral;
    private double edgeSide;
    private double edgeTop;
    private double perimeter;
    private double area;
     /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        paper = new SketchPad(500, 500);
        pencil = new DrawingTool (paper);
    }   
     /**
     * Constructor for objects of class Rectangle
     */
    public void draw(double myX, double myY, double height, double width)
    {
        double edgeSide = myY + height;
        double edgeTop = myX + width;
        paper = new SketchPad(500, 500);
        pencil = new DrawingTool (paper);
        pencil.up();
        pencil.move(myX,myY);
        pencil.down();
        pencil.turnRight(180);
        pencil.forward(edgeTop);
        pencil.turnLeft(90);
        pencil.forward(edgeSide);
        pencil.turnLeft(90);
        pencil.forward(edgeTop);
        pencil.turnLeft(90);
        pencil.forward(edgeSide);
    }
    // this is used to get the right numbers when getting perimeter and area
    public double calcEdgeSide(double myY, double height)
    {
        double edgeSide = myY + height;
        return edgeSide;
    }    
    public double calcEdgeTop(double myX,double width)
    {
        double edgeTop = myX + width;
        return edgeTop;
    }    
    public double getPerimeter()
    {
        perimeter = (edgeSide * 2) + (edgeTop * 2);
        return perimeter;
    }
    public double getArea()
    {
        area = edgeSide * edgeTop;
        return area;
    }

}
