package Chapter_13;

import Chapter_10.Chapter_Classes.Course;
import Chapter_13.Chapter_Classes.ClonableCourse;

/*
(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6 to add a clone method to perform a
deep copy on the students field.
 */
public class Exercise_13 {
    public static void main(String[] args) {
        ClonableCourse course = new ClonableCourse("Basic course");
        try {
            ClonableCourse clonedCourse = (ClonableCourse)course.clone();
            System.out.println(clonedCourse.getCourseName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
