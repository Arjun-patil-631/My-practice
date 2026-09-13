public class Truck extends Vehicle{
    private double cargoCapacity;
    private boolean fullyLoaded;

    public Truck(String make, String model, double fuelEffiency, double cargoCapacity, boolean fullyLoaded){
        super(make, model, fuelEffiency);
        this.cargoCapacity=cargoCapacity;
        this.fullyLoaded=fullyLoaded;

    }

    @Override
    public double CalculateRange(double fuelCapacity){
        double range=fuelCapacity*fuelEffiency;

        if(fullyLoaded){
            range=range * 0.90;
        }
        return range;
    }

    void display(){
        System.out.println("truck "+ make +" "+model);
        System.out.println("Cargocapcity: "+cargoCapacity);
        System.out.println("Fully Loaded: "+fullyLoaded);
        System.out.println("Range: "+CalculateRange(100)+"km");
    }

}