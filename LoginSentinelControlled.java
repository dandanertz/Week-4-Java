import javax.swing.JOptionPane;

public class LoginSentinelControlled {
    public static void main(String[] args) {
        String username, password;
        
        do {
            username = JOptionPane.showInputDialog("Enter username:");
            password = JOptionPane.showInputDialog("Enter password:");
            
            if (username.equals("admin") && password.equals("pwd123")) {
                JOptionPane.showMessageDialog(null, "Log-in successful");
                break;
            }
            
            JOptionPane.showMessageDialog(null, "Log-in failed. Try again.");
        } while (true);
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ

