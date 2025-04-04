package Car;

public class Car {

    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car (String vinNumber, String make, String model, int mileage) {
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getInfo() {
        return "La información de este coche es la siguiente:\n Vin Number: " + vinNumber + "\n Make: " + make + "\n Model: " + model + "Kilometraje: " + mileage;
    }



}
