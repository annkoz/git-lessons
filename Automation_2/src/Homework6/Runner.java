package Homework6;

public class Runner {
    public static void main(String[] args) {

        Parking parking = new Parking();
        Car car1 = new Car("audi", "yellow", 2017);
        Car car2 = new Car("bmw", "red", 2018);
        Car car3 = new Car("pego", "white", 2005);
        Car car4 = new Car("honda", "green", 2008);
        Car car5 = new Car("toyota", "black", 1999);

        parking.parkCar(car1);
        parking.parkCar(car2);
        parking.parkCar(car3);
        parking.parkCar(car4);
        parking.parkCar(car5);

        parking.printCars();

    }
}
