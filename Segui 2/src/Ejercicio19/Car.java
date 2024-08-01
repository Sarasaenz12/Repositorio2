package Ejercicio19;

public class Car {
        private int modelNumber;
        private static int[] defectiveModels = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};

    public Car(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isDefective() {
            for (int defectiveModel : defectiveModels) {
                if (defectiveModel == modelNumber) {
                    return true;
                }
            }
            return false;
        }
    }


