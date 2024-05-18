/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;




public class EmployeeManagementSystem {
    
    private ArrayList<Employee> employees;
    private Scanner scanner;

    public EmployeeManagementSystem() {
        scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Position: ");
        String position = scanner.nextLine();

        Employee employee = new Employee(id, name, position);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to show.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }


    public void showMenu() {
        int choice;
        do {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.showMenu();
    }
}
