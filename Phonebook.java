import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Phonebook {
    public static void main(String[] args) {
        String[][] contacts = {
                {"Mart", "March 21, 2003", "Male", "18", "222-9614", "Friend"},
                {"Anna", "April 12, 1989", "Female", "16", "09393942305", "Unfriend"}
        };

        // Task 1: Display initial list of contacts
        StringBuilder sb = new StringBuilder();
        sb.append("***Friends List***\n");
        sb.append("Name\tBirthdate(mm/dd/yy)\tGender\tAge\tContact Number\tRemarks\n");
        for (String[] contact : contacts) {
            sb.append(contact[0]).append("\t").append(contact[1]).append("\t").append(contact[2]).append("\t")
                    .append(contact[3]).append("\t").append(contact[4]).append("\t").append(contact[5]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Phonebook", JOptionPane.INFORMATION_MESSAGE);

        // Task 2: Display contacts with age >= 18
        sb = new StringBuilder();
        sb.append("Contacts with age >= 18:\n");
        sb.append("Name\tBirthdate(mm/dd/yy)\tGender\tAge\tContact Number\tRemarks\n");
        for (String[] contact : contacts) {
            int age = Integer.parseInt(contact[3]);
            if (age >= 18) {
                sb.append(contact[0]).append("\t").append(contact[1]).append("\t").append(contact[2]).append("\t")
                        .append(contact[3]).append("\t").append(contact[4]).append("\t").append(contact[5]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Phonebook", JOptionPane.INFORMATION_MESSAGE);

        // Task 3: Display contacts with remark "Friend" only
        sb = new StringBuilder();
        sb.append("Contacts with remark 'Friend':\n");
        sb.append("Name\tGender\tAge\n");
        for (String[] contact : contacts) {
            if (contact[5].equalsIgnoreCase("Friend")) {
                sb.append(contact[0]).append("\t").append(contact[2]).append("\t").append(contact[3]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Phonebook", JOptionPane.INFORMATION_MESSAGE);

        // Save contacts information to a text file
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("phonebook.txt"));
            writer.write(sb.toString());
            writer.close();
            JOptionPane.showMessageDialog(null, "Contacts information saved to 'phonebook.txt'",
                    "Phonebook", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving contacts information to file: " + e.getMessage(),
                    "Phonebook", JOptionPane.ERROR_MESSAGE);
        }
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ






