
/**
 * Demonstrates examples of passing arrays as parameters
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayOps
{
 
    
  /**
   * constructor
   */
  public ArrayOps() { }

  /**
   * Copy source to target
   */
  public void copy (int[] source, int[] target)
  {
    for (int count=0; count < source.length; count++)
      target[ count ] = source[ count ];
  }

  /**
   * list is a reference parameter. list is the 
   * same array as the array named data in the
   * driver class
   */
  public void printList (int[] list)
  {
    for (int index = 0; index < list.length; index++)
      System.out.print( list[index] + " ");

    System.out.println();
    System.out.println();
  }

  /**
   * Array list is a local alias for the array data in the driver class.
   * Any reference to a local list is a reference to array data in the
   * driver class.
   */
  public void squareList (int[] list)
  {
    for (int index = 0; index < list.length; index++)
      list[index] = list[index] * list[index];
  }

  /**
   * This function is working with a local copy of the array passed
   * as an argument. Changes to local array list will have no effect
   * on the array data in the calling method. 
   * 
   * This function will shift each value one cell to the right. The value 
   * in list[list.length-1] will be moved to list[0]. Before the function 
   * is completed, printList will be called. The point of this function is 
   * to illustrate an array as a value parameter.
   */
  public void rotateList (int[] list)
  {
    int temp = list[list.length-1];

    int[] listCopy = new int[ list.length ];

    copy(list, listCopy);

    for (int loop = listCopy.length-1; loop > 0; loop--)
      listCopy[loop] = listCopy[loop-1];
    listCopy[0] = temp;

    System.out.println("Inside of rotateList: ");
    printList (listCopy);
  }
}
