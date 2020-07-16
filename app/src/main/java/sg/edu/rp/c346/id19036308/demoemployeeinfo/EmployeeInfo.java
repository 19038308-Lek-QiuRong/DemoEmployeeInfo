package sg.edu.rp.c346.id19036308.demoemployeeinfo;

public class EmployeeInfo {

    private String name;
    private String title;
    private double salary;

    public EmployeeInfo(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
