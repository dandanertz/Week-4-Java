import javax.swing.JOptionPane;

public class HappyMealOrderingSystem {
    public static void main(String[] args) {
    // Constants for menu item prices
    final double COMBO_MEAL_1_PRICE = 120.00;
    final double COMBO_MEAL_2_PRICE = 150.00;
    final double COMBO_MEAL_3_PRICE = 100.00;
    final double COMBO_MEAL_4_PRICE = 90.00;
    final double COMBO_MEAL_5_PRICE = 110.00;
    final double COMBO_MEAL_6_PRICE = 150.00;
    final double SOFT_DRINK_PRICE = 15.00;
    final double RICE_PRICE = 7.00;
    final double TINDERA_PRICE = 10.00;

        // Variables for order details, total, cash rendered, and change
        String order = "";
        double orderTotal = 0.0;
        double cashRendered = 0.0;
        double change = 0.0;

        while (true) {
            // Display menu and get user's choice
            String choiceInput = JOptionPane.showInputDialog(
                    "Combo Meal Ordering System\n\n" +
                    "1. Combo Meal 1 - 1 Rice + Adobo: 120.00 PHP\n" +
                    "2. Combo Meal 2 - 1 Rice + Fried Chicken: 150.00 PHP\n" +
                    "3. Combo Meal 3 - 1 Rice + Pancit: 100.00 PHP\n" +
                    "4. Combo Meal 4 - 1 Rice + Kare-kare: 90.00 PHP\n" +
                    "5. Combo Meal 5 - 1 Rice + Lechon Kawali: 110.00 PHP\n" +
                    "6. Combo Meal 6 - 1 Rice + Sinigang na Ilaga: 150.00 PHP\n" +
                    "7. Soft drinks: 15.00 PHP\n" +
                    "8. Rice: 7.00 PHP\n" +
                    "9. Tindera: 10.00 PHP\n" +
                    "0. Exit\n\n" +
                    "Enter your choice (0-9):");
            int choice = Integer.parseInt(choiceInput);

            // Process user's choice
            switch (choice) {
                case 1:
                    order += "Combo Meal 1 - 1 Rice + Adobo: 120.00 PHP\n";
                    orderTotal += COMBO_MEAL_1_PRICE;
                    break;
                case 2:
                    order += "Combo Meal 2 - 1 Rice + Fried Chicken: 150.00 PHP\n";
                    orderTotal += COMBO_MEAL_2_PRICE;
                    break;
                case 3:
                    order += "Combo Meal 3 - 1 Rice + Pancit: 100.00 PHP\n";
                    orderTotal += COMBO_MEAL_3_PRICE;
                    break;
                case 4:
                    order += "Combo Meal 4 - 1 Rice + Kare-kare: 90.00 PHP\n";
                    orderTotal += COMBO_MEAL_4_PRICE;
                    break;
                case 5:
                    order += "Combo Meal 5 - 1 Rice + Lechon Kawali: 110.00 PHP\n";
                    orderTotal += COMBO_MEAL_5_PRICE;
                    break;
                case 6:
                    order += "Combo Meal 6 - 1 Rice + Sinigang na Ilaga: 150.00 PHP\n";
                    orderTotal += COMBO_MEAL_6_PRICE;
                    break;
                case 7:
                    order += "Soft drinks: 15.00 PHP\n";
                    orderTotal += SOFT_DRINK_PRICE;
                    break;
                case 8:
                    order += "Rice: 7.00 PHP\n";
                    orderTotal += RICE_PRICE;
                    break;
                case 9:
                    order += "Tindera: 10.00 PHP\n";
                    orderTotal += TINDERA_PRICE;
                    break;
                case 0:
                    // Exit loop when 0 is entered
                    break;
                default:
                    // Display error message for invalid input
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number from 0 to 9.");
                    continue; // Continue to next iteration of loop
            }

            // Ask user if they want to add more items or proceed to payment
            String addMoreInput = JOptionPane.showInputDialog(
                    "Add more items? (Y/N):");
            String addMore = addMoreInput.toUpperCase();
            if (addMore.equals("N")) {
                break; // Exit loop if no more items to add
            }
        }

        // Get cash rendered from user
        String cashRenderedInput = JOptionPane.showInputDialog("Total: " + orderTotal + " PHP\n" +
                "Cash Rendered: ");
        cashRendered = Double.parseDouble(cashRenderedInput);

        // Calculate change
        change = cashRendered - orderTotal;

        // Print receipt
        String receipt = "------------------------------------\n"+
                "Receipt:\n\n" + 
                "------------------------------------\n"+
                "Happy Meal Ordering System\n" + 
                "------------------------------------\n"+
                "Order Details:\n" +
                order + 
                "------------------------------------\n"+
                "Total: " + orderTotal + " PHP\n" +
                "Cash Rendered: " + cashRendered + " PHP\n" +
                "Change: " + change + " PHP\n" + 
                "------------------------------------\n"+ 
                "Thank you for dining with us!";
        JOptionPane.showMessageDialog(null, receipt);
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ



               






        
                   
