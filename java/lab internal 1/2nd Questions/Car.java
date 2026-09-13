public class Car extends Vehicle{
    private int SeatingCapacity;

    public Car(String make,String model, double fuelEffiency, int SeatingCapacity){
        super(make, model, fuelEffiency);
        this.SeatingCapacity=SeatingCapacity;

    }

    @Override
    public double CalculateRange(double fuelCapacity){
        return fuelCapacity*fuelEffiency;
    }

    void display(){
        System.out.println("car: " + make + " "+model);
        System.out.println("Seating capacity: "+SeatingCapacity);
        System.out.println("Range: "+CalculateRange(50)+" km");
    }
}