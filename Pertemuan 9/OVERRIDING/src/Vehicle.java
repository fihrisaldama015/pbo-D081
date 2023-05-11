public class Vehicle {
    private int numberOfPassengers;
    private String vehicleName;

    public Vehicle(String vehicleName, int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        this.vehicleName = vehicleName;
    }

    public void startEngine(){
        System.out.println("Starting my engine");
    }

    public void stopEngine(){
        System.out.println("Stopping my engine");
    }

	public void move() {
		System.out.println("I am moving");
	}

    public void printVehicleInfo() {
        System.out.println("Vehicle name: " + this.vehicleName);
        System.out.println("Number of passengers: " + this.numberOfPassengers);
    }
	
	public int move(int distance) {
		System.out.println("I am moving " + distance + " km");
		return distance;
	}

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }

}
