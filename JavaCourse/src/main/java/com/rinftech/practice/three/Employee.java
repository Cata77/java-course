package com.rinftech.practice.three;

public class Employee extends Person{
    private int employeeId;
    private String jobTitle;
    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " " + jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId + " " +
                "firstName=" + super.getFirstName() + " " +
                "lastName=" + getLastName() + "}";
    }
}
