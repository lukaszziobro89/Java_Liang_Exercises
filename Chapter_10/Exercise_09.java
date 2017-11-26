package Chapter_10;
import Chapter_10.Chapter_Classes.Course;
/*
(The Course class) Revise the Course class as follows:
    ■ The array size is fixed in Listing 10.6. Improve it to automatically increase the array size by creating a new larger
    array and copying the contents of the current array to it.
    ■ Implement the dropStudent method.
    ■ Add a new method named clear() that removes all students from the course.
Write a test program that creates a course, adds three students, removes one, and displays the students in the course.
 */
public class Exercise_09 {
    public static void main(String[] args) {

        // create a course
        Course mathCourse = new Course("Math");
        // add students
        mathCourse.addStudent("John");
        mathCourse.addStudent("Paul");
        mathCourse.addStudent("David");
        // get number of students
        System.out.println(mathCourse.getNumberOfStudents());
        // drop students
        mathCourse.dropStudent("Paul");
        System.out.println(mathCourse.getNumberOfStudents());
        // display students
        String[] listOfStudents = mathCourse.getStudents();
        for (int i = 0; i < listOfStudents.length && listOfStudents[i] != null; i++) {
            System.out.println(listOfStudents[i]);
        }
        // clear course
        mathCourse.clear();
        System.out.println(mathCourse.getNumberOfStudents());


    }
}
