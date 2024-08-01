package Ejercicio5;

import javax.swing.*;

public class AreaMain {
    public static void main(String[] args) {
        String baseInput = JOptionPane.showInputDialog("Enter the base of the rectangle:");
        double base = Double.parseDouble(baseInput);

        String heightInput = JOptionPane.showInputDialog("Enter the height of the rectangle:");
        double height = Double.parseDouble(heightInput);

        // Create an object of the RectangleArea class
        Area rectangle = new Area((int) base, (int) height);

        // Calculate the area and display the result using JOptionPane
        double area = rectangle.calculateArea();
        if (area > 0) {
            JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
        }
}}
