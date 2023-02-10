package by.itacademy.andreichumakou.javabasics.oop;

public class Student extends User{
    private int grant;

    public Student(int grant) {
        this.grant = grant;
    }

    public void setGrant(int grant) {
        this.grant = grant;
    }

    public int getIncome() {
        return grant > 0 ? grant : 0;
        }
    }

