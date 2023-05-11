public class Car extends Vehicle {
    private int numberOfDoors;
    private int numberOfWheels;
    private String carBrand;
    private String engineModel;
    private int engineCapacityInCC;
    private int enginePowerinHP;
    private int engineTorqueinNm;
    private String engineTransmission;

    public Car(String vechileName, int numberOfPassengers, int numberOfDoors, int numberOfWheels, String carBrand, String engineModel, int engineCapacityInCC, int enginePowerinHP, int engineTorqueinNm, String engineTransmission) {
        super(vechileName, numberOfPassengers);

        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.carBrand = carBrand;
        this.engineModel = engineModel;
        this.engineCapacityInCC = engineCapacityInCC;
        this.enginePowerinHP = enginePowerinHP;
        this.engineTorqueinNm = engineTorqueinNm;
        this.engineTransmission = engineTransmission;
    }

    public void startEngine(){
        System.out.println("renggggggg....");
    }

    public void stopEngine(){
        System.out.println("ngg...");
    }

    public void openDoor(){
        System.out.println("Opening door");
    }

    public void closeDoor(){
        System.out.println("Closing door");
    }

    public void playMusic(){
        System.out.println("Playing music");
    }

    public void stopMusic(){
        System.out.println("Stopping music");
    }

    public void printCarInfo() {
        super.printVehicleInfo();
        System.out.println("Car brand: " + this.carBrand);
        System.out.println("Number of doors: " + this.numberOfDoors);
        System.out.println("Number of wheels: " + this.numberOfWheels);
        System.out.println("Engine model: " + this.engineModel);
        System.out.println("Engine capacity in CC: " + this.engineCapacityInCC);
        System.out.println("Engine power in HP: " + this.enginePowerinHP);
        System.out.println("Engine torque in Nm: " + this.engineTorqueinNm);
        System.out.println("Engine transmission: " + this.engineTransmission);
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getEngineModel() {
        return this.engineModel;
    }

    public void setEngineCapacityInCC(int engineCapacityInCC) {
        this.engineCapacityInCC = engineCapacityInCC;
    }

    public int getEngineCapacityInCC() {
        return this.engineCapacityInCC;
    }

    public void setEnginePowerinHP(int enginePowerinHP) {
        this.enginePowerinHP = enginePowerinHP;
    }

    public int getEnginePowerinHP() {
        return this.enginePowerinHP;
    }

    public void setEngineTorqueinNm(int engineTorqueinNm) {
        this.engineTorqueinNm = engineTorqueinNm;
    }

    public int getEngineTorqueinNm() {
        return this.engineTorqueinNm;
    }

    public void setEngineTransmission(String engineTransmission) {
        this.engineTransmission = engineTransmission;
    }

    public String getEngineTransmission() {
        return this.engineTransmission;
    }
}
