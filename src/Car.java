public class Car {
    private double gallons;
    private double milesPerGallon;


    public Car(double gallons, double miles) {
        this.gallons = gallons;
        milesPerGallon = miles;
    }


    public boolean canMakeTrip(double distance) {
        double need = distance / milesPerGallon;
        if (need <= gallons) {
            gallons -= need;
            return true;
        }
        return false;
    }

/* for testing only */

    public double getCurrentFuel() {
        return gallons;
    }

    public double getMpg() {
        return milesPerGallon;
    }
}