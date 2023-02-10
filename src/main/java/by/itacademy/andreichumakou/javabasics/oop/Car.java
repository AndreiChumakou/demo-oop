package by.itacademy.andreichumakou.javabasics.oop;

public class Car {
    private long id;
    private String carBrand;
    private String carModel;
    private int yearOfManufacture;
    private String color;
    private double price;
    private String registrationNumber;

    public Car() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id <= 0) {
            System.out.println("Enter incorrect value of id: " + id);
        } else this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        if (carBrand.equals("")) {
            System.out.println("A carBrand wasn't entered: " + carBrand);
        } else this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        if (carModel.equals("")) {
            System.out.println("A carModel wasn't entered: " + carModel);
        } else this.carModel = carModel;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        if (yearOfManufacture <= 0) {
            System.out.println("Enter incorrect value of yearOfManufacture: " + yearOfManufacture);
        } else this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("")) {
            System.out.println("A color wasn't entered: " + color);
        } else this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Enter incorrect value of price: " + price);
        } else this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.equals("")) {
            System.out.println("A registrationNumber wasn't entered: " + registrationNumber);
        } else this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return    "Car id:                " + id +
                "\n    carBrand:          " + carBrand +
                "\n    carModel:          " + carModel +
                "\n    yearOfManufacture: " + yearOfManufacture +
                "\n    color:             " + color +
                "\n    price:             " + price +
                "\n    registrationNumber:" + registrationNumber;
    }
}
