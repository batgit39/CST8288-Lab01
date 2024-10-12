package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EmployeeManager class.
 * Verifies the singleton behavior, adding employees, and retrieving employees.
 */
public class EmployeeManagerTest {

    /**
     * Test to verify that EmployeeManager follows the singleton pattern.
     * Ensures that multiple calls to getInstance return the same instance.
     */
    @Test
    public void testSingletonBehavior() {
        EmployeeManager manager1 = EmployeeManager.getInstance();
        EmployeeManager manager2 = EmployeeManager.getInstance();
        assertSame(manager1, manager2, "EmployeeManager should be a singleton");
    }

    /**
     * Test to verify that an employee can be added to EmployeeManager.
     * Ensures that the employee list size increases after adding a new employee.
     */
    @Test
    public void testAddEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee fullTimeEmployee = new FullTimeEmployee("1", "Jay Parmar", "Engineering", "Developer", 40, 60000);
        manager.addEmployee(fullTimeEmployee);

        // Verify that the employee is added to the manager
        assertEquals(2, manager.getAllEmployees().size(), "Employee should be added to the manager");
    }

    /**
     * Test to verify that employees can be retrieved from EmployeeManager.
     * Ensures that the correct employee is retrieved by checking the employee's name.
     */
    @Test
    public void testRetrieveEmployees() {
        EmployeeManager manager = EmployeeManager.getInstance();

        // Add a full-time employee to the manager
        Employee employeeToAdd = new FullTimeEmployee("1", "Jay Parmar", "Engineering", "Developer", 40, 60000);
        manager.addEmployee(employeeToAdd);

        // Retrieve the first employee from the list
        Employee employee = manager.getAllEmployees().get(0);

        // Check if the employee's name is correct
        assertEquals("Jay Parmar", employee.getName(), "Employee should be retrievable by name");
    }
}
