public class car extends vehicle{
    private int SeatingCapacity;

    public car(String make,String model, double fuelEffiency, int SeatingCapacity){
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
        System.out.println("Range: "+CalculateRange(100)+" km");
    }
}