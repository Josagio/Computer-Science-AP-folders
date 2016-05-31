import java.util.Scanner;
/**
 * Write a description of class IRS here.
 * 
 * @author Robert J. Leggio III
 * @version: 0.1.1
 */
public class IRS
{
    private int myIncome;
    private int relationship;
    private String name;
    private int setting;
    /**
     * Constructor class for IRS to get
     * the information on the user
     * will also calculate tax
     */
    public IRS()
    {
      System.out.println("_________________________________________________");
      System.out.println("hello this is an IRS calculator");
      System.out.println("This will be used to calculate your Tax");
      System.out.println("please enter the following for the calculations");
      Scanner keyboard = new Scanner(System.in);
      System.out.print("What is your name -->");
      name = keyboard.next();
      System.out.println();
      System.out.print("Average income for household --->");
      //typing in the income code
      myIncome = keyboard.nextInt();
      System.out.println();
      System.out.println("For the following please enter the given values");
      System.out.println("Married = 2");
      System.out.println("Single = 1");
      System.out.print("Are you married or single?  -->");
      //typing in the relationship Status
      relationship = keyboard.nextInt();
      System.out.println();
      System.out.println("----------------------------------------------------");
      double temp; 
      int setting;
      setting = 0;
      //used during determination of relationship
      if(relationship == 1 || relationship == 2)
        if(relationship == 1)
          System.out.println(name + " is single"); 
         else
          System.out.println(name + " is married");

      //setting up the case value for the switch  
      if(myIncome >= 0 && relationship == 1){
        if(myIncome >= 0 && myIncome <= 27050){
          setting = 1;
        }else if(myIncome > 27050 && myIncome <= 65550){
           setting = 2; 
        }else if(myIncome > 65550 && myIncome <= 136750){
            setting = 3;
        }else if(myIncome > 136750 && myIncome <= 297350){
            setting = 4; 
        }else if(myIncome > 297350)
            setting = 5; 
        }else if(myIncome >= 0 && relationship == 2)
           if(myIncome >= 0 && myIncome <= 45200){
             setting = 6;
            }else if(myIncome > 45200 && myIncome <= 109250){
             setting = 7;
            }else if(myIncome > 109250 && myIncome <= 166500){
             setting = 8;
            }else if(myIncome > 166500 && myIncome <= 297350){
             setting = 9;
            }else if(myIncome > 297350)
             setting = 10;

       //actual income calculations 
      switch(setting){
        case 1:temp = .15* myIncome;
        System.out.println(name + " is single and has a tax of -->" + temp);
        break;
        case 2:temp = 4057.50+.275*(myIncome - 27050);
        System.out.println(name + " is single and has a tax of -->" + temp);
        break;
        case 3:temp = 14645+.305*(myIncome - 65550);
        System.out.println(name + " is single and has a tax of -->" + temp);
        break;
        case 4:temp = 36361+.355*(myIncome - 136750);
        System.out.println(name + " is single and has a tax of -->" + temp);
        break;
        case 5:temp = 93374+.391*(myIncome - 297350);
        System.out.println(name + " is single and has a tax of -->" + temp);
        break;
        case 6:temp = .15* myIncome;
        System.out.println(name + " is married and has a tax of -->" + temp);
        break;
        case 7:temp = 6780+.275*(myIncome - 45200);
        System.out.println(name + " is married and has a tax of -->" + temp);
        break;
        case 8:temp = 24393.75+.305*(myIncome - 109250);
        System.out.println(name + " is married and has a tax of -->" + temp);
        break;
        case 9:temp = 41855+.355*(myIncome - 166500);
        System.out.println(name + " is married and has a tax of -->" + temp);
        break;
        case 10:temp = 88306+.391*(myIncome - 297350);
        System.out.println(name + " is married and has a tax of -->" + temp);
        break;
        default: System.out.println("invalid income please start program over");
        break;
         }
      System.out.println("------------------------------------------------------");   
      System.out.println("Thank you for using the IRS calculator");
      System.out.println("Created by: Robert J. Leggio III");
      System.out.println("Version no.:0.1.1");
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
         
    }
    
   
    }
