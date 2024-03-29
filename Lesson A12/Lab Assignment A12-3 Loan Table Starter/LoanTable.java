import gpdraw.*;
import java.util.Scanner;
/**
 *  A LoanTable class to compute the monthly and total
 *  payments for a given loan amount, annual interest rate, and number
 *  of years. 
 *
 * @author 
 */
public class LoanTable{
  
  private final double INCREMENT = 0.25;
  private final int MONTHS_IN_YEAR = 12;
  private double principal, low, high, years;
  private Scanner in;

  /**
   *  Constructor for the LoanTable object
   */
  public LoanTable(){
    in = new Scanner(System.in);
  }

  /**
   *  Calculates and prints a properly formatted loan table
   */
  public void printAnswer(){
    double k;
    double c;
    double payment;// for doing calculations
    double n = years * 12;
    System.out.println("Mortgage problem");
    System.out.println();
    System.out.printf("Principal = $%9.2f", principal);
    System.out.println();
    System.out.println("Time = " + years + " years");
    System.out.println("Low rate = " + low + "%");
    System.out.println("High rate = " + high + "%");
    System.out.println();
    System.out.print("   Annual Interest Rate");
    System.out.println("   Monthly Payment");
    System.out.println();
    while(low <= high){ 
     System.out.print("        " + low);
     k = low/12.0;
     c = Math.pow(1 + k,n);
     payment = (principal * low * c)/2; 
     System.out.println("               " + payment);
     low += INCREMENT;
   }
    double months = years * MONTHS_IN_YEAR;
   // Insert loop here
    System.out.println();
  }

  /**
   *  Data input for mortgage problem
   */
  public void dataInput(){
    System.out.println("Data input for mortgage problem");
    System.out.println();
    System.out.print("Enter principal --> ");
    principal = in.nextDouble();
    System.out.print("Enter number of years --> ");
    years = in.nextDouble();
    System.out.print("Enter low interest rate (%) --> ");
    low = in.nextDouble();
    System.out.print("Enter high interest rate (%) --> ");
    high = in.nextDouble();
    System.out.println();
    System.out.println();
  }

}

