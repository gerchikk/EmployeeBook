import employees.Employee;
import employees.EmployeeBook;
import employees.enums.Departments;

public class Main {

    public static void main(String[] args) {
        EmployeeBook bookEmployees = new EmployeeBook();
        bookEmployees.crud().addEmployee(new Employee("Петров Иван Федорович", Departments.SALES, 78960.0));
        bookEmployees.crud().addEmployee(new Employee("Сидоров Алексей Павлович", Departments.PRODUCTION, 68920.0));
        bookEmployees.crud().addEmployee(new Employee("Компотов Петр Александрович", Departments.ANALYTICS, 89650.0));
        bookEmployees.crud().addEmployee(new Employee("Капустин Сергей Фиолентович", Departments.ACCOUNTING, 74250.0));
        bookEmployees.crud().addEmployee(new Employee("Антонов Анатолий Иванович", Departments.NONE, 83650.0));
        bookEmployees.crud().addEmployee(new Employee("Горшнев Роберт Кадимович", Departments.NONE, 68520.0));
        bookEmployees.crud().addEmployee(new Employee("Толстоноженко Александр Леонидович", Departments.ACCOUNTING, 93260.0));
        bookEmployees.crud().addEmployee(new Employee("Медведев Дмитрий Анатольевич", Departments.ANALYTICS, 83650.0));
        bookEmployees.crud().addEmployee(new Employee("Сухорукова Елена Дмитриевна", Departments.PRODUCTION, 106250.0));
        bookEmployees.crud().addEmployee(new Employee("Уканеева Венера Гиндулловна", Departments.SALES, 85500.0));

        message("Получить список всех сотрудников");
        bookEmployees.print().printAllEmployees();
        separation();

        message("Получить список всех сотрудников (только ФИО)");
        bookEmployees.print().devireFullName();
        separation();

        message("Посчитать сумму затрат на зарплаты");
        message(bookEmployees.statistics().sumSalary());
        separation();

        message("Найти сотрудника с минимальной заплатой");
        message(bookEmployees.statistics().minSalary());
        separation();

        message("Найти сотрудника с максимальной зарплатой");
        message(bookEmployees.statistics().maxSalary());
        separation();

        message("Подсчитать среднее значение зарплат");
        message(bookEmployees.statistics().avgSalary());
        separation();

        message("Найти сотрудника с минимальной зарплатой в отделе");
        message(bookEmployees.statistics().minSalaryInDepartment(Departments.SALES));
        separation();

        message("Найти сотрудника с максимальной зарплатой в отделе");
        message(bookEmployees.statistics().maxSalaryInDepartment(Departments.ANALYTICS));
        separation();

        message("Найти сумму затрат на зарплату по отделу");
        message(bookEmployees.statistics().sumSalaryInDepartment(Departments.ACCOUNTING));
        separation();

        message("Найти среднюю зарплату по отделу");
        message(bookEmployees.statistics().avgSalaryInDepartment(Departments.PRODUCTION));
        separation();

        message("Найти сотрудников с зарплатой меньше, чем 70 000 рублей");
        bookEmployees.statistics().findEmployeeWithSalaryLessThan(70000);
        separation();

        message("Найти сотрудников с зарплатой меньше, чем 70 000 рублей");
        bookEmployees.statistics().findEmployeeWithSalaryGreaterThan(70000);
        separation();

        message("Проиндексировать зарплату всех сотрудников");
        bookEmployees.crud().indexSalary(15);
        bookEmployees.print().printAllEmployees();
        separation();

        message("Проиндексировать зарплату всех сотрудников отдела");
        bookEmployees.crud().indexSalaryInDepartment(Departments.ACCOUNTING, 10);
        bookEmployees.print().printEmployeeDepartment(Departments.ACCOUNTING);
        separation();

        message("Напечатать всех сотрудников отдела");
        bookEmployees.print().printEmployeeDepartment(Departments.SALES);
        separation();

        message("Добавить нового сотрудника");
        bookEmployees.crud().addEmployee(new Employee("Михайлов Сергей Петрович", Departments.NONE,99000.0));
        bookEmployees.print().printAllEmployees();
        separation();

        message("Удалить сотрудника");
        bookEmployees.crud().deleteEmployee(5);
        bookEmployees.print().printAllEmployees();
        separation();

        message("Изменить зарплату сотрудника");
        bookEmployees.crud().changeSalary("Сидоров Алексей Павлович", 95000);
        bookEmployees.print().printInfoEmployee("Сидоров Алексей Павлович");
        separation();

        message("Изменить отдел сотрудника");
        bookEmployees.crud().changeDepartment(1, Departments.NONE);
        bookEmployees.crud().findById(1);
        separation();

        message("Получить Ф. И. О. всех сотрудников по отделам");
        bookEmployees.print().printEmployeeDepartment(Departments.ACCOUNTING);
        separation();
    }

    public static void message(Object object) {
        System.out.println(object.toString() + "\n");
    }

    public static void separation() {
        System.out.println("__________________________");
    }
}
