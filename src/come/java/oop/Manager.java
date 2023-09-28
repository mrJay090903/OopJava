package come.java.oop;

import java.util.Scanner;

// Define a Manager class that inherits from the Employee class
class Manager extends Employee {
    // Constructor for the Manager class
    public Manager() {
        // Call the constructor of the superclass (Employee) with a paycode of 1
        super(1);
    }

    // Override the calculatePay method from the Employee class

    public void calculatePay() {
    	
    	Scanner sc = new Scanner(System.in);
    	int input;
    	
        // Display a message indicating that a manager is selected
        System.out.println("Manager selected.");
        // You can add code here to calculate the manager's pay
        // This method overrides the calculatePay method of the Employee class
        System.out.print("Enter manager Salary: ");
        input = sc.nextInt();
        System.out.print( "Manager salary: $" + input);
        
        
        
        
    }
}
