package lab1;

/**
 * PartTimeEmployee class that extends the abstract Employee class.
 * Represents a part-time employee with specific attributes like working hours and salary.
 */
public class PartTimeEmployee extends Employee {

    /**
     * Constructor for creating a PartTimeEmployee instance.
     * @param id The employee ID
     * @param name The employee's name
     * @param department The department the employee belongs to
     * @param role The role or job title of the employee
     * @param workingHours The number of hours worked per week
     * @param salary The salary of the part-time employee
     */
    public PartTimeEmployee(String id, String name, String department, String role, int workingHours, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHours;
        this.salary = salary;
    }

    /**
     * Implementation of the clockIn method for part-time employees.
     */
    @Override
    public void clockIn() {
        System.out.println(name + " (Part-Time) clocked in.");
    }

    /**
     * Implementation of the clockOut method for part-time employees.
     */
    @Override
    public void clockOut() {
        System.out.println(name + " (Part-Time) clocked out.");
    }

    /**
     * Tracks and displays the work hours for the part-time employee.
     */
    @Override
    public void trackWorkHours() {
        System.out.println(name + " (Part-Time) has worked " + workingHoursPerWeek + " hours this week.");
    }
}
