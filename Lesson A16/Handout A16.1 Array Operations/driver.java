
/**
 * Demonstrates passing arrays as parameters
 * 
 * @author Rocky Lombardo
 * @version April 2014
 */
public class driver
{
    
    /**
     * Declares an array named data. The array is initialized
     * with the values 0...5
     */
    public static void main (String[] args)
  {
    final int MAX = 6;

    ArrayOps arrayOps = new ArrayOps();

    int[] data = new int[MAX];

    for (int loop = 0; loop < MAX; loop++)
      data[loop] = loop; // initialize array

    System.out.println("Array initialized: ");

    arrayOps.printList(data); // print array in ascending order
    arrayOps.squareList (data);
    System.out.println("Array after call of squareList: ");
    arrayOps.printList (data);
    arrayOps.rotateList (data);
    System.out.println("Array after call of rotateList: ");
    arrayOps.printList (data); // print list again
  }
}

