import javax.swing.JOptionPane;

public class LoginCounterControlled {
    public static void main(String[] args) {
        String username, password;
        int attempts = 3;
        
        for (int i = 1; i <= attempts; i++) {
            username = JOptionPane.showInputDialog("Enter username:");
            password = JOptionPane.showInputDialog("Enter password:");
            
            if (username.equals("admin") && password.equals("pwd123")) {
                JOptionPane.showMessageDialog(null, "Log-in successful");
                break;
            }
            
            if (i == attempts) {
                JOptionPane.showMessageDialog(null, "Log-in failed");
            } else {
                JOptionPane.showMessageDialog(null, "Log-in failed. " + (attempts - i) + " attempts remaining.");
            }
        }
    }
}
// CS A121 - DANIEL JOHN HENRICK D. SANCHEZ

