public class singleton{

    //static variable to tract the instance of this class
    private static singleton s=null;
    // to restrict the object creation
    private singleton(){

    }

    //static method to restrict object creation exactly once
    public static singleton createSingleton(){
        if(s==null){
            s=new singleton();
        }
        return s;
    }
}