package Ejercicio5;

public class Area {
    int base;
    int height;

    public Area(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public boolean validateData() {
        return base > 0 && height > 0;
    }

    public double calculateArea() {
        if (validateData()) {
            return base * height;
        } else {
            System.out.println("Invalid data. Base and height must be greater than zero.");
            return 0;
        }

}}