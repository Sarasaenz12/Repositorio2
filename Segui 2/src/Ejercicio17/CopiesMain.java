package Ejercicio17;

import javax.swing.*;

public class CopiesMain {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the number of copies:");
        int numberOfCopies = Integer.parseInt(input);

        Copies copies = new Copies(numberOfCopies);
        double totalPrice = copies.calculateTotalPrice();

        JOptionPane.showMessageDialog(null, "The total price is: $" + totalPrice);
    }
    }

