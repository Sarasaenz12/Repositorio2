package Ejemplo1;

import javax.swing.*;

public class UserMain {
        public static void main(String[] args) {
            String enteredUser = JOptionPane.showInputDialog("Enter Username:");
            String enteredPassword = JOptionPane.showInputDialog("Enter Password:");

            User u1 = new User(enteredUser, enteredPassword);
            u1.validateStatus();
            boolean accessAllowed = u1.allowAccess();

            if (accessAllowed) {
                JOptionPane.showMessageDialog(null, "Access granted");
            } else {
                JOptionPane.showMessageDialog(null, "Access denied");
            }

            JOptionPane.showMessageDialog(null, u1.toString());
        }
    }

