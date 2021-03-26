package oops.concepts;

public class Employee {
    private int iId;
    private String sRole;
    private double dSalary;
    private String sEmpID;
    private String sFirstName;
    private String sLastName;
    private int iAge;

    public int getId() {
        return iId;
    }

    public void setId() {
        this.iId = iId;
    }

    public String getsRole() {
        return sRole;
    }

    public void setsRole() {
        this.sRole = sRole;
    }

    public double getSalary() {
        return dSalary;
    }

    public void setSalary() {
        this.dSalary = dSalary;
    }
    public Employee(){}
    public Employee(int iAge,String sFirstName,String sLastName){
        this.iAge = iAge;
        this.sFirstName=sFirstName;
        this.sLastName=sLastName;
    }
}
