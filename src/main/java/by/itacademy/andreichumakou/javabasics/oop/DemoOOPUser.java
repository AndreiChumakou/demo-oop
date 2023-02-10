package by.itacademy.andreichumakou.javabasics.oop;

import java.util.ArrayList;

public class DemoOOPUser {
    public static void main(String[] args) {
        Person person = new Person(100, 400);
        person.setName("Ivanoff");
        System.out.println(person.getIncome());

        Student student = new Person(100, 400);
        student.setName("Sidoroff");
        System.out.println(student.getIncome());

        User user = new Person(100, 400);
        user.setName("Petroff");
        System.out.println( ((Person)user).getIncome());

        ArrayList<User> users = new ArrayList<>();
        users.add(person);
        users.add(student);
        users.add(user);

        for (User element:users) {
            if (element instanceof Person) {
                System.out.println(element.getName() + " has " + ((Person) element).getIncome());
            }
        }


    }
}
