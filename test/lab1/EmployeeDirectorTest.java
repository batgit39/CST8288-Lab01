package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EmployeeDirector class.
 * Tests the construction of FullTimeEmployee and PartTimeEmployee objects
 * using the builder pattern and validates the employee attributes.
 */
public class EmployeeDirectorTest {

    /**
     * Test for constructing a FullTimeEmployee using the builder pattern.
     * Verifies that the constructed employee has the correct name and working hours.
     */
    @Test
    public void testFullTimeEmployeeConstruction() {
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder()
                .setId("1")
                .setName("Jay Parmar")
                .setDepartment("Engineering")
                .setRole("Developer")
                .setWorkingHours(40)
                .setSalary(60000);

        EmployeeDirector director = new EmployeeDirector(fullTimeBuilder);
        Employee employee = director.construct();

        // Validate that the employee attributes are correctly set
        assertEquals("Jay Parmar", employee.getName(), "Full-time employee should have the correct name");
        assertEquals(40, employee.getWorkingHoursPerWeek(), "Full-time employee should have the correct working hours");
    }

    /**
     * Test for constructing a PartTimeEmployee using the builder pattern.
     * Verifies that the constructed employee has the correct name and working hours.
     */
    @Test
    public void testPartTimeEmployeeConstruction() {
        EmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder()
                .setId("2")
                .setName("Salim Halawani")
                .setDepartment("Marketing")
                .setRole("Analyst")
                .setWorkingHours(20)
                .setSalary(20000);

        EmployeeDirector director = new EmployeeDirector(partTimeBuilder);
        Employee employee = director.construct();

        // Validate that the employee attributes are correctly set
        assertEquals("Salim Halawani", employee.getName(), "Part-time employee should have the correct name");
        assertEquals(20, employee.getWorkingHoursPerWeek(), "Part-time employee should have the correct working hours");
    }
}
