public class Employee {

    private String fullName;
    private String department;
    private double salary;
    private int id;
    private static int counter = 1;

    public Employee (String fullName, String department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    private Employee[] employees;

    private int maxEmployees;

    public void EmployeeList (int maxEmployees) {
        employees = new Employee[maxEmployees];
        this.maxEmployees = maxEmployees;
    }




    public String getFullName() {
        return this.fullName;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
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

    public void setSalary (double salary) {
        this.salary = salary;
    }

    // Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public String toString () {
            return "ФИО - " + this.fullName + "\nОтдел - " + this.department + "\nЗарплата - " + this.salary + "\nid - " + this.id;
    }

    // Посчитать сумму затрат на зарплаты в месяц.

    public void sumSalary () {
        double sumSalary = 0.0;
        for (Employee e : employees) {
            if (e != null) sumSalary += e.getSalary();
        }

    }

    // Найти сотрудника с минимальной зарплатой.


    // Найти сотрудника с максимальной зарплатой.


    // Подсчитать среднее значение зарплат.


    //Получить Ф. И. О. всех сотрудников (вывести в консоль).



}








