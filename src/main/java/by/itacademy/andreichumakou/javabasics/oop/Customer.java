package by.itacademy.andreichumakou.javabasics.oop;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String address;
    private long numberCreditCard;
    private long numerAccount;

    public Customer() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Enter incorrect value of id: " + id);
        } else this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.equals("")) {
            System.out.println("A surname wasn't entered: " + surname);
        } else this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("A name wasn't entered: " + name);
        } else this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.equals("")) {
            System.out.println("A address wasn't entered: " + address);
        } else this.address = address;
    }

    public long getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(long numberCreditCard) {
        if (numberCreditCard <= 0) {
            System.out.println("Enter incorrect value of numberCreditCard: " + numberCreditCard);
        } else this.numberCreditCard = numberCreditCard;
    }

    public long getNumerAccount() {
        return numerAccount;
    }

    public void setNumerAccount(long numerAccount) {
        if (numerAccount <= 0) {
            System.out.println("Enter incorrect value of numerAccount: " + numerAccount);
        } else this.numerAccount = numerAccount;
    }

    @Override
    public String toString() {
        return "Customer: " + surname + " " + name + ". ID: " +
                id + ". Adress: " + address + ". NumerAccount: " + numerAccount +
                ". NumberCreditCard: " + numberCreditCard;
    }
}
