package Ejemplo15;

public class Gym {
        private int dias;
        private double costo;


        public Gym(int dias) {
            this.dias = dias;
            if (dias == 15) {
                this.costo = 18000;
            } else if (dias == 30) {
                this.costo = 35000;
            } else if (dias == 90) {
                this.costo = 86000;
            } else {
                this.costo = 0;
            }
        }

        public double getCosto() {
            return this.costo;
        }
    }


