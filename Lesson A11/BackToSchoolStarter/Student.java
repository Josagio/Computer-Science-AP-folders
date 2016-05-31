/**
 * Lab Assignment A11.1
 *
 * A student, is a Person with an id number and
 * a grade point average
 */

class Student extends Person
{
  private String myIdNum;    // Student Id Number
  private double myGPA;      // grade point average

  /**
   * Constructor
   *    Call the superclass (parent class) to initialize:
   *        name: The student's name
   *        age: The student's age
   *        gender: The student's gender
   *    Initialize the student fields:
   *        idNum: The student's ID number
   *        gpa: The student's grade-point-average
   */
  public Student(String name, int age, String gender,
                 String idNum, double gpa)
  {
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Student
    myIdNum = idNum;
    myGPA = gpa;
  }

  /**
   * @return return a Student ID number
   */
  public String getIdNum()
  {
    return myIdNum;
  }

  /**
   * @return return a student grade-point-average
   */
  public double getGPA()
  {
    return myGPA;
  }

  /**
   * @param idNum: A student's new ID number
   * 
   * The instance variable myIdNum has been reset to a new value
   * for the current student
   */
  public void setIdNum(String idNum)
  {
    myIdNum = idNum;
  }

  /**
   * @param  gpa:  A student's grade-point-average
   * Reset the current student's field myGPA to gpa value
   */
  public void setGPA(double gpa)
  {
    myGPA = gpa;
  }

  /**
   * Display the student object attributes as a
   * string value
   * 
   * Calls the superclass toString() method
   */
  public String toString()
  {
    return super.toString() +
           ", student id: " + myIdNum + ", gpa: " + myGPA;
  }
}
