public class Employee {
    private String fullName;
    private String department;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee (String fullName, String department, int salary, int id) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }
    public int getCounter() {
        return counter;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public String toString () {
        return "ФИО - " + this.fullName + "\n Отдел - " + this.department + "\n Зарплата - " + this.salary + "\n id - " + this.id;
    }







}
