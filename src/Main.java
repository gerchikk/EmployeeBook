public class Main {

    public static  void separation () {
        System.out.println("________________________________");
    }

    // Посчитать сумму затрат на зарплаты в месяц.
    public static double sumSalary (Employee [] employees) {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getSalary();
        }
        return sum;

    }

    // Найти сотрудника с минимальной зарплатой.
    public static double minSalary (Employee [] employees) {
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    // Найти сотрудника с максимальной зарплатой.
    public static double maxSalary (Employee [] employees) {
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    // Подсчитать среднее значение зарплат.
    public static double middleSalary (Employee [] employees) {
        double sum = 0.0;
        for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getSalary();
        }
        double middleSalary = sum/employees.length;
        return middleSalary;
    }

    //Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static String devireFullName (Employee [] employees) {
        int i = 0;
        String fullName = employees[i].getFullName();
        while (i < employees.length) {
            System.out.println("ФИО сотрудника - " + employees[i].getFullName());
            i++;
        }
        return fullName;
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
        separation();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            separation();
        }
        System.out.println("Сумма затрат на зарпалты в месяц - " + sumSalary(employees) + " рублей");
        separation();
        System.out.println("Минимальная зарплата - " + minSalary(employees) + " рублей");
        separation();
        System.out.println("Максимальная зарплата - " + maxSalary(employees) + " рублей");
        separation();
        System.out.println("Среднее значение зарплат за месяц составляет - " + middleSalary(employees) + " рублей");
        separation();
        System.out.println(devireFullName(employees));
        separation();
    }
}
