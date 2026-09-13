public class PartTimeEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    public double calculateMonthlySalary(){
        return hourlyRate*hoursWorked;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Type: Part Time");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+calculateMonthlySalary());
    }
}