package lab1;

/**
 * Builder class for creating FullTimeEmployee objects.
 * Implements the EmployeeBuilder interface and provides
 * methods to set the employee's attributes step by step.
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private String id;
    private String name;
    private String department;
    private String role;
    private int workingHours;
    private double salary;

    // Sets the employee ID and returns the builder instance
    public FullTimeEmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    // Sets the employee name and returns the builder instance
    public FullTimeEmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    // Sets the employee department and returns the builder instance
    public FullTimeEmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    // Sets the employee role and returns the builder instance
    public FullTimeEmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    // Sets the employee working hours and returns the builder instance
    public FullTimeEmployeeBuilder setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
        return this;
    }

    // Sets the employee salary and returns the builder instance
    public FullTimeEmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Builds and returns a new FullTimeEmployee object using the set attributes.
     * @return A FullTimeEmployee object
     */
    public Employee build() {
        return new FullTimeEmployee(id, name, department, role, workingHours, salary);
    }
}
