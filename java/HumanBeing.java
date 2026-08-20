public abstract class HumanBeing extends living{

    private final String name;
    private final String language;

    public HumanBeing(double mass, double volume, int lifeSpan, String name, String language){
        super(mass, volume, lifeSpan);
        this.name=name;
        this.language=language;
    }

    public void showHumanBeing(){
        System.out.println("Name: " + name);
        System.out.println("Language: " + language);
    }
}