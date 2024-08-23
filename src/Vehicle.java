public class Vehicle {

    private String model;
    private int year;
    private String color;
    private double mileage; // km
    private double fuel;
    private Engine engine;

    public Vehicle(String model, int year, String color, double mileage, double fuel, double enginePower) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.fuel = fuel;
        this.engine = new Engine(enginePower);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void accelerate(double km) {
        if (km > 0) {
            this.mileage += km;

        }
    }

    public void accelerate() {
        this.mileage += 10;

    }

    public void brake(double km) {
        if (km > 0 && this.mileage - km >= 0) {
            this.mileage -= km;

        }

    }

    public static String checkFuel(double fuelRemaining) {
        if (fuelRemaining < 10) {
            return "Precisa abstecer!";
        } else {
            return "Nível de combustível suficiente!";
        }

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", fuel=" + fuel +
                ", engine=" + engine +
                '}';
    }
}
