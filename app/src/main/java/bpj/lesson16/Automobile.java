package bpj.lesson16;

public class Automobile {
    private double mpg;// mileage
    private double gallons;//gas in tank

    public Automobile(double mileage){
        mpg = mileage;
        gallons = 0;
    }

    public void fillUp(double gas) {
        gallons += gas;
    }

    public void takeTrip(double milesDriven){
        double gasConsumed = milesDriven / mpg ;
        gallons -= gasConsumed;
    }

    public double reportFuel(){
        return gallons;
    }
}
