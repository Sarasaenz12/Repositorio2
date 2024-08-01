package Ejemplo3;

 import javax.swing.JOptionPane;
public class BookMain{

        public static void main(String[] args) {

            String loanCode = JOptionPane.showInputDialog("Enter the loan code:");
            String loanDate = JOptionPane.showInputDialog("Enter the loan date (YYYY-MM-DD):");
            String bookName = JOptionPane.showInputDialog("Enter the name of the book:");
            String userCode = JOptionPane.showInputDialog("Enter the user code:");
            String loanDaysInput = JOptionPane.showInputDialog("Enter the number of loan days:");
            int loanDays = Integer.parseInt(loanDaysInput);
            String loanStatus = JOptionPane.showInputDialog("Enter the loan status (Active/Returned):");


            Book loan = new Book(loanCode, loanDate, bookName, userCode, loanDays, loanStatus);


            JOptionPane.showMessageDialog(null, "Loan Status: " + loan.checkLoanStatus());
            JOptionPane.showMessageDialog(null, "Loan Details:\n" + loan.getLoanDetails());
        }
    }

