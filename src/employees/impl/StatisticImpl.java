package employees.impl;

import employees.Employee;
import employees.EmployeeBook;
import employees.dao.Print;
import employees.dao.Statistic;
import employees.enums.Departments;

public class StatisticImpl implements Statistic {
    private Employee[] employees;
    private EmployeeBook employeeBook;
    private Print print;

    public StatisticImpl(Employee[] employees, EmployeeBook employeeBook) {
        this.employees = employees;
        this.employeeBook = employeeBook;
    }

    @Override
    public double sumSalary () {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    @Override
    public Employee minSalary () {
        double min = employees[0].getSalary();
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return employeeBook.crud().findBySalary(min);
    }

    @Override
    public Employee maxSalary () {
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return employeeBook.crud().findBySalary(max);
    }

    @Override
    public double avgSalary () {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum / employees.length;
    }

    @Override
    public String minSalaryInDepartment (Departments department) {
        double min = Double.MAX_VALUE;
        Employee poorEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment().equals(department) && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                poorEmployee = employees[i];
            }
        }
        String message = "Сотрудник с самой маленькой зарплатой в отделе " + department + " - \n" + poorEmployee.getFullName();
        return message;
    }

    @Override
    public String maxSalaryInDepartment (Departments department) {
        double max = Double.MIN_VALUE;
        Employee richEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment().equals(department) && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                richEmployee = employees[i];
            }
        }
        String message = "Сотрудник с самой большой зарплатой в отделе " + department + " - \n" + richEmployee.getFullName();
        return message;
    }

    @Override
    public double sumSalaryInDepartment (Departments department) {
        System.out.println("Сумма затрат на зарплату в отделе: " + department);
        double sum = 0.0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    @Override
    public double avgSalaryInDepartment (Departments department) {
        System.out.println("Средняя зарплата в отделе: " + department);
        double sum = 0.0;
        int count = 0;
        Employee[] employeesDepartment;
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                sum += e.getSalary();
                count++;
            }
        }
        return sum / count;
    }

    @Override
    public void findEmployeeWithSalaryLessThan (double salary) {
        System.out.println("Сотрудники с зарплатой меньше, чем " + salary + " рублей:");
        boolean foundEmployee = false;
        for (Employee e : employees) {
            if (e != null && e.getSalary() < salary) {
                System.out.println(e.getFullName());
                foundEmployee = true;
            }
        }
        if (!foundEmployee) {
            System.out.println("Сотрудников с зарплатой меньше, чем " + salary + " рублей нет");
        }
    }

    @Override
    public void findEmployeeWithSalaryGreaterThan (double salary) {
        System.out.println("Сотрудники с зарплатой больше, чем " + salary + " рублей:");
        boolean foundEmployee = false;
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= salary) {
                System.out.println(e.getFullName());
                foundEmployee = true;
            }
        }
        if (!foundEmployee) {
            System.out.println("Сотрудников с зарплатой больше, чем " + salary + " рублей нет");
        }
    }
}
