import javax.swing.JOptionPane;

public class SumOfNSquares {

    public static void main(String[] args) {
        
        // get input from user
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer:"));
        
        // compute sum of first n squares
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        
        JOptionPane.showMessageDialog(null, "The sum of the squares of the first " + n + " positive integers is: " + sum);
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ
