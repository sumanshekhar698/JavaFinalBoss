package dev.codecounty.oops.encapsulation;

public class Employee {

    private String name;
    private int empID;
    private String companyName;
    private boolean isPermanentEmployee;
    private long salary;
    private long phoneNumber;

    public Employee(String name, int empID, String companyName, boolean isPermanentEmployee, long salary, long phoneNumber) {
        this.name = name;
        this.empID = empID;
        this.companyName = companyName;
        this.isPermanentEmployee = isPermanentEmployee;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }


    public Employee() {
    }

    public String info() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", companyName='" + companyName + '\'' +
                ", isPermanentEmployee=" + isPermanentEmployee +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getName() {
        return name;
    }

//    Converted all the setters for Builder pattern
    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getEmpID() {
        return empID;
    }

    public Employee setEmpID(int empID) {
        this.empID = empID;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Employee setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    public Employee setPermanentEmployee(boolean permanentEmployee) {
        isPermanentEmployee = permanentEmployee;
        return this;
    }

    public long getSalary() {
        return salary;
    }

    public Employee setSalary(long salary) {
        this.salary = salary;
        return this;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Employee setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
