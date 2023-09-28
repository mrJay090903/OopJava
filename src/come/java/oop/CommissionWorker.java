package come.java.oop;


// Define a CommissionWorker class that inherits from the Employee class
class CommissionWorker extends Employee {
    // Declare a private field specific to CommissionWorker
    private double grossSales;

    // Constructor for the CommissionWorker class
    public CommissionWorker(double grossSales) {
        // Call the constructor of the superclass (Employee) with a paycode of 3
        super(3);
        // Initialize the CommissionWorker-specific field
        this.grossSales = grossSales;
    }

    // Override the calculatePay method from the Employee class

    public void calculatePay() {
        // Calculate the commission pay based on the gross sales
        double commissionPay = 250 + 0.057 * grossSales;
        // Display the calculated commission pay with two decimal places
        System.out.println("Commission Worker's pay is $" + String.format("%.2f", commissionPay));
    }
}
