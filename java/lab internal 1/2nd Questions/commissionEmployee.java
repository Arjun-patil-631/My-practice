public class commissionEmployee extends Employee{

    private double baseSalary;
    private double salesVolume;
    private double commissionPercentage;

    public commissionEmployee(String name, int id, double baseSalary, double salesVolume, double commissionPercentage) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.salesVolume = salesVolume;
        this.commissionPercentage = commissionPercentage;
    }

    public double calculateMonthlySalary() {
        double commission = salesVolume * commissionPercentage / 100;
        return baseSalary + commission;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Type: Commission");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateMonthlySalary());
    }
}