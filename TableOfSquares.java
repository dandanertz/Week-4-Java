import javax.swing.JOptionPane;

public class TableOfSquares {

    public static void main(String[] args) {
        
        // using for loop
        String output = "Table of Squares (for loop):\n";
        for (int i = 1; i <= 20; i++) {
            output += i + " squared is " + (i * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
        
        // using while loop
        output = "Table of Squares (while loop):\n";
        int j = 1;
        while (j <= 20) {
            output += j + " squared is " + (j * j) + "\n";
            j++;
        }
        JOptionPane.showMessageDialog(null, output);
        
        // using do-while loop
        output = "Table of Squares (do-while loop):\n";
        int k = 1;
        do {
            output += k + " squared is " + (k * k) + "\n";
            k++;
        } while (k <= 20);
        JOptionPane.showMessageDialog(null, output);
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ
