package lab1;

/**
 * Factory class for creating different types of Employee objects.
 * The factory determines which type of employee to create based on the input type.
 */
public class EmployeeFactory {

    /**
     * Creates and returns an Employee object based on the specified type.
     * @param type The type of employee ("fulltime" or "parttime")
     * @return The created Employee object
     * @throws IllegalArgumentException if an invalid employee type is provided
     */
    public Employee createEmployee(String type) {
        switch (type.toLowerCase()) {
            case "fulltime":
                // Create and return a FullTimeEmployee object
                return new FullTimeEmployee("1", "Jay Parmar", "Engineering", "Developer", 40, 60000);
            case "parttime":
                // Create and return a PartTimeEmployee object
                return new PartTimeEmployee("2", "Salim Halawani", "Marketing", "Analyst", 20, 20000);
            default:
                // Throw an exception if an invalid employee type is provided
                throw new IllegalArgumentException("Invalid employee type");
        }
    }
}
