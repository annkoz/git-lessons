package Homework6;

public class Parking {

    Car[] cars = new Car[10];

    public void parkCar(Car car) {

        for (int index = 0; index <= cars.length - 1; index++) {
            if (cars[index] == null) {
                cars[index] = car;
                break;
            }
        }
    }

    public void printCars() {

        for (int index = 0; index <= cars.length - 1; index++) {
            if (cars[index] != null) {
                System.out.println(cars[index].model);
                System.out.println(cars[index].color);
                System.out.println(cars[index].year);
                System.out.println();
            } else {
                System.out.println("Empty space for " + (index+1) + " place");
                System.out.println();
            }
        }
    }
}
