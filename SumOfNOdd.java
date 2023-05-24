import javax.swing.JOptionPane;

public class SumOfNOdd {

    public static void main(String[] args) {
        
        // get input from user
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer:"));
        
        // compute sum of first n odd integers
        int sum = 0;
        int odd = 1;
        for (int i = 1; i <= n; i++) {
            sum += odd;
            odd += 2;
        }
        
        JOptionPane.showMessageDialog(null, "The sum of the first " + n + " positive odd integers is: " + sum);
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ
