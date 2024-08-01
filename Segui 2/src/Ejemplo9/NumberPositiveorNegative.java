package Ejemplo9;

public class NumberPositiveorNegative {
        private int number;

        public NumberPositiveorNegative(int number) {
            this.number = number;
        }

        public String checkNumber() {
            if (number > 0) {
                return "The number " + number + " is positive.";
            } else if (number < 0) {
                return "The number " + number + " is negative.";
            } else {
                return "The number is zero.";
            }
        }
    }

