package Ejercicio21;

import javax.swing.*;

public class SandwichOrderMain {
    public static void main(String[] args) {
        String[] sizes = {"Small", "Large"};
        String size = (String) JOptionPane.showInputDialog(null, "Select sandwich size:",
                "Sandwich Order", JOptionPane.QUESTION_MESSAGE, null, sizes, sizes[0]);

        int baconOption = JOptionPane.showConfirmDialog(null, "Add bacon? ($3000)", "Sandwich Order", JOptionPane.YES_NO_OPTION);
        int jalapenoOption = JOptionPane.showConfirmDialog(null, "Add jalapeno? (Free)", "Sandwich Order", JOptionPane.YES_NO_OPTION);
        int turkeyOption = JOptionPane.showConfirmDialog(null, "Add turkey? ($3000)", "Sandwich Order", JOptionPane.YES_NO_OPTION);
        int cheeseOption = JOptionPane.showConfirmDialog(null, "Add cheese? ($2500)", "Sandwich Order", JOptionPane.YES_NO_OPTION);

        boolean bacon = baconOption == JOptionPane.YES_OPTION;
        boolean jalapeno = jalapenoOption == JOptionPane.YES_OPTION;
        boolean turkey = turkeyOption == JOptionPane.YES_OPTION;
        boolean cheese = cheeseOption == JOptionPane.YES_OPTION;

        SandwichOrder order = new SandwichOrder(size, bacon, jalapeno, turkey, cheese);
        int totalPrice = order.getTotalPrice();

        JOptionPane.showMessageDialog(null, "The total price is: $" + totalPrice);
    }
}
