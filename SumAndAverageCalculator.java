import javax.swing.JOptionPane;

public class SumAndAverageCalculator {

    public static void main(String[] args) {
        // Accept starting value from user
        int startingValue = Integer.parseInt(JOptionPane.showInputDialog("Type first integer:"));
    
        // Accept loop control variable (ending value) from user and validate if it is greater than or equal to starting value
        int endingValue;
        do {
            endingValue = Integer.parseInt(JOptionPane.showInputDialog("Type second integer:"));
            if (endingValue < startingValue) {
                JOptionPane.showMessageDialog(null, "Sorry! second integer must be greater than "+ startingValue +" Please re-enter.");
            }
        } while (endingValue < startingValue);
    
        // Accept input integers from user based on starting and ending values
        int sum = 0;
        int count = 0;
        for (int i = startingValue; i <= endingValue; i++) {
            int inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer between " + startingValue + " and " + endingValue + ":"));
            sum += inputNumber;
            count++;
        }
    
        // Calculate average
        double average = (double) sum / count;
    
        // Display total summation and average to user
        JOptionPane.showMessageDialog(null, "Total Summation: " + sum + "\nAverage: " + average);
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ    

