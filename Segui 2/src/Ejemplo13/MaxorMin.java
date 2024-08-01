package Ejemplo13;

public class MaxorMin {
private int numx;
private int numy;
private int numz;

    public MaxorMin(int numx, int numy, int numz) {
        this.numx = numx;
        this.numy = numy;
        this.numz = numz;
    }
    public int encontrarMaxorMin() {
        if (numx >= numy && numx >= numz) {
            return numx;
        } else if (numy >= numx && numy>= numz) {
            return numy;
        } else {
            return numz;
        }
}}
