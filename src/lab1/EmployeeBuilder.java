package lab1;

/**
 * Interface for building Employee objects using the builder pattern.
 * Provides methods to set various properties of the employee
 * and a method to build the final Employee object.
 */
public interface EmployeeBuilder {

    // Sets the employee ID and returns the builder instance
    EmployeeBuilder setId(String id);

    // Sets the employee name and returns the builder instance
    EmployeeBuilder setName(String name);

    // Sets the employee department and returns the builder instance
    EmployeeBuilder setDepartment(String department);

    // Sets the employee role and returns the builder instance
    EmployeeBuilder setRole(String role);

    // Sets the employee's weekly working hours and returns the builder instance
    EmployeeBuilder setWorkingHours(int workingHours);

    // Sets the employee's salary and returns the builder instance
    EmployeeBuilder setSalary(double salary);

    // Builds and returns the final Employee object
    Employee build();
}
