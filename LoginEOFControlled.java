import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoginEOFControlled {
    public static void main(String[] args) {
        String username, password;
        Scanner SC = new Scanner(System.in);
        
        while (SC.hasNext()) {
            username = JOptionPane.showInputDialog("Enter username:");
            password = JOptionPane.showInputDialog("Enter password:");
            
            if (username.equals("admin") && password.equals("pwd123")) {
                JOptionPane.showMessageDialog(null, "Log-in successful");
                break;
            }
            
            JOptionPane.showMessageDialog(null, "Log-in failed. Try again.");
        }
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ