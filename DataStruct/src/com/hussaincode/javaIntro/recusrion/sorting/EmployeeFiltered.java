package com.hussaincode.javaIntro.recusrion.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFiltered {
    public static void main(String[] args) {
        // Creating a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(new Address("Street1", "Place1", 12345), "John", 25));
        employees.add(new Employee(new Address("Street2", "Place2", 67890), "Alice", 30));
        employees.add(new Employee(new Address("Street3", "Place3", 12345), "Bob", 25));

        // Specify the pincode you want to filter by
        int targetPincode = 12345;

        // Use a lambda expression and streams to filter employees based on pincode
//        List<Employee> filteredEmployees = employees.stream()
//                .filter(employee -> employee.address.pincode == targetPincode)
//                .toList();

        // Display the filtered employee details
//        filteredEmployees.forEach(employee ->
//                System.out.println("Name: " + employee.name + ", Age: " + employee.age));

        employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.age))
                .forEach((age, group) -> {
                 System.out.println("Employees with age " + age + ":");
                 group.forEach(employee ->
                    System.out.println("  Name: " + employee.name + ", Pincode: " + employee.address.pincode));
        });
    }
}

        class Address {
            String streetName;
            String place;
            int pincode;

            public Address(String streetName, String place, int pincode) {
                this.streetName = streetName;
                this.place = place;
                this.pincode = pincode;
            }
        }

        class Employee {
            Address address;
            String name;
            int age;

            public Employee(Address address, String name, int age) {
                this.address = address;
                this.name = name;
                this.age = age;
            }
}
