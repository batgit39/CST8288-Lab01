package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EmployeeFactory class.
 * Tests the creation of full-time and part-time employees, and ensures
 * that invalid employee types throw the correct exception.
 */
public class EmployeeFactoryTest {

    /**
     * Test for creating a full-time employee using the factory.
     * Verifies that the factory creates a FullTimeEmployee instance and
     * that the employee has the correct attributes.
     */
    @Test
    public void testCreateFullTimeEmployee() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.createEmployee("fulltime");

        // Check that the employee is a FullTimeEmployee
        assertTrue(employee instanceof FullTimeEmployee, "Factory should create a full-time employee");

        // Validate the employee's name
        assertEquals("Jay Parmar", employee.getName(), "Employee name should be Jay Parmar");
    }

    /**
     * Test for creating a part-time employee using the factory.
     * Verifies that the factory creates a PartTimeEmployee instance and
     * that the employee has the correct attributes.
     */
    @Test
    public void testCreatePartTimeEmployee() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.createEmployee("parttime");

        // Check that the employee is a PartTimeEmployee
        assertTrue(employee instanceof PartTimeEmployee, "Factory should create a part-time employee");

        // Validate the employee's name
        assertEquals("Salim Halawani", employee.getName(), "Employee name should be Salim Halawani");
    }

    /**
     * Test for handling invalid employee types.
     * Ensures that the factory throws an IllegalArgumentException
     * when an invalid employee type is provided.
     */
    @Test
    public void testInvalidEmployeeType() {
        EmployeeFactory factory = new EmployeeFactory();

        // Ensure an exception is thrown for an invalid employee type
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createEmployee("invalid");
        }, "Factory should throw an exception for an invalid employee type");
    }
}
