package Parking;

public class Parking {

    private ParkingPlace[] parkingPlaces = new ParkingPlace[10];

    public Parking() {
        createParkingPlaces();
    }


    public void parkNewCar(Car someCar) {
        for(int i = 0; i < parkingPlaces.length; i++) {
            if(parkingPlaces[i].getCurrentCar() == null) {
                parkingPlaces[i].addCar(someCar);
                System.out.println("Car " +someCar.getCarModel() + " was added to parking place " +i);
                break;
            }
        }
    }

    private void createParkingPlaces() {
        for(int i = 0; i < parkingPlaces.length; i++) {
            parkingPlaces[i] = new ParkingPlace();
        }
    }
}
