public class PartTimeEmployee extends Employee 
{

    private double hourlyPay;

    public PartTimeEmployee(String EmpNo, String FirstName, String LastName, double hourlyPay) {
        super(EmpNo, FirstName, LastName);
        this.hourlyPay = hourlyPay;
    }
    
    public void setName(String FirstName, String LastName)
    {
        super.setName(FirstName, LastName);
    }

    public String getName()
    {
        return super.getName();
    }

    public void setEmpNo(String EmpNo)
    {
        super.setEmpNo(EmpNo);
    }

    public String getEmpNo()
    {
        return super.getEmpNo();
    }

    public void setHourlyRate(double rate)
    {
        this.hourlyPay = rate;
    }

    public double getHourlyRate()
    {
        return this.hourlyPay;
    }

    public double calculatePay(double hours)
    {
        return this.hourlyPay * hours;
    }

    @Override
    public String getStatus()
    {
        return "Part-Time";
    }

}
