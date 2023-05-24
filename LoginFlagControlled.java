+import javax.swing.JOptionPane;

public class LoginFlagControlled {
    public static void main(String[] args) {
        String username, password;
        boolean valid = false;
        
        while (!valid) {
            username = JOptionPane.showInputDialog("Enter username:");
            password = JOptionPane.showInputDialog("Enter password:");
            
            if (username.equals("admin") && password.equals("pwd123")) {
                JOptionPane.showMessageDialog(null, "Log-in successful");
                valid = true;
            } else {
                JOptionPane.showMessageDialog(null, "Log-in failed. Try again.");
            }
        }
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ