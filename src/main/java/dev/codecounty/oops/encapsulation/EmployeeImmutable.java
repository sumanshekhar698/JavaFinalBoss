package dev.codecounty.oops.encapsulation;

public class EmployeeImmutable {
    // 1. Fields are final (Immutability)
    private final String name;
    private final int empID;
    private final String companyName;
    private final boolean isPermanentEmployee;
    private final long salary;
    private final long phoneNumber;

    // 2. Private constructor: Only the Builder can create an Employee
    private EmployeeImmutable(Builder builder) {
        this.name = builder.name;
        this.empID = builder.empID;
        this.companyName = builder.companyName;
        this.isPermanentEmployee = builder.isPermanentEmployee;
        this.salary = builder.salary;
        this.phoneNumber = builder.phoneNumber;
    }

    // Getters only (No setters allowed for immutable objects)
    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    public long getSalary() {
        return salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    // 3. The Static Inner Builder Class
    public static class Builder {
        private String name;
        private int empID;
        private String companyName;
        private boolean isPermanentEmployee;
        private long salary;
        private long phoneNumber;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmpID(int empID) {
            this.empID = empID;
            return this;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setPermanentEmployee(boolean permanentEmployee) {
            isPermanentEmployee = permanentEmployee;
            return this;
        }

        public Builder setSalary(long salary) {
            this.salary = salary;
            return this;
        }

        public Builder setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeImmutable build() {
            // Here you can add validation logic 
            // e.g., if (name == null) throw new IllegalStateException();
            return new EmployeeImmutable(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Employee[ID=%d, Name=%s, Company=%s]", empID, name, companyName);
    }
}