package Ejemplo15;

import javax.swing.*;

public class GymMain {

        public static void main (String[]args){

        String input = JOptionPane.showInputDialog("Ingrese la cantidad de días (15, 30 o 90 días):");

        int dias = Integer.parseInt(input);

        Gym gimnasio = new Gym(dias);

        double costo = gimnasio.getCosto();

        if (costo == 0) {
            JOptionPane.showMessageDialog(null, "Número de días no válido. Por favor, ingrese 15, 30 o 90 días.");
        } else {
            JOptionPane.showMessageDialog(null, "El costo por " + dias + " días es: $" + costo);
        }
    }


    }
