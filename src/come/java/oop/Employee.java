package come.java.oop;

public class Employee {
    // Declare a protected integer field named paycode
    protected int paycode;

    // Constructor for the Employee class that takes a paycode parameter
    public Employee(int paycode) {
        // Assign the paycode parameter to the paycode field
        this.paycode = paycode;
    }

    // Method named calculatePay with no parameters
    public void calculatePay() {
        // Display a message indicating that an employee is selected
        System.out.println("Employee selected.");
    }
}
