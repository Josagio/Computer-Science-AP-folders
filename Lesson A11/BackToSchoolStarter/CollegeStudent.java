
/**
 * Write a description of class CollegeStudent here.
 * 
 * @author Robert J. Leggio III
 * @version 0.0.1b
 */
 class CollegeStudent extends Student
{
  private int myYear;
  private String myMajor;

  /**
   * College student is a constructor subclass to student and will add 
   * aditional information like the year of graduation and their major in college
   */
    public CollegeStudent(String name, int age, String gender,
                         String idNum, double gpa, String major, int year)
    {
      // use the super class' constructor
      super(name, age, gender, idNum, gpa);
      //initalizes what is new to collegeStudent
      myYear = year;
      myMajor = major;
    }

   /**
   * this will get the college students major
   */
  public String getMajor()
  {
    return myMajor;
  }

  /**
   * this will return the graduation year for the student
   */
  public int getYear()
  {
    return myYear;
  }

  /**
   * this will set up the major for the student
   */
  public void setMajor(String major)
  {
    myMajor = major;
  }

  /**
   * This will set up the year of graduation
   */
  public void setYear(int year)
  {
    myYear = year;
  }

  /**
   * Displays the college student obj attributes as a
   * string value
   * 
   * Calls the superclass toString() method
   */
  public String toString()
  {
    return super.toString() +
           ", Major: " + myMajor + ", Class Year: " + myYear;
  }
   
}
