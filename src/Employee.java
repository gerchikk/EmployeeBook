public class Employee {
    private String fullName;
    private String department;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee (String fullName, String department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter++;
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
        return "ФИО - " + this.fullName + "\nОтдел - " + this.department + "\nЗарплата - " + this.salary + "\nid - " + this.id;
    }

    public void sumSalary () {
        int sumSalary = 0;
        for (int id : Employee[]) {
            sumSalary += salary;
        return sumSalary();
        }
    }



}








