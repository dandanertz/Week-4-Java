import javax.swing.JOptionPane;

public class VowelFinder {
    public static void main(String[] args) {
        String input;
        boolean foundVowel = false;

        while (!foundVowel) {
            input = JOptionPane.showInputDialog("Type a character: ");
            switch (input.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    foundVowel = true;
                    JOptionPane.showMessageDialog(null, "Found a vowel. Program terminating... ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Not what I was expecting. Try again.");
                    break;
            }
        }
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ
