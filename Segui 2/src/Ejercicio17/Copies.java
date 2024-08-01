package Ejercicio17;

public class Copies {

    private int numCopies;
    private double priceCopy;

    public Copies(int numCopies) {
        this.numCopies = numCopies;
        this.priceCopy = calculatePriceCopy(numCopies);
    }

    private double calculatePriceCopy(int quantity) {
        if (quantity >= 0 && quantity <= 499) {
            return 120;
        } else if (quantity >= 500 && quantity <= 749) {
            return 100;
        } else if (quantity >= 750 && quantity <= 999) {
            return 80;
        } else if (quantity >= 1000) {
            return 50;
        } else {
            return 0;
        }
    }

    public double calculateTotalPrice() {
        return this.numCopies * this.priceCopy;
    }
}
