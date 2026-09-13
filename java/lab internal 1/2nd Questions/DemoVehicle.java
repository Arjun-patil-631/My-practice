public class DemoVehicle{
    public static void main(String[] args) {
        Car car=new Car("Toyato", "k12", 15, 5);

        Truck truck= new Truck("volvo", "3GT", 9, 3000, true);

        car.display();
        System.out.println();
        truck.display();
    }
}