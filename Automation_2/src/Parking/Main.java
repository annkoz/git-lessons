package Parking;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();

        Car bmw = new Car("BMW");
        Car audi = new Car("audi");
        Car toyota = new Car("toyota");
        Car pego = new Car("pego");
        Car mercedes = new Car("mercedes");
        Car reno = new Car("reno");
        Car deo = new Car("deo");
        Car opel = new Car("opel");
        Car lada = new Car("lada");
        Car mazda = new Car("mazda");


        parking.parkNewCar(bmw);
        parking.parkNewCar(audi);
        parking.parkNewCar(toyota);
        parking.parkNewCar(pego);
        parking.parkNewCar(mercedes);
        parking.parkNewCar(reno);
        parking.parkNewCar(deo);
        parking.parkNewCar(opel);
        parking.parkNewCar(lada);
        parking.parkNewCar(mazda);

    }
}
