package Chapter_11.Chapter_Classes;

public class Staff extends Employee {
    private String title;

    public Staff(String name){
        this(name, "none");
    }

    private Staff(String name, String title){
        super(name);
        this.title = title;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + " - Class: " + this.getClass().getName());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
