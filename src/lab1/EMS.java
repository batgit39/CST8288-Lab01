package lab1;

import java.util.List;

/**
 * EMS (Employee Management System) class that demonstrates
 * the use of the Builder pattern, Singleton pattern, and
 * the management of employees.
 */
public class EMS {
    public static void main(String[] args) {
        // Create a FullTimeEmployee using the Builder pattern
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder()
                .setId("1")
                .setName("Jay Parmar")
                .setDepartment("Engineering")
                .setRole("Developer")
                .setWorkingHours(40)
                .setSalary(60000);

        EmployeeDirector fullTimeDirector = new EmployeeDirector(fullTimeBuilder);
        Employee fullTimeEmployee = fullTimeDirector.construct();  // Build the employee

        // Create a PartTimeEmployee using the Builder pattern
        EmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder()
                .setId("2")
                .setName("Salim Halawani")
                .setDepartment("Marketing")
                .setRole("Analyst")
                .setWorkingHours(20)
                .setSalary(20000);

        EmployeeDirector partTimeDirector = new EmployeeDirector(partTimeBuilder);
        Employee partTimeEmployee = partTimeDirector.construct();  // Build the employee

        // Manage employees using Singleton EmployeeManager
        EmployeeManager manager = EmployeeManager.getInstance();
        manager.addEmployee(fullTimeEmployee);   // Add full-time employee to the manager
        manager.addEmployee(partTimeEmployee);   // Add part-time employee to the manager

        // Display all employees
        List<Employee> employees = manager.getAllEmployees();
        for (Employee emp : employees) {
            System.out.println("Employee Id: " + emp.getId() + ", Employee: " + emp.getName() + ", Role: " + emp.getRole() + ", Salary: " + emp.getSalary());
        }

        // Simulate clocking in and tracking work hours for both employees
        fullTimeEmployee.clockIn();
        fullTimeEmployee.trackWorkHours();
        partTimeEmployee.clockIn();
        partTimeEmployee.trackWorkHours();
    }
}
