package Ejercicio21;

public class SandwichOrder {
    private String size;
    private boolean bacon;
    private boolean jalapeno;
    private boolean turkey;
    private boolean cheese;
    private int basePrice;
    private int totalPrice;

    public SandwichOrder(String size, boolean bacon, boolean jalapeno, boolean turkey, boolean cheese) {
        this.size = size;
        this.bacon = bacon;
        this.jalapeno = jalapeno;
        this.turkey = turkey;
        this.cheese = cheese;
        this.basePrice = calculateBasePrice();
        this.totalPrice = calculateTotalPrice();
    }

    private int calculateBasePrice() {
        if (size.equalsIgnoreCase("small")) {
            return 6000;
        } else if (size.equalsIgnoreCase("large")) {
            return 12000;
        } else {
            return 0;
        }
    }

    private int calculateTotalPrice() {
        int total = basePrice;
        if (bacon) total += 3000;
        if (turkey) total += 3000;
        if (cheese) total += 2500;
        // Jalapeno is free, no need to add its price
        return total;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}