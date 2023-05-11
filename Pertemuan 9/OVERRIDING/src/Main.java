public class Main {
    public static void main(String[] args) {
        System.out.println("JAVA MULTI_LEVEL INHERITANCE");
        System.out.println("============================");
        System.out.println("Create New Vehicle");
        Vehicle vehicle = new Vehicle("My Motorcycles", 2);
        vehicle.printVehicleInfo();
        vehicle.startEngine();
        vehicle.move();
        vehicle.move(10);
        vehicle.stopEngine();
        System.out.println();

        System.out.println("Create New Car");
        Car car = new Car("Civic Turbo Type-R", 4, 4, 4, "Honda", "Four-cylinder Turbocharged", 2000, 310, 420, "6-speed manual");
        car.printCarInfo();
        car.openDoor();
        car.startEngine();
        car.playMusic();
        car.move();
        car.move(85);
        car.stopMusic();
        car.stopEngine();
        car.closeDoor();
        System.out.println();

        System.out.println("Create New Truck");
        Truck truck = new Truck("FM 20 JD", 2, 2, 6, "Hino", "V10", 7684, 260, 882, "6-speed manual", 2, 10000);
        truck.printTruckInfo();
        truck.openDoor();
        truck.startEngine();
        truck.move();
        truck.move(176);
        truck.openTruckLoad();
        truck.closeTruckLoad();
        truck.stopEngine();
        truck.closeDoor();
        System.out.println();

    }
}
