import javax.swing.JOptionPane;

public class CharacterCount {

    public static void main(String[] args) {
        
        // get input from user
        String input = JOptionPane.showInputDialog("Enter a string:");
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Input cannot be null!");
            return;
        }
        
        // convert input to lowercase
        input = input.toLowerCase();
        
        // count special characters, consonants, vowels, spaces, digits
        int specialCount = 0;
        int consonantCount = 0;
        int vowelCount = 0;
        int spaceCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                spaceCount++;
            } else if (c >= '0' && c <= '9') {
                int digit = c - '0';
                if (digit == 0) {
                    zeroCount++;
                } else if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else {
                specialCount++;
            }
        }
        
        // display results
        String output = "Special characters (excluding spaces): " + specialCount + "\n"
                      + "Consonants: " + consonantCount + "\n"
                      + "Vowels: " + vowelCount + "\n"
                      + "Spaces: " + spaceCount + "\n"
                      + "Even digits: " + evenCount + "\n"
                      + "Odd digits: " + oddCount + "\n"
                      + "Zeroes: " + zeroCount;
        JOptionPane.showMessageDialog(null, output);
    }
}
// CS A121 - DANIEL JOHN HENRICK D. SANCHEZ