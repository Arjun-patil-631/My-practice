public class Vehicle{
    protected String make;
    protected String model;
    protected double fuelEffiency;

    public Vehicle(String make, String model, double fuelEffiency) {
        this.make=make;
        this.model=model;
        this.fuelEffiency=fuelEffiency;
    }

    public double CalculateRange(double fuelCapacity){
        return fuelCapacity * fuelEffiency;
    }
    
}