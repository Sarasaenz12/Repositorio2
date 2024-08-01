package Ejercicio11;

import javax.swing.*;

public class NumberParorOddMain {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");

        int number = Integer.parseInt(input);

        NumberParorOdd numberChecker = new NumberParorOdd(number);

        JOptionPane.showMessageDialog(null, numberChecker.parOrOdd());
    }

    }

