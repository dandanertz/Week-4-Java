import javax.swing.JOptionPane;

public class OddEvenSentinel {

    public static void main(String[] args) {
        String oddNumbers = "";
        String evenNumbers = "";
        int inputNumber;
        int oddCount = 0;
        int evenCount = 0;

        // Loop until sentinel value is entered
        do {
            inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer (or enter 0 to exit):"));
            
            if (inputNumber != 0) {
                if (inputNumber % 2 == 0) {
                    evenNumbers += inputNumber + " ";
                    evenCount++;
                } else {
                    oddNumbers += inputNumber + " ";
                    oddCount++;
                }
            }
        } while (inputNumber != 0);

        // Display the list of odd and even integers
        JOptionPane.showMessageDialog(null, "Odd numbers: " + oddNumbers + "\nEven numbers: " + evenNumbers + "\nNumber of Odd numbers: " + oddCount + "\nNumber of Even numbers: " + evenCount);
    }
}//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ

