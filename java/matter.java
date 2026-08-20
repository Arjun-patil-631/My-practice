abstract public class matter{

    private final double massInKg;
    private final double volumeInCubicM;

    public matter(double mass, double volume){
        this.massInKg=mass;
        this.volumeInCubicM=volume;
    }

    public void showMatter(){
        System.out.println("Mass: " + massInKg + " kg");
        System.out.println("Volume: " + volumeInCubicM + " cubic m");
    }
}