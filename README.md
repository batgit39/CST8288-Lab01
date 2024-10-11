# Employee Management System (EMS)

This **Employee Management System (EMS)** is a Java-based application that demonstrates key object-oriented programming principles and design patterns such as **Builder**, **Factory**, and **Singleton**. The system allows for the creation, management, and tracking of employee information for both full-time and part-time employees.

## Key Features

### Employee Creation:
- Use the **Builder Pattern** to create full-time and part-time employees step-by-step, customizing attributes like `id`, `name`, `department`, `role`, `working hours`, and `salary`.

### Factory Design Pattern:
- The **Factory** simplifies the creation of employees based on the type (`fulltime` or `parttime`). The system returns a fully configured employee object without needing to handle each attribute manually.

### Singleton Employee Manager:
- The `EmployeeManager` class ensures that only a single instance of the employee manager exists. This **Singleton pattern** is used to manage and retrieve employee data in a centralized manner.

### Employee Tracking:
- Track employee actions such as **clocking in**, **clocking out**, and **work hours monitoring**. These actions are specific to full-time or part-time employees and are logged accordingly.

### Unit Testing:
- The application includes comprehensive unit tests that ensure correctness for each of the implemented design patterns and core functionality.

## How to Run

### Prerequisites
- **Java 8 or higher** installed.
- A Java Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse.
- **JUnit 5** for running the unit tests.

### Steps to Run the Program

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo/employee-management-system.git
   cd employee-management-system
   ```

2. **Open the Project**:
   - Open the project in your favorite Java IDE (IntelliJ IDEA, Eclipse, etc.).

3. **Build the Project**:
   - Make sure to build the project and resolve any dependencies.

4. **Run the Application**:
   - The main class for running the program is `EMS` (located in the `lab1` package).
   - Right-click on the `EMS` class and choose **Run** or execute the following command in the terminal:
     ```bash
     java lab1.EMS
     ```
   You should see the output in the console that simulates creating and managing full-time and part-time employees, displaying their attributes, and tracking work hours.

5. **Run Unit Tests**:
   - The project includes unit tests in the `src/test` directory.
   - Run all tests to ensure the functionality works as expected:
     ```bash
     java -jar junit-platform-console-standalone.jar --scan-classpath
     ```
   Alternatively, run the tests directly from your IDE.

## Example Output

Once you run the `EMS` class, you should see the following output in the console:

```java
Employee: Jay Parmar, Role: Developer
Employee: Salim Halawani, Role: Analyst
Jay Parmar (Full-Time) clocked in.
Jay Parmar (Full-Time) has worked 40 hours this week.
Salim Halawani (Part-Time) clocked in.
Salim Halawani (Part-Time) has worked 20 hours this week.
```

## Class Structure

- **Employee**: Abstract base class for all employees, with attributes like `id`, `name`, `department`, `role`, `workingHoursPerWeek`, and `salary`.
- **FullTimeEmployee** and **PartTimeEmployee**: Concrete implementations of the `Employee` class for representing full-time and part-time employees, respectively.
- **EmployeeBuilder**: Interface defining the methods to build employee objects.
- **FullTimeEmployeeBuilder** and **PartTimeEmployeeBuilder**: Concrete builder classes for constructing full-time and part-time employees.
- **EmployeeFactory**: Factory class to create employees based on the provided type.
- **EmployeeManager**: Singleton class responsible for managing the list of employees and ensuring there's only one instance.
- **EmployeeDirector**: Class to orchestrate the construction of employees using the builder pattern.

## Unit Tests

The project includes tests for the following:

- **Employee Creation**: Tests for creating both full-time and part-time employees using the factory and builder patterns.
- **Singleton Behavior**: Ensures the `EmployeeManager` class follows the singleton pattern and only creates a single instance.
- **Employee Management**: Tests for adding and retrieving employees from the `EmployeeManager`.
- **Exception Handling**: Verifies that invalid employee types result in appropriate exceptions being thrown.

## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-repo/employee-management-system.git
   ```

2. Open the project in your preferred Java IDE.

3. Run the `EMS` class to see the system in action.

4. Run the unit tests to verify functionality.

## Technologies Used

- **Java**: Core language for building the application.
- **JUnit 5**: For unit testing.

Feel free to explore and modify the code to suit your needs. Contributions are welcome!
