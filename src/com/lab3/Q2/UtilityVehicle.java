package com.lab3.Q2;

public class UtilityVehicle extends Car {

        private boolean fourWheelDrive;

        public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
            super(vinNumber, make, model, mileage);
            this.fourWheelDrive = fourWheelDrive;
        }

        public boolean getFourWheelDrive() {
            return fourWheelDrive;
        }

        public void setFourWheelDrive(boolean fourWheelDrive) {
            this.fourWheelDrive = fourWheelDrive;
        }

    @Override
    public String getInfo() {
        return super.getInfo()+ "\n" +
                "has fourWheel drive: " + (getFourWheelDrive() ? "Yes" : " No" + "\n");
    }

}