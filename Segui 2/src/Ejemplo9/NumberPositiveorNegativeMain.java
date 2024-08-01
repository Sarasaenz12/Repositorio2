package Ejemplo9;

import javax.swing.*;

public class NumberPositiveorNegativeMain {
    public static void main(String[] args) {

                String input = JOptionPane.showInputDialog("Enter a number:");

                int inputNumber = Integer.parseInt(input);

                NumberPositiveorNegative numberChecker = new NumberPositiveorNegative(inputNumber);

                JOptionPane.showMessageDialog(null, numberChecker.checkNumber());
            }

    }

