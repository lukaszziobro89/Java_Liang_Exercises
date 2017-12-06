package Chapter_11.Chapter_Classes;
import Chapter_10.Chapter_Classes.MyDate;
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    // constructor which is called from superclass
    public Employee(String name){
        this(name, "no office", 0, new MyDate());
    }

    // args constructor
    private Employee(String name, String office, double salary, MyDate dateHired){
        super(name);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + " - Class: " + this.getClass().getName());
    }

    // getters and setters
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
}
