import java.util.Scanner;
import java.io.*;
/**
 *  A  class for calculating Statistics on a set of numbers. 
 *  
 *  Output: NaN: this meand that the output is not a number
 *      Use the length constant to control your loops
 *      not MyHowMany
 *      
 *      Fix this
 *
 *  @author <Robert Leggio>
 *  @created April 2014
 */
 
public class Statistics{
  private int[] myData = new int[1000];
  private int myHowMany;
  private Scanner in;
  /**
   * constructor
   *    Initialize myHowMany and load data file
   */
  public Statistics(String fileName){
    in = new Scanner(System.in);
  }

   /**
    * Loads text file numbers.txt into myList. Values are stored from
    * positions 0..myHowMany-1. Returns the number of data values as howMany
    */
   public void readFile(String fileName){
   int index=0;
   Scanner inFile;
   try{
    inFile = new Scanner(new File(fileName));
    while (inFile.hasNext()){
      myData[index] = inFile.nextInt();
      index++;
    }
   }catch(IOException i){
     System.out.println("Error: " + i.getMessage());
   }
   myHowMany = index;
  }

  /**
   * returns square for n
   */
  private double square (double n){
    return n*n; 
  }
  
  /**
   * returns average of values in vector data
   */
  public double average (){
    int index = 0;
    long total = 0;
    while(index < myData.length){
      total += myData[index];
      index++;
    }
    return ( (double) total / myHowMany);
  }

  /**
   * finds standard deviation of values in vector data
   */
  public double stdDev (){
  
    double avg, sum=0, temp;
    int index;
    
    avg = average();
    for(index = 0 ;index < myData.length; index++){
      sum += square(myData[index] - avg);
    }
    temp = ((double) sum /(myHowMany - 1));
    return (Math.sqrt(temp));
  }

  /**
   * finds the largest integer in vector scores.  This vector is sized from
   * 0..100, with each element storing the quantity of each number from
   * 0..100.
   */
  private int findLargest (int[] scores){
  
    int tempBig=scores[0], index;
    for(index = 0; index < scores.length; index++){
        if(scores[index] < tempBig){
          tempBig = scores[index];   
        }

  }
  return tempBig;
 }
  /**
   * The vector data is analyzed and transferred into a smaller vector
   * smallList (0..100).  For each occurrence of n in vector data,
   * smallList[n] is incremented +1.  function Largest is then called
   * to find the largest quantity in vector smallList.  The mode(s)
   * is/are printed out.
   */
  public void findMode (){
  
    int loop, largest;
    int[] smallList = new int[101];
    for(loop = 0;loop < smallList.length; loop++){
        smallList[myData[loop]]++;
    }
    largest = findLargest(smallList);
    for(loop = 0; loop < smallList.length; loop++){
        if(smallList[loop] == largest){
            System.out.print(loop + " ");
        }
        
    }
  }
}
