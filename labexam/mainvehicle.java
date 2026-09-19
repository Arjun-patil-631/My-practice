public class mainvehicle{
    public static void main(String[] args) {
        car car=new car("Toyato", "k12", 15, 5);

        truck truck= new truck("volvo", "3GT", 9, 3000, true);

        car.display();
        System.out.println();
        truck.display();
    }
}