package carrace;
/* Create an abstract RallyCar class with basic properties (make, model, horsepower) */

public abstract class RallyCar {
    private String maker;
    private String model;
    private int horsepower;

    // Constructor
    public RallyCar(String maker, String model, int horsepower){
        this.maker=maker;
        this.model=model;
        this.horsepower=horsepower;
    }

    // getter methods
    public String getMaker(){
        return maker;
    }
    public String getModel(){
        return model;
    }
    public int getHorsepower(){
        return horsepower;
    }

    // omit setter methods, they are not needed
}
