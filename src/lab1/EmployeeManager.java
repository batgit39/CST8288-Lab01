package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that manages a list of Employee objects.
 * Provides functionality to add and retrieve employees.
 */
public class EmployeeManager {
    private static EmployeeManager instance;   // Singleton instance
    private List<Employee> employees;          // List to store employee objects

    // Private constructor to prevent instantiation from other classes
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Returns the single instance of EmployeeManager (Singleton).
     * If it doesn't exist, creates a new instance.
     * @return The singleton instance of EmployeeManager
     */
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    /**
     * Adds a new Employee to the list.
     * @param employee The Employee object to be added
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Returns the list of all Employee objects.
     * @return A list of Employee objects
     */
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
