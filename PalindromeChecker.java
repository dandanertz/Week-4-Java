import javax.swing.JOptionPane;

public class PalindromeChecker {

    public static void main(String[] args) {
        
        // get input from user
        String input = JOptionPane.showInputDialog("Enter a string:");
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Input cannot be null!");
            return;
        }
        
        // convert input to lowercase and remove whitespace
        input = input.toLowerCase().replaceAll("\\s", "");
        
        // check if input is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        // display result
        String output = "\"" + input + "\" is " + (isPalindrome ? "a palindrome" : "not a palindrome");
        JOptionPane.showMessageDialog(null, output);
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ

