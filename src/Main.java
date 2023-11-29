import java.util.Arrays;

public class Main {

    public static  void separation () {
        System.out.println("________________________________");
    }

    public static String sumSalary (Employee [] employees) {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getSalary();
        }
        String message = "Сумма затрат на зарпалты в месяц - " + sum + " рублей";
        return message;
    }

    public static String minSalary (Employee [] employees) {
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        String message = "Минимальная зарплата - " + min + " рублей";
        return message;
    }

    public static String maxSalary (Employee [] employees) {
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        String message = "Максимальная зарплата - " + max + " рублей";
        return message;
    }

    public static String middleSalary (Employee [] employees) {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getSalary();
        }
        double middleSalary = sum/employees.length;
        String message = "Среднее значение зарплат за месяц составляет - " + middleSalary + " рублей";
        return message;
    }

    public static void devireFullName (Employee [] employees) {
        int i = 0;
        while (i < employees.length) {
            System.out.println("ФИО сотрудника - " + employees[i].getFullName());
            i++;
        }
    }

    public static void indexSalary (Employee [] employees, double indexationCoefficient) {
        for (Employee e: employees) {
            if (e != null) {
                double newSalary = e.getSalary() * (1 + indexationCoefficient / 100);
                e.setSalary(newSalary);
            }
        }
    }

    public static String minSalaryInDepartment (Employee [] employees, String department) {
        double min = Double.MAX_VALUE;
        Employee poorEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment().equals(department) && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                poorEmployee = employees[i];
            }
        }
        String message = "Сотрудник с самой маленькой зарплатой в отделе " + department + " - \n" + poorEmployee;
        return message;
    }

    public static String maxSalaryInDepartment (Employee [] employees, String department) {
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

    public static String sumSalaryInDepartment (Employee [] employees, String department) {
        double sum = 0.0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                sum += e.getSalary();
            }
        }
        String message = "Сумма затрат на зарплату по отделу " + department + " составляет - " + sum + " рублей";
        return message;
    }

    public static String middleSalaryInDepartment (Employee [] employees, String department) {
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

    public static void indexSalaryInDepartment (Employee [] employees, String department, double index) {
        double newSalary = 0.0;
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                newSalary = e.getSalary() * (1 + index / 100);
                e.setSalary(newSalary);
            }
        }
    }

    public static void findEmployeeWithSalaryLessThan (Employee [] employees, double salary) {
        System.out.println("Сотрудники с зарплатой меньше, чем " + salary + " рублей:");
        for (Employee e : employees) {
            if (e != null && e.getSalary() < salary) {
                printInfoEmployee(e);
            }
        }
    }

    public static void findEmployeeWithSalaryGreaterThan (Employee [] employees, double salary) {
        System.out.println("Сотрудники с зарплатой больше, чем " + salary + " рублей:");
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= salary) {
                printInfoEmployee(e);
            }
        }
    }

    public static void printEmployeeDepartment (Employee [] employees, String department) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment().equals(department)) {
                String employee = "ФИО - " + e.getFullName() + "\nЗарплата - " + e.getSalary() + "\nId - " + e.getId();
            }
        }
    }

    public static void printInfoEmployee(Employee employees) {
        if (employees != null) {
            String employee = "ФИО - " + employees.getFullName() + "\nЗарплата - " + employees.getSalary() + "\nId - " + employees.getId();
            System.out.println(employee);
        }
    }

    public static void printArrays (Employee [] employees) {
        separation();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            separation();
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees [0] = new Employee("Петров Иван Федорович", "1", 78960.0);
        employees [1] = new Employee("Сидоров Алексей Павлович", "2", 68920.0);
        employees [2] = new Employee("Компотов Петр Александрович", "3", 89650.0);
        employees [3] = new Employee("Капустин Сергей Фиолентович", "4", 74250.0);
        employees [4] = new Employee("Антонов Анатолий Иванович", "5", 83650.0);
        employees [5] = new Employee("Горшнев Роберт Кадимович", "1", 68520.0);
        employees [6] = new Employee("Толстоноженко Александр Леонидович", "2", 93260.0);
        employees [7] = new Employee("Медведев Дмитрий Анатольевич", "3", 83650.0);
        employees [8] = new Employee("Сухорукова Елена Дмитриевна", "4", 106250.0);
        employees [9] = new Employee("Уканеева Венера Гиндулловна", "5", 85500.0);

        printArrays(employees);
        System.out.println(sumSalary(employees));
        separation();
        System.out.println(minSalary(employees));
        separation();
        System.out.println(maxSalary(employees));
        separation();
        System.out.println(middleSalary(employees));
        separation();
        devireFullName(employees);
        separation();
        indexSalary(employees, 0);
        separation();
        System.out.println(minSalaryInDepartment( employees, "2"));
        separation();
        System.out.println(maxSalaryInDepartment( employees, "3"));
        separation();
        System.out.println(sumSalaryInDepartment( employees, "4"));
        separation();
        System.out.println(middleSalaryInDepartment(employees, "1"));
        separation();
        printEmployeeDepartment(employees, "1");
        separation();
        findEmployeeWithSalaryLessThan(employees, 74250);
    }
}
