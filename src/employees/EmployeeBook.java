package employees;

import employees.dao.CRUD;
import employees.dao.Print;
import employees.dao.Statistic;
import employees.impl.CRUDImpl;
import employees.impl.PrintImpl;
import employees.impl.StatisticImpl;

public class EmployeeBook {
    private static final int SIZE = 10;
    private int sizeArr = 0;
    private Employee[] employees = new Employee[SIZE];


    private Statistic statistics = new StatisticImpl(this.employees, this);
    private CRUD crud = new CRUDImpl(this.employees, this);
    private Print print = new PrintImpl(this.employees, this);

    public void upSize() {
        this.sizeArr++;
    }

    public void downSize() {
        this.sizeArr--;
    }

    public Statistic statistics() {
        return statistics;
    }

    public CRUD crud() {
        return crud;
    }

    public Print print() {
        return print;
    }

    public int getSizeArr() {
        return this.sizeArr;
    }

    public void setSizeArr(int sizeArr) {
        this.sizeArr = sizeArr;
    }
}
