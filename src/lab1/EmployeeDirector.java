package lab1;

/**
 * Director class that controls the process of building an Employee object.
 * Uses the EmployeeBuilder interface to construct an Employee.
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;  // The builder used to construct the Employee

    /**
     * Constructor that sets the builder to be used.
     * @param builder The EmployeeBuilder instance
     */
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructs and returns the Employee object by using the builder.
     * @return The constructed Employee object
     */
    public Employee construct() {
        return builder.build();
    }
}
