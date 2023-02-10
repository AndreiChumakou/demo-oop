package by.itacademy.andreichumakou.javabasics.oop;

import java.util.ArrayList;

public class CarShowroom {
    final ArrayList<Car> listOfCarCurrent = new ArrayList<>();

    public CarShowroom() {
    }

    public ArrayList<Car> getListOfCarCurrent() {
        return listOfCarCurrent;
    }

    void newCarArrival(Car carNew) {
        listOfCarCurrent.add(carNew);
    }

    void saleCar(Car carForSale) {
        listOfCarCurrent.remove(carForSale);
        System.out.println("Car ID= " + carForSale.getId() + " was sold");
    }


}
