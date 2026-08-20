public class male extends HumanBeing{

    private final String chromosomes="XY";
    private final boolean hasBeard;
    public male(double mass, double volume, int lifeSpan, String name, String language, boolean hasBeard){
        super(mass, volume, lifeSpan, name, language);
        this.hasBeard=hasBeard;
    }
    public void shave(){
        if(hasBeard){
            System.out.println("Shaved");
        }
        else{
            System.out.println("No beard");
        }
    }

    public void showMale(){
        showHumanBeing();
        System.out.println("Chromosomes: " + chromosomes);
        System.out.println("Has beard: " + hasBeard);
    }
}