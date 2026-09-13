public class DemoPayrollSystem {

    public static void main(String[] args) {

        // Array of Employee references
        Employee[] employees = {
            new FullTimeEmployee("Arjun", 101, 50000, 10000),
            new PartTimeEmployee("Rahul", 102, 500, 80),
            new commissionEmployee("Priya", 103, 30000, 200000, 5)
        };

        System.out.println("===== CORPORATE PAYROLL REPORT =====");

        for (Employee emp : employees) {
            emp.getEmployeeDetails();
            System.out.println("----------------------------");
        }
    }
}