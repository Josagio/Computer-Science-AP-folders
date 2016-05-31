/**
 * Lab Assignment A11.1
 *
 * The root of the Person hierarchy.  All persons have
 * a name and an age and a gender
 */

class Person
{
  private String myName ;   // name of the person
  private int myAge;        // person's age
  private String myGender;    // 'M' for male, 'F' for female

  /**
   * Constructor:
   *    Initialize the Person fields to input values (parameters)
   *        Initialize myName to name
   *        Initilaize myAge to age
   *        Initialize myGender to gender
   *  @param  name: A person's name
   *          age:  A person's age
   *          gender: A person's gender
   */
  public Person(String name, int age, String gender)
  {
    myName = name;
    myAge = age;
    myGender = gender;
  }

  /**
   * @return Name for the current person
   */
  public String getName()
  {
    return myName;
  }

  /**
   * @return  Age for the current person
   */
  public int getAge()
  {
    return myAge;
  }

  /**
   * @return  gender for the current person
   */
  public String getGender()
  {
    return myGender;
  }

  /**
   * @param New name for the current person
   */
  public void setName(String name)
  {
    myName = name;
  }

  /**
   * @param New age for the current person
   */
  public void setAge(int age)
  {
    myAge = age;
  }

  /**
   * @param New age for the current person
   */
  public void setGender(String gender)
  {
    myGender = gender;
  }

  /**
   * Display the string representation of a Person object
   */
  public String toString()
  {
    return myName + ", age: " + myAge + ", gender: " + myGender;
  }
}