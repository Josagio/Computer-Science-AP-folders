 import java.util.Scanner;
/**
 *  The Grades class to compute the GPA for a given set
 *  of letter grades. It then used the GPA and a set of rules to
 *  determine eligibility for extracurricular activities
 *
 * @author  
 */
 public class Grades{
  boolean hasF;
  private double myGPA;
  private int myTotal;
  private int myCount;
  private Scanner in;

  /**
   *  Constructor for the Grades object
   */
  public Grades(){
    myTotal = 0;
    myCount = 0;
    hasF = false;
    in = new Scanner(System.in); 
  }
  
  /**
   *  Top level method that calls other private methods to compute the
   *  GPA and determine the elegibility status
   */
  public void start(){
   	getInputs();     //get input values from keyboard
    computeGPA();    //compute the mGPA
    displayOutput(); //display the results
  }

  /**
   *  Computes the Grade Point Average.
   *
   * @return The eligibility value
   */
  private String getEligibility(){
    // Insert code here
    boolean eligibility = true;
    String statement;
    if(myCount >= 4){
      if (myGPA >= 2.0){
          if(hasF == false){
              eligibility = true;
            }
      }
    }else{
        eligibility = false;
    }
    if( eligibility == true){
        statement = "you are eligible to participate in extracurricular activities";
    }else{
        statement = "you cannont participate in extracurricular activities";
    }
    return statement; 
  }

  /**
   *  Repeatedly get grade inputs ('A', 'a' - 'F', 'f') and accumulate
   *  grade points until any other value is entered
   */
  private void getInputs(){

    String grade;
  
    boolean done = false;
    int counter = 1;
    int temp;
    System.out.println();
    System.out.print("Enter the amount of classes you have --> ");
    myCount = in.nextInt();
    // Insert loop here
    while(counter <= myCount){
      System.out.println();
      System.out.print("Enter a grade you have --> ");
      grade = in.next();
       switch(grade){
       case "A": myTotal += 4;
       break;
       case "B": myTotal += 3;
       break;
       case "C": myTotal += 2;
       break;
       case "D": myTotal += 1;
       break;
       case "a": myTotal += 4;
       break;
       case "b": myTotal += 3;
       break;
       case "c": myTotal += 2;
       break;
       case "d": myTotal += 1;
       break;
       default: myTotal += 0;
       hasF = true;
       break;
      }
      counter++;
    }
  }

  /**
   *  Computes the Grade Point Average.
   */
  private void computeGPA(){
    myGPA = (double) myTotal / myCount;
  }

  /**
   *  Display the the GPA and eligibility status.
   */
  private void displayOutput(){
    System.out.println();
    System.out.printf("GPA = %.2f", myGPA);
    System.out.println("  " + getEligibility());
    System.out.println();
  }

}

