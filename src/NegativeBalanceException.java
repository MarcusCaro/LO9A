import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 

public class NegativeBalanceException extends Exception {

    // Instance variable storing how much the withdrawal exceeded the balance
    private double diff; 

    public NegativeBalanceException() {
        super("Error: negative balance");
    }

    public NegativeBalanceException(double AmtExtra) {
        super("Amount exceeds balance by " + AmtExtra);
        this.diff = AmtExtra; // Store incoming extra amount .    

        try { // Handle potential file writing errors
            FileWriter filewriter = new FileWriter("logfile.txt", true);
            PrintWriter logPrint = new PrintWriter(filewriter);
            
            logPrint.println("Amount exceeds balance by " + AmtExtra);
            logPrint.close(); // Save and close the File Stream . 
        }
        catch (IOException error) {
            System.out.println("Could not write to file: " + error.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Balance of " + this.diff + " not allowed";
    }    
} // NEW NEW NEW NEW 
