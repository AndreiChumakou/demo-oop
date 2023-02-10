package by.itacademy.andreichumakou.javabasics.oop;

public class Person extends Student{
    private int salary;

    public Person(int grant, int salary) {
        super(grant);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int getIncome() {
        return super.getIncome() + salary;
    }
}
