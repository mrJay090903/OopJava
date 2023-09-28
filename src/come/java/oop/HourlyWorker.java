package come.java.oop;


// Define a HourlyWorker class that inherits from the Employee class
class HourlyWorker extends Employee {
    // Declare private fields specific to HourlyWorker
    private double hourlySalary;
    private double hoursWorked;

    // Constructor for the HourlyWorker class
    public HourlyWorker(double hourlySalary, double hoursWorked) {
        // Call the constructor of the superclass (Employee) with a paycode of 2
        super(2);
        // Initialize the HourlyWorker-specific fields
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    // Override the calculatePay method from the Employee class
    
    public void calculatePay() {
        // Declare a variable to hold the calculated total pay
        double totalPay;

        // Check if the number of hours worked is within regular hours (40 hours or less)
        if (hoursWorked <= 40) {
            // Calculate total pay for regular hours
            totalPay = hourlySalary * hoursWorked;
        } else {
            // Calculate total pay for regular hours plus overtime
            totalPay = hourlySalary * 40 + 1.5 * hourlySalary * (hoursWorked - 40);
        }

        // Display the calculated pay with two decimal places
        System.out.println("Worker's pay is $" + String.format("%.2f", totalPay));
    }
}
