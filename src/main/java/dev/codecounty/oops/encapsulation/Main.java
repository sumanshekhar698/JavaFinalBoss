package dev.codecounty.oops.encapsulation;

public class Main {

    public static void main(String[] args) {

        Student st1 = new Student(3, "John", "IIT");

//        System.out.println(st1.name);//private intsance variables cannot be directly accessed
//        System.out.println(st1.roll);

        System.out.println(st1.collegeName);

//        but private intsance variables can be indirectly accessed via setter and getters
        System.out.println(st1.getName());
        System.out.println(st1.getRoll());

//        they can be modified also by setters
        System.out.println(st1.getRoll());
        st1.setRoll(10);
        System.out.println(st1.getRoll());

        Employee emp1 = new Employee("Jane", 21, "Infoys", true, 10000000l,
                9898989898l);
        System.out.println(emp1.info());

        // We are using Builder pattern here
        Employee emp2 = new Employee().setPermanentEmployee(true).setName("Jim").setEmpID(673).setSalary(100000000L).setPhoneNumber(9008788765L);
        System.out.println(emp2.info());

        EmployeeImmutable emp = new EmployeeImmutable.Builder()
                .setName("John Wick")
                .setEmpID(101)
                .setSalary(500000)
                .build();

        System.out.println(emp.toString());

    }
}
