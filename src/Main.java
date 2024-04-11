import employees.EmployeeBook;

public class Main {

    public static void main(String[] args) {
        EmployeeBook bookEmployees = new EmployeeBook(10);
        bookEmployees.addEmployee("Петров Иван Федорович", "Sales department", 78960.0);
        bookEmployees.addEmployee("Сидоров Алексей Павлович", "Marketing department", 68920.0);
        bookEmployees.addEmployee("Компотов Петр Александрович", "Finance department", 89650.0);
        bookEmployees.addEmployee("Капустин Сергей Фиолентович", "Accounting office", 74250.0);
        bookEmployees.addEmployee("Антонов Анатолий Иванович", "Legal department", 83650.0);
        bookEmployees.addEmployee("Горшнев Роберт Кадимович", "Sales department", 68520.0);
        bookEmployees.addEmployee("Толстоноженко Александр Леонидович", "Marketing department", 93260.0);
        bookEmployees.addEmployee("Медведев Дмитрий Анатольевич", "Finance department", 83650.0);
        bookEmployees.addEmployee("Сухорукова Елена Дмитриевна", "Accounting office", 106250.0);
        bookEmployees.addEmployee("Уканеева Венера Гиндулловна", "Legal department", 85500.0);

        bookEmployees.printArrays();
        bookEmployees.deleteEmployee("Петров Иван Федорович");
        bookEmployees.printArrays();
        bookEmployees.addEmployee("Петров Иван Федорович", "Sales department", 78960.0);
        bookEmployees.findEmployeeWithSalaryGreaterThan(50000);
        bookEmployees.printEmployeeDepartment("Marketing department");
    }
}
