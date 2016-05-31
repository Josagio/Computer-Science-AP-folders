
/**
 * Write a description of class Teacher here.
 * 
 * @author Robert J. Leggio III 
 * @version 0.0.1a
 */
class Teacher extends Person
{
  private String mySubject;
  private double mySalary;

  /**
  * This will call the super class and create a new subclass called teacher
  * it will find aditionall information like the subject they teach
  * and their salary.
  */
  public Teacher(String name, int age, String gender, String subject, double salary )
  {
   // use the super class' constructor   
   super(name, age, gender);
   //initalizes what is new to teacher
   mySubject = subject;
   mySalary = salary;
  }

  /**
   * @return return a teachers subject
   */
  public String getSubject()
  {
    return mySubject;
  }

  /**
   * @return return a teachers salaries
   */
  public double getSalary()
  {
    return mySalary;
  }

  /**
   *will set up the teachers new subject
   */
  public void setSubject(String subject)
  {
    mySubject = subject;
  }

  /**
   * will set up the new salary for the teacher
   */
  public void setSalary(double salary)
  {
    mySalary = salary;
  }

  /**
   * Display the teacher object attributes as a
   * string value
   * 
   * Calls the superclass toString() method
   */
  public String toString()
  {
    return super.toString() +
           ", Subject: " + mySubject + ", salary: " + mySalary;
  }
}
