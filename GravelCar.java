package carrace;

public class GravelCar extends RallyCar{
    double suspensionTravel;
    //Constructor
    public GravelCar(String maker, String model, int horsepower, int suspensionTravel){
        super(maker,model,horsepower);
        this.suspensionTravel= suspensionTravel;
    }

    // performace
    public double calculatePerformance(){
        double performance= suspensionTravel * getHorsepower();
        return performance;
    }
}
