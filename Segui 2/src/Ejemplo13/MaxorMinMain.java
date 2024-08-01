package Ejemplo13;

import javax.swing.*;

public class MaxorMinMain {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        String input3 = JOptionPane.showInputDialog("Ingrese el tercer número:");

        int numero1 = Integer.parseInt(input1);
        int numero2 = Integer.parseInt(input2);
        int numero3 = Integer.parseInt(input3);

        MaxorMin mayorNumero = new MaxorMin(numero1, numero2, numero3);
        int mayor = mayorNumero.encontrarMaxorMin();

        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
    }
    }

