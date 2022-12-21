import java.util.Scanner;
class Employee {
private String name;
private int id;
private double hourlyRate;
private int hoursWorked;
private double grossSalary;
// Constructor to initialize the employee details
public Employee(String name, int id, double hourlyRate, int hoursWorked)
{
this.name = name;
this.id = id;
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}
// Method to calculate the gross salary
public void calculateGrossSalary() {
grossSalary = hourlyRate * hoursWorked;
}
// Method to print the employee details
public void printDetails() {
System.out.println("Name: " + name);
System.out.println("ID: " + id);
System.out.println("Hourly rate: " + hourlyRate);
System.out.println("Hours worked: " + hoursWorked);
System.out.println("Gross salary: " + grossSalary);
}
}
public class Main1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Read the employee details
System.out.print("Enter the name of the employee: ");
String name = scanner.nextLine();
System.out.print("Enter the ID of the employee: ");
int id = scanner.nextInt();
System.out.print("Enter the hourly rate of the employee: ");
double hourlyRate = scanner.nextDouble();
System.out.print("Enter the number of hours worked by the employee: ");
int hoursWorked = scanner.nextInt();
// Create an employee object and initialize it with the details
Employee employee = new Employee(name, id, hourlyRate,
hoursWorked);
// Calculate the gross salary of the employee
employee.calculateGrossSalary();
// Print the employee details
employee.printDetails();
}
}