public class Payroll {
    public static void main(String[] args) 
        {
            PartTimeEmployee pte = new PartTimeEmployee("E001", "James", "Bond", 30.0);
            
            System.out.println("Employee No : " + pte.getEmpNo());
            System.out.println("Name : " + pte.getName());
            System.out.println("Salary : " + pte.calculatePay(50.00));
            System.out.println("Employment Status : " + pte.getStatus());
        }
}
