public class singletonDemo{
    public static void main(String[] args) {
        singleton s1=singleton.createSingleton();
        System.out.println(s1);
        singleton s2=singleton.createSingleton();
        System.out.println(s2);
    }
}