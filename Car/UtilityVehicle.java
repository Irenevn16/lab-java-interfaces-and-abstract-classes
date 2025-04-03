package Car;

public class UtilityVehicle extends Car {

    private boolean hasFourWheel;

    public UtilityVehicle (String vinNumber, String make, String model, int mileage, boolean hasFourWheel) {
        super(vinNumber, make, model, mileage);
        this.hasFourWheel = hasFourWheel;
    }
    public boolean isHasFourWheel() {
        return hasFourWheel;
    }

    public void setHasFourWheel(boolean hasFourWheel) {
        this.hasFourWheel = hasFourWheel;
    }
}
