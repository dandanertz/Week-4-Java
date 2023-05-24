import javax.swing.JOptionPane;

public class Sum50 {
    public static void main(String[] args) {

        int sum = 0;
        int num = 50;

        //for loop
        for (int i = 1; i <= num; ++i) {
            //body inside the for loop
            sum += i; //sum = sum + i
        }
        JOptionPane.showMessageDialog(null,"The sum of all integers from 1 to 50 is: " + sum);
    }
}
//CS A121 - DANIEL JOHN HENRICK D. SANCHEZ