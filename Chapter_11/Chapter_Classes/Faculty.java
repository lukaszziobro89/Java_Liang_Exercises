package Chapter_11.Chapter_Classes;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name){
        this(name, "9-17", "Employee");
    }

    private Faculty(String name, String officeHours, String rank){
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
