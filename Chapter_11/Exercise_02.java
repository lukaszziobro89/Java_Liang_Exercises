/*
(The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee.
 - A person has a name, address, phone number, and email address.
 - A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant.
An employee has an office, salary, and date hired. Use the MyDate class defined in Programming Exercise 10.14 to create an
object for date hired.
 - A faculty member has office hours and a rank. A staff member has a title.
Override the toString method in each class to display the class name and the person’s name.
Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
 */
package Chapter_11;
import Chapter_11.Chapter_Classes.*;
public class Exercise_02 {
    public static void main(String[] args) {
        // create instances of object
        Person Luq = new Person("Lukasz");
        Student David = new Student("David");
        Employee Mark = new Employee("Mark");
        Faculty faculty = new Faculty("faculty");
        Staff staff = new Staff("Staff");

        System.out.println(Luq.toString());
        System.out.println(David.toString());
        System.out.println(Mark.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());


    }
}
