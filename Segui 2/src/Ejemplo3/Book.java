package Ejemplo3;

public class Book {
    private String loanCode;
    private String loanDate;
    private String bookName;
    private String userCode;
    private int loanDays;
    private String loanStatus;

    public Book(String loanCode, String loanDate, String bookName, String userCode, int loanDays, String loanStatus) {
        this.loanCode = loanCode;
        this.loanDate = loanDate;
        this.bookName = bookName;
        this.userCode = userCode;
        this.loanDays = loanDays;
        this.loanStatus = loanStatus;
    }

    public String checkLoanStatus() {
        return loanStatus;
    }

    public String getLoanDetails() {
        return "Loan Code: " + loanCode + "\n" +
                "Loan Date: " + loanDate + "\n" +
                "Book Name: " + bookName + "\n" +
                "User Code: " + userCode + "\n" +
                "Loan Days: " + loanDays + "\n" +
                "Loan Status: " + loanStatus;
    }
}
