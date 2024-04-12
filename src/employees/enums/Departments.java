package employees.enums;

public enum Departments {
    NONE("Нет отдела"),
    ACCOUNTING("Бухгалтерия"),
    PRODUCTION("Производство"),
    SALES("Продажи"),
    ANALYTICS("Аналитика");
    private String name;

    Departments(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
