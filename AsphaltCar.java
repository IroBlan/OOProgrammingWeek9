package carrace;

public class AsphaltCar extends RallyCar {
    double downforce;

    //Constructor
    public AsphaltCar(String maker, String model, int horsepower, double downforce){
        super(maker,model,horsepower);
        this.downforce=downforce;
    }

    // performace
    public double calculatePerformance(){
        double performance= downforce * getHorsepower();
        return performance;
    }
}
