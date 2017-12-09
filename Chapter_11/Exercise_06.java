package Chapter_11;
import Chapter_11.Chapter_Classes.Employee;
import java.util.ArrayList;
import java.util.Date;
/*
(Use ArrayList) Write a program that creates an ArrayList and adds a Loan object, a Date object, a string,
and a Circle object to the list, and use a loop to display all the elements in the list by invoking the object’s toString()
method.
 */
public class Exercise_06 {
    public static void main(String[] args) {
        // create array list of objects
        ArrayList<Object> objects = new ArrayList<>();
        Date sampleDate = new Date();
        Employee employee = new Employee("John");
        // add objects to array
        objects.add(sampleDate);
        objects.add(employee);
        // invoke toString methods
        for (Object object : objects) {
            System.out.println(object.toString());
        }
    }
}
