package lab1;

/**
 * Builder class for creating PartTimeEmployee objects.
 * Implements the EmployeeBuilder interface and provides
 * methods to set the employee's attributes step by step.
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    private String id;
    private String name;
    private String department;
    private String role;
    private int workingHours;
    private double salary;

    // Sets the employee ID and returns the builder instance
    public PartTimeEmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    // Sets the employee name and returns the builder instance
    public PartTimeEmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    // Sets the employee department and returns the builder instance
    public PartTimeEmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    // Sets the employee role and returns the builder instance
    public PartTimeEmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    // Sets the employee working hours and returns the builder instance
    public PartTimeEmployeeBuilder setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
        return this;
    }

    // Sets the employee salary and returns the builder instance
    public PartTimeEmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Builds and returns a new PartTimeEmployee object using the set attributes.
     * @return A PartTimeEmployee object
     */
    public Employee build() {
        return new PartTimeEmployee(id, name, department, role, workingHours, salary);
    }
}
