package Ejemplo7;

public class Claim {
    private String claimNumber;
    private String personName;
    private String subject;
    private String claimDescription;
    private String claimStatus;

    public Claim(String claimNumber, String personName, String subject, String claimDescription, String claimStatus) {
        this.claimNumber = claimNumber;
        this.personName = personName;
        this.subject = subject;
        this.claimDescription = claimDescription;
        this.claimStatus = claimStatus;
    }

    public boolean validateClaimStatus() {
        return claimStatus.equalsIgnoreCase("Open") || claimStatus.equalsIgnoreCase("Closed");
    }

    public String receptionMessage() {
        return "Claim received: " + claimNumber +
                "Name: " + personName +
                "Subject: " + subject +
                "Description: " + claimDescription +
                "Status: " + claimStatus;
    }
}
