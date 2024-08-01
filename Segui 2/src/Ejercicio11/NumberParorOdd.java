package Ejercicio11;

import javax.swing.*;

public class NumberParorOdd {
    private int nummber;

    public NumberParorOdd(int nummber) {
        this.nummber = nummber;
    }
    public Object parOrOdd() {
        if (nummber %2 == 0) {
           JOptionPane.showInternalMessageDialog(null,"The number " + nummber + " is even");
        } else if (nummber %2 != 0) {
            JOptionPane.showMessageDialog(null, "The number " + nummber + " is odd");
        }
        return null;
    }}
