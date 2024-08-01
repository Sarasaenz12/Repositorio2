package Ejercicio19;

import javax.swing.*;

public class CarMain {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter your car's model number:");
        int modelNumber = Integer.parseInt(input);

        Car car = new Car(modelNumber);

        if (car.isDefective()) {
            JOptionPane.showMessageDialog(null, "The car is defective, please take it to warranty.");
        } else {
            JOptionPane.showMessageDialog(null, "Your car is not defective.");
        }
    }
}
