/**
 * The following represents the student class and its attributes
 * @authr : Percy , Sandile And Junior
 * Version 1.8
 */

package ca.bcit.lab09;
public class Student
{
    private final String firstName;
    private final String lastName;
    private final int studentNumber;

    /**
     * Constructor
     * @param firstName     : The first name of the student.
     * @param lastName      : The last name of the student.
     * @param studentNumber : the student's student number.
     */
    public Student(final String firstName,final String lastName,final int studentNumber)
    {

        validateFullname(firstName,lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    // Returns the first name.
    public String getFirstName() {
        return firstName;
    }

    // Returns the last name.
    public String getLastName() {
        return lastName;
    }

    // Returns the student number.
    public int getStudentNumber() {
        return studentNumber;
    }


    /**
     * it validates the first and last name before setting it.
     * @param firstName : the first name of the student.
     * @param lastName  : the last name of student.
     */
    private static void validateFullname(final String firstName, final String lastName)
    {
        if(firstName.isBlank() || lastName.isBlank() )
        {
            throw new IllegalArgumentException("invalid student" + firstName + ":" + lastName );
        }

    }

}
