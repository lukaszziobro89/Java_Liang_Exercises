package Chapter_11;
import java.util.ArrayList;
/*
(The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList to replace an array to store students.
You should not change the original contract of the Course class (i.e., the definition
of the constructors and methods should not be changed, but the private members may be changed.)
 */
public class Exercise_05 {
    public static void main(String[] args) {

    }

    class Course{
        private String courseName;
        private ArrayList<String> students = new ArrayList<>();
        private int numberOfStudents;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void addStudent(String student){
            students.add(student);
        }

        public String[] getStudents() {
            return students.toArray(new String[students.size()]);
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public String getCourseName() {
            return courseName;
        }

        public void dropStudent(String student) {
            students.remove(student);
        }

        public void clear(){
            students.clear();
        }

    }
}


