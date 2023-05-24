import javax.swing.JOptionPane;

public class ComboMealOrderingSystem {
    public static void main(String[] args) {
        // Define the menu items and their prices
        String[] menuItems = {"Combo Meal 1 – (1 Rice, 2 Viands, 1 glass coke for 75.00 PHP)",
                              "Combo Meal 2 - (1 Rice, 2 Viands for 50.00 PHP)",
                              "Combo Meal 3 - (1 Rice, 1 Viand 30.00 PHP)",
                              "Combo Meal 4 – Exotic Foods (1 Rice + Piniritong Butiki 80.00 PHP)",
                              "Combo Meal 5 – Exotic Foods (1 Rice + Sinugbang Panga sa ginamos 100.00 PHP)",
                              "Combo Meal 6 – Exotic Foods (1 Rice + Sinigang na Ilaga 150.00 PHP)",
                              "Soft drinks 15.00 PHP",
                              "Rice 7.00 PHP",
                              "Tindera 10.00 PHP",
                              "Exit"};
        double[] menuPrices = {75.0, 50.0, 30.0, 80.0, 100.0, 150.0, 15.0, 7.0, 10.0, 0.0};

        // Initialize variables for the order and payment
        double orderTotal = 0.0;
        String order = "";
        double cashRendered = 0.0;
        double change = 0.0;

        // Display the menu and get the customer's order
        while (true) {
            String input = (String) JOptionPane.showInputDialog(null, "Please select an item from the menu:",
                    "Combo Meal Ordering System", JOptionPane.PLAIN_MESSAGE, null, menuItems, menuItems[0]);
            if (input == null || input.equals(menuItems[menuItems.length - 1])) {
                // Exit the program if the user cancels or chooses "Exit"
                break;
            } else {
                int index = getIndex(input, menuItems);
                double price = menuPrices[index];
                orderTotal += price;
                order += input + " - " + String.format("%.2f", price) + " PHP\n";
            }
        }

        // Get the customer's cash payment and calculate the change
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Your order total is: " + String.format("%.2f", orderTotal) + " PHP\n"
                    + "Please enter cash rendered:", "Payment", JOptionPane.PLAIN_MESSAGE);
            try {
                cashRendered = Double.parseDouble(input);
                if (cashRendered < orderTotal) {
                    JOptionPane.showMessageDialog(null, "Insufficient cash rendered.", "Payment Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    change = cashRendered - orderTotal;
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid amount.", "Payment Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Print the official receipt
        String receipt = "---------------------------------\n"
                + "Combo Meal Ordering System\n"
                + "---------------------------------\n"
                + order
                + "---------------------------------\n"
                + "Order Total: " + String.format("%.2f", orderTotal) + " PHP\n"
                + "Cash Rendered: " + String.format("%.2f", cashRendered) + " PHP\n"
                + "Change: " + String.format("%.2f", change) + " PHP\n"
                + "---------------------------------\n"
                + "Thank you for dining with us!";
                JOptionPane.showMessageDialog(null, receipt, "Official Receipt", JOptionPane.PLAIN_MESSAGE);
        }
        // Helper method to get the index of an item in the menu array
            private static int getIndex(String item, String[] array) {
            for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
            return i;
            }
        }
        return -1;
    }   
}
               
       

    

           


        
    
