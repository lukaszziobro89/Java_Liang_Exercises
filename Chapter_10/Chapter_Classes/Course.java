package Chapter_10.Chapter_Classes;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0,temp,0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
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

    public String dropStudent(String student) {
        return students[--numberOfStudents];
    }

    public void clear(){
        students = new String[10];
        numberOfStudents = 0;
    }
}
