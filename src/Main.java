public class Main {

    public static  void separation () {
        System.out.println("________________________________");
    }
    public static void main(String[] args) {
        Employee petrov = new Employee("Петров Иван Федорович", "1", 78960, 1);
        Employee sidorov = new Employee("Сидоров Алексей Павлович", "2", 68920, 3);
        Employee kompotov = new Employee("Компотов Петр Александрович", "3", 89650, 3);
        Employee kapustin = new Employee("Капустин Сергей Фиолентович", "4", 74250, 3);
        Employee pirogov = new Employee("Пирогов Аркадий Леонидович", "5", 83650, 5);
        separation();
        System.out.println(petrov);
        separation();
        System.out.println(sidorov);
        separation();
        System.out.println(kompotov);
        separation();
        System.out.println(kapustin);
        separation();
        System.out.println(pirogov);
        separation();

    }
}
