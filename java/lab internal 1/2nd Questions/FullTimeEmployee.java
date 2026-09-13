public class FullTimeEmployee extends Employee{
    private double monthlySalary;
    private double benefits;

    public FullTimeEmployee(String name, int id, double monthlySalary, double benefits){
        super(name, id);
        this.monthlySalary=monthlySalary;
        this.benefits=benefits;
    }

    public double calculateMonthlySalary(){
        return monthlySalary+benefits;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Type: Full-Time");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateMonthlySalary());
    }

}