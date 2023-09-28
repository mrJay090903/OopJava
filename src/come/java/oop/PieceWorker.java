package come.java.oop;


// Define a PieceWorker class that inherits from the Employee class
class PieceWorker extends Employee {
    // Declare private fields specific to PieceWorker
    private int piecesProduced;
    private double wagePerPiece;

    // Constructor for the PieceWorker class
    public PieceWorker(int piecesProduced, double wagePerPiece) {
        // Call the constructor of the superclass (Employee) with a paycode of 4
        super(4);
        // Initialize the PieceWorker-specific fields
        this.piecesProduced = piecesProduced;
        this.wagePerPiece = wagePerPiece;
    }

    // Override the calculatePay method from the Employee class
    
    public void calculatePay() {
        // Calculate the pay for the PieceWorker based on the pieces produced and wage per piece
        double pieceWorkerPay = piecesProduced * wagePerPiece;
        // Display the calculated pay with two decimal places
        System.out.println("Piece Worker's pay is $" + String.format("%.2f", pieceWorkerPay));
    }
}
