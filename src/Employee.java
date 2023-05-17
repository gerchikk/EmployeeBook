public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;

    public Employee (String fullName, int department, int salary, int id) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }



}
