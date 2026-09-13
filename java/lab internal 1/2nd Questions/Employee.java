public abstract class Employee{

    protected  String name;
    protected int id;

    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }

    //abstract methods
    public abstract double calculateMonthlySalary();
    public abstract void getEmployeeDetails();
}