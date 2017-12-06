package Chapter_11.Chapter_Classes;

public class Student extends Person{
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    // constructor which is called from superclass
    public Student(String name){
        super(name);
    }

    // args constructor
    public Student(String name, String status){
        super(name);
        this.status = status;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + " - Class: " + this.getClass().getName());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
