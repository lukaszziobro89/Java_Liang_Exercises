package Chapter_13.Chapter_Classes;

public class ClonableCourse implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public ClonableCourse(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Exercise 9.9
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            ClonableCourse clonedCourse = (ClonableCourse)super.clone();
            return clonedCourse;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

