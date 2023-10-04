package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 80000));
        employees.add(new Employee("Eve", 45000));
        employees.add(new Employee("John", 70000));

        // Define a predicate to filter employees based on salary
        Predicate<Employee> highSalaryPredicate = employee -> employee.getSalary() > 60000;

        // Filter employees using the predicate
        List<Employee> highSalaryEmployees = filterEmployees(employees, highSalaryPredicate);

        // Print the names of employees with a high salary
        System.out.println("Employees with a salary greater than 60000:");
        highSalaryEmployees.forEach(employee -> System.out.println(employee.getName()));
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (predicate.test(employee)) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }
}


