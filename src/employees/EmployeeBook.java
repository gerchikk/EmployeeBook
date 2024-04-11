package employees;

public class EmployeeBook {
    private final Employee[] employees;
    private final int capacity;
    private int count = 0;

    public EmployeeBook(int capacity) {
        employees = new Employee[capacity];
        this.capacity = capacity;
    }

    public void separation () {
        System.out.println("________________________________");
    }

    //Добавить сотрудника
    public void addEmployee(String fullName, String department, double salary) {
        if (count < capacity) {
            for (int i = 0; i < capacity; i++) {
                if (employees[i] == null) {
                    employees[i] = new Employee(fullName, department, salary);
                    count++;
                    break;
                }
            }
        } else {
            System.out.println("Книга сотрудников переполнена");
        }
    }

    //Удалить сотрудника по ФИО
    public void deleteEmployee(String fullName) {
        for (int i = 0; i < capacity; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                count--;
            }
        }
    }

    //Удалить сотрудника по ФИО и id
    public void deleteEmployee(String fullName, int id) {
        for (int i = 0; i < capacity; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName) && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    //Изменить запрлату сотрудника
    public void changeSalary(String fullName, double salary) {
        for (int i = 0; i < capacity; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i].setSalary(salary);
            }
        }
    }

    //Изменить отдел сотрудника по ФИО
    public void changeDepartment(String fullName, String newDepartment) {
        for (int i = 0; i < capacity; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i].setDepartment(newDepartment);
            }
        }
    }

    //Изменить отдел сотрудника по id
    public void changeDepartment(int id, String newDepartment) {
        for (int i = 0; i < capacity; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i].setDepartment(newDepartment);
            }
        }
    }

    public void changeDepartment(String fullName, int id, String newDepartment) {
        for (int i = 0; i < capacity; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName) && employees[i].getId() == id) {
                employees[i].setDepartment(newDepartment);
            }
        }
    }

    public double sumSalary () {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public double minSalary () {
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public double maxSalary () {
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public double middleSalary () {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        double middleSalary = sum/employees.length;
        return sum;
    }

    public void devireFullName () {
        int i = 0;
        while (i < employees.length) {
            System.out.println("ФИО сотрудника - " + employees[i].getFullName());
            i++;
        }
    }

    public void indexSalary (double indexationCoefficient) {
        for (Employee e: employees) {
            if (e != null) {
                double newSalary = e.getSalary() * (1 + indexationCoefficient / 100);
                e.setSalary(newSalary);
            }
        }
    }

    public double minSalaryInDepartment (String department) {
        double min = Double.MAX_VALUE;
        Employee poorEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment().equals(department) && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                poorEmployee = employees[i];
            }
        }
        String message = "Сотрудник с самой маленькой зарплатой в отделе " + department + " - \n" + poorEmployee;
        return min;
    }

    public String maxSalaryInDepartment (String department) {
        double max = Double.MIN_VALUE;
        Employee richEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment().equals(department) && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                richEmployee = employees[i];
            }
        }
        String message = "Сотрудник с самой большой зарплатой в отделе " + department + " - \n" + richEmployee;
        return message;
    }

    public String sumSalaryInDepartment (String department) {
        double sum = 0.0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                sum += e.getSalary();
            }
        }
        String message = "Сумма затрат на зарплату по отделу " + department + " составляет - " + sum + " рублей";
        return message;
    }

    public String middleSalaryInDepartment (String department) {
        double sum = 0.0;
        int count = 0;
        Employee[] employeesDepartment;
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                sum += e.getSalary();
                count++;
            }
        }
        double middleSum = sum / count;
        String message = "Средняя зарплата в отделе " + department + " составляет - " + middleSum + " рублей";
        return message;
    }

    public void indexSalaryInDepartment (String department, double index) {
        double newSalary = 0.0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                newSalary = e.getSalary() * (1 + index / 100);
                e.setSalary(newSalary);
            }
        }
    }

    public void findEmployeeWithSalaryLessThan (double salary) {
        System.out.println("Сотрудники с зарплатой меньше, чем " + salary + " рублей:");
        for (Employee e : employees) {
            if (e != null && e.getSalary() < salary) {
                printInfoEmployee(e);
            }
        }
    }

    public void findEmployeeWithSalaryGreaterThan (double salary) {
        System.out.println("Сотрудники с зарплатой больше, чем " + salary + " рублей:");
        separation();
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= salary) {
                printInfoEmployee(e);
                separation();
            }
        }
    }

    public void printEmployeeDepartment (String department) {
        System.out.println("Список сотрудников отдела " + department + ":");
        separation();
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                String employee = "ФИО - " + e.getFullName() + "\nЗарплата - " + e.getSalary() + "\nId - " + e.getId();
                System.out.println(employee);
                separation();
            }
        }
    }

    public void printInfoEmployee(Employee employees) {
        if (employees != null) {
            String employee = "ФИО - " + employees.getFullName() + "\nЗарплата - " + employees.getSalary() + "\nId - " + employees.getId();
            System.out.println(employee);
        }
    }

    public void printArrays () {
        separation();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            separation();
        }
    }

}
