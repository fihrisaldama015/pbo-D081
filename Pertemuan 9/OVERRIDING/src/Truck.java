public class Truck extends Car {
    private int numberOfAxles;
    private int loadCapacityInKg;

    public Truck(String vechileName, int numberOfPassengers, int numberOfDoors, int numberOfWheels, String carBrand, String engineModel, int engineCapacityInCC, int enginePower, int engineTorque, String engineTransmission, int numberOfAxles, int loadCapacityInKg) {
        super(vechileName, numberOfPassengers, numberOfDoors, numberOfWheels, carBrand, engineModel, engineCapacityInCC, enginePower, engineTorque, engineTransmission);

        this.numberOfAxles = numberOfAxles;
        this.loadCapacityInKg = loadCapacityInKg;
    }

    public void startEngine(){
        System.out.println("dak dak dak dak dak.....");
    }

    public void stopEngine(){
        System.out.println("gluk.....");
    }

    public void printTruckInfo() {
        super.printCarInfo();
        System.out.println("Number of axles: " + this.numberOfAxles);
        System.out.println("Load capacity in kg: " + this.loadCapacityInKg);
    }
    
    public void openTruckLoad(){
        System.out.println("Opening truck load");
    }

    public void closeTruckLoad(){
        System.out.println("Closing truck load");
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public int getNumberOfAxles() {
        return this.numberOfAxles;
    }

    public void setLoadCapacityInKg(int loadCapacityInKg) {
        this.loadCapacityInKg = loadCapacityInKg;
    }

    public int getLoadCapacityInKg() {
        return this.loadCapacityInKg;
    }
}
