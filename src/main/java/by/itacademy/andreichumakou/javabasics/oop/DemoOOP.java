package by.itacademy.andreichumakou.javabasics.oop;

public class DemoOOP {
    public static void main(String[] args) {
        Customer customer001 = new Customer();
        customer001.setId(123456);
        customer001.setSurname("Ivanoff");
        customer001.setName("Ivan");
        customer001.setAddress("Minsk, Park street, 177");
        customer001.setNumerAccount(345682);
        customer001.setNumberCreditCard(456274123694581L);
        System.out.println(customer001);
        System.out.println("ID: " + customer001.getId());
    }

}
