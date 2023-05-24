import javax.swing.JOptionPane;

public class EvenNum {

    public static void main(String[] args) {
        
        // using for loop
        String output = "Even numbers from 1 to 50 (for loop):\n";
        for (int i = 2; i <= 50; i += 2) {
            output += i + " ";
        }
        JOptionPane.showMessageDialog(null, output);
        
        // using while loop
        output = "Even numbers from 1 to 50 (while loop):\n";
        int j = 2;
        while (j <= 50) {
            output += j + " ";
            j += 2;
        }
        JOptionPane.showMessageDialog(null, output);
        
        // using do-while loop
        output = "Even numbers from 1 to 50 (do-while loop):\n";
        int k = 2;
        do {
            output += k + " ";
            k += 2;
        } while (k <= 50);
        JOptionPane.showMessageDialog(null, output);
    }
}
// CS A121 - DANIEL JOHN HENRICK D. SANCHEZ