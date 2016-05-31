/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("bKnight.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
 
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("bKnight.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  /** this is the method to keep only blue */
  public static void testKeepOnlyBlue()
  {
    Picture bKnight = new Picture("bKnight.jpg"); 
    bKnight.keepOnlyBlue();
    bKnight.explore();
  }
  
  public static void testGrayscale()
  {
   Picture bKnight = new Picture("bKnight.jpg");
   bKnight.grayScale(1);
   bKnight.explore();
  }
  
  public static void testNegate(){
   Picture bKnight = new Picture("bKnight.jpg");
   bKnight.negate();
   bKnight.explore();
    }
    
  public static void testFixUnderwater(){
   Picture water = new Picture("water.jpg");
   water.fixUnderwater(2);
   water.explore();
    }
   
  public static void testMirrorVerticalRighttoLeft(){
    Picture swan = new Picture("swan.jpg");
    swan.mirrorVerticalRighttoLeft();
    swan.explore();    
  }
  
  public static void testMirrorHorizontal(){
       Picture moto = new Picture("redMotorcycle.jpg");
       moto.MirrorHorizontal();
       moto.explore();
    }
    
  public static void testMirrorHorizontalBotToTop(){
   Picture moto = new Picture("redMotorcycle.jpg");
   moto.MirrorHorizontalBotToTop();
   moto.explore();
    }
    
  public static void testMirrorDiagonal(){
   Picture moto = new Picture("beach.jpg");
   moto.MirrorDiagonal();
   moto.explore();
  }
  
  public static void testMirrorArms(){
   Picture snow = new Picture("snowman.jpg");
   snow.mirrorArms();
   snow.explore();
    }
    
  public static void testMirrorGull(){
   Picture gull = new Picture("seagull.jpg");
   gull.mirrorGull();
   gull.explore();
    }
    
  public static void testCopy(){
   Picture bKnight = new Picture("bKnight.jpg");
   bKnight.duplicate(bKnight,220,35);
   bKnight.explore();
   }
   
    public static void myCollage(){
    Picture bKnight = new Picture("bKnight.jpg");
    bKnight.duplicate(bKnight,220,35);
    bKnight.createCollage();
    bKnight.explore();
   }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    myCollage();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorTemple();
    testMirrorVerticalRighttoLeft();
    testMirrorHorizontal();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
    testCollage();
    testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}