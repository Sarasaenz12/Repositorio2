package Ejemplo7;

import javax.swing.*;

public class ClaimMain {
    public static void main(String[] args) {
        String claimNumber = JOptionPane.showInputDialog("Enter the claim number:");
        String personName = JOptionPane.showInputDialog("Enter your name:");
        String subject = JOptionPane.showInputDialog("Enter the subject of the claim:");
        String claimDescription = JOptionPane.showInputDialog("Enter the claim description:");
        String claimStatus = JOptionPane.showInputDialog("Enter the claim status (Open/Closed):");

        Claim claim = new Claim(claimNumber, personName, subject, claimDescription, claimStatus);

        if (claim.validateClaimStatus()) {
            JOptionPane.showMessageDialog(null, claim.receptionMessage());
        } else {
            JOptionPane.showMessageDialog(null, "Invalid claim status. The status must be either 'Open' or 'Closed'.");
        }

    }
}
