public class Main {

    public static  void separation () {
        System.out.println("________________________________");
    }

    // Посчитать сумму затрат на зарплаты в месяц.

    public static double sumSalary (Employee [] employees) {
        double sum = 0.0;
        for (Employee e : employees) {
            if (e != null) sum += e.getSalary();
        }
        return sum;

    }



    // Найти сотрудника с минимальной зарплатой.
    public static void minSalary () {

    }


    // Найти сотрудника с максимальной зарплатой.


    // Подсчитать среднее значение зарплат.


    //Получить Ф. И. О. всех сотрудников (вывести в консоль).


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
        System.out.println("Сумма затрат на зарпалты в месяц - " + sumSalary(employees) + " рублей)");
        separation();




    }
}
