public class Main {

    public static  void separation () {
        System.out.println("________________________________");
    }
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee [0] = new Employee("Петров Иван Федорович", "1", 78960);
        employee [1] = new Employee("Сидоров Алексей Павлович", "2", 68920);
        employee [2] = new Employee("Компотов Петр Александрович", "3", 89650);
        employee [3] = new Employee("Капустин Сергей Фиолентович", "4", 74250);
        employee [4] = new Employee("Пирогов Аркадий Леонидович", "5", 83650);
        employee [5] = new Employee("Пирогов Аркадий Леонидович", "5", 83650);
        employee [6] = new Employee("Пирогов Аркадий Леонидович", "5", 83650);
        employee [7] = new Employee("Пирогов Аркадий Леонидович", "5", 83650);
        employee [8] = new Employee("Пирогов Аркадий Леонидович", "5", 83650);
        employee [9] = new Employee("Пирогов Аркадий Леонидович", "5", 83650);
        separation();
        System.out.println(employee [9]);
        System.out.println(employee.sumSalary());


    }
}
