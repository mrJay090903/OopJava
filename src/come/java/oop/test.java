package come.java.oop;

import java.util.Scanner;

public class test {
	
    public static void main(String[] args) {
    	
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables to keep track of the count of different types of employees
        int managers = 0, 
        	hourlyWorkers = 0, 
        	commissionWorkers = 0, 
        	pieceWorkers = 0;
        
        int paycode;
       

        // Start an infinite loop to continuously prompt the user for input
        while (true) {
            // Prompt the user to enter a paycode
            System.out.print("\nEnter paycode (-1 to end): ");
             paycode = scanner.nextInt();

            // Check if the user wants to exit the loop (paycode -1)
            if (paycode == -1) {
            	
            	
                // Display the total number of each type of employee paid
                // Print the total number of employees in each category
                System.out.println("\nTotal number of managers paid: " + managers);
                // Print the count of managers

                System.out.println("Total number of hourly workers paid: " + hourlyWorkers);
                // Print the count of hourly workers

                System.out.println("Total number of commission workers paid: " + commissionWorkers);
                // Print the count of commission workers

                System.out.println("Total number of piece workers paid: " + pieceWorkers);
                // Print the count of piece workers
            	
         System.exit(0);
            }

            // Declare a variable to hold the selected employee
            Employee employee;

            // Use a switch statement to handle different paycodes
            switch (paycode) {
                case 1:
                    // Create a Manager object when paycode is 1
                    employee = new Manager();
                    break;
                case 2:
                	
                	  double hourlySalary;
                	  double hoursWorked;
                	
                    // Notify the selection of Hourly Worker
                    System.out.println("Hourly worker selected.");
                    // Prompt for hourly salary
                    System.out.print("Enter hourly salary: ");
                     hourlySalary = scanner.nextDouble();
                    // Prompt for total hours worked
                    System.out.print("Enter total hours worked: ");
                     hoursWorked = scanner.nextDouble();
                    // Create an HourlyWorker object with provided data
                    employee = new HourlyWorker(hourlySalary, hoursWorked);
                    break;
                    
                case 3:
                	
                	double grossSales;
                	
                    // Notify the selection of Commission Worker
                    System.out.println("Commission worker selected.");
                    // Prompt for gross weekly sales
                    System.out.print("Enter gross weekly sales: ");
                     grossSales = scanner.nextDouble();
                    // Create a CommissionWorker object with provided data
                    employee = new CommissionWorker(grossSales);
                    break;
                    
                case 4:
                	
                	int piecesProduced;
                	double wagePerPiece;
                	
                    // Notify the selection of Piece Worker
                    System.out.println("Piece worker selected.");
                    // Prompt for the number of pieces produced
                    System.out.print("Enter number of pieces: ");
                     piecesProduced = scanner.nextInt();
                    // Prompt for the wage per piece
                    System.out.print("Enter wage per piece: ");
                     wagePerPiece = scanner.nextDouble();
                    // Create a PieceWorker object with provided data
                    employee = new PieceWorker(piecesProduced, wagePerPiece);
                    break;
                default:
                    // Display an error message for an invalid paycode
                    System.out.println("Invalid paycode. Please try again.");
                    continue; // Skip the rest of the loop and start from the beginning
            }

            // Calculate and display the employee's pay based on their type
            employee.calculatePay();

         // Update the count of employees of each type based on their paycode

            if (paycode == 1) {
                // If paycode is 1, increment the count of managers
                managers++;
            } else if (paycode == 2) {
                // If paycode is 2, increment the count of hourly workers
                hourlyWorkers++;
            } else if (paycode == 3) {
                // If paycode is 3, increment the count of commission workers
                commissionWorkers++;
            } else if (paycode == 4) {
                // If paycode is 4, increment the count of piece workers
                pieceWorkers++;
            }


    }
        
    
//hello
    
}
}
