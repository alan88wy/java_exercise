public abstract class Employee
{
    private String EmpNo;
    private String FirstName;
    private String LastName;

    public Employee(String EmpNo, String FirstName, String LastName)
    {
        this.EmpNo = EmpNo;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void setName(String FirstName, String LastName)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getName()
    {
        return this.FirstName + " " + this.LastName;
    }

    public void setEmpNo(String EmpNo)
    {
        this.EmpNo = EmpNo;
    }

    public String getEmpNo()
    {
        return this.EmpNo;
    }

    public abstract String getStatus();  
}