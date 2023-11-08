public class Student {
  public String firstName;
  public String lastName;
  public int grade;
  public double GPA;

  public Student(String theFirstName, String theLastName, int theGrade, double theGPA) {
    firstName = theFirstName;
    lastName = theLastName;
    grade = theGrade;
    GPA = theGPA;
  }
    
  public String toString() {
    return "First Name: " + firstName + ", Last Name: " + lastName + ", in grade: " + grade + ", with a GPA of: " + GPA;
  }
}
