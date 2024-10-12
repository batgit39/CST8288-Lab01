package lab1;

/**
 * Abstract class representing a generic Employee.
 * This class defines the basic attributes and behaviors
 * that every employee should have.
 */
public abstract class Employee {
    protected String id;                     // Employee ID
    protected String name;                   // Employee's name
    protected String department;             // Department where the employee works
    protected String role;                   // Role or position of the employee
    protected int workingHoursPerWeek;       // Weekly working hours
    protected double salary;                 // Employee's salary

    // Getter for employee ID
    public String getId() {
        return id;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }

    // Getter for employee department
    public String getDepartment() {
        return department;
    }

    // Getter for employee role
    public String getRole() {
        return role;
    }

    // Getter for working hours per week
    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Abstract method for clocking in - to be implemented by subclasses
    public abstract void clockIn();

    // Abstract method for clocking out - to be implemented by subclasses
    public abstract void clockOut();

    // Abstract method for tracking work hours - to be implemented by subclasses
    public abstract void trackWorkHours();
}
