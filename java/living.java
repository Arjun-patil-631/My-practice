public abstract class living extends matter{
    
    private final int lifeSpam;
    private final boolean isCellular;

    public living(double mass, double volume, int lifeSpam){
        super(mass, volume);
        this.lifeSpam=lifeSpam;
        this.isCellular=true;

    }
    public void showLifespan(){
        System.out.println("The lifespan is " + lifeSpam + " years");
    }

    public void showLiving(){
        System.out.println("Is cellular: " + isCellular);
    }
}