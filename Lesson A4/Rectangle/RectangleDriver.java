
/**
 * Write a description of class RectangleDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleDriver
{
    private Rectangle quadrilateral;
    private double xValue;
    private double yValue;
    private double Height;
    private double Width;
    
    /**
     * Constructor for objects of class RectangleDriver
     */
    public RectangleDriver()
    {
       quadrilateral = new Rectangle(); 
    }
    public void rectA()
    {
       quadrilateral.draw(0,0,0,0);
    }   
    public void rectB()
    {
       quadrilateral.draw(0, -80, 400, 160);
       quadrilateral.calcEdgeSide(-80,400);
       quadrilateral.calcEdgeTop(0,160);  
    }    
    public void rectC()
    {
       quadrilateral.draw(100, -100, 20, 300);
       quadrilateral.calcEdgeSide(-100,20);
       quadrilateral.calcEdgeTop(100,300);    
    }   
    public void rectangle(double myX, double myY, double height, double width)
    {
       xValue = myX; 
       yValue = myY;
       Height = height; 
       Width = width; 
       quadrilateral.draw(xValue,yValue,Height,Width);
       quadrilateral.calcEdgeSide(yValue,Height);
       quadrilateral.calcEdgeTop(xValue,Width);    
    }   
}
