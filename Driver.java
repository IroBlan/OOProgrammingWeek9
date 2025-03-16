package carrace;
/*
     * Create a Driver class with properties for name, country, and total points
    • Implement appropriate getters and setters
    • Include a method to add points to a driver
     */

public class Driver {
    private String name;
    private String country;
    private int points; //total points
    private RallyCar car;

    //Constructor
    public Driver (String name, String country, RallyCar car){
        this.name=name;
        this.country=country;
        this.car= car;
    }

    //adding points
    public void addPoints(int additionalPoints){
        this.points=points+additionalPoints;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public int getPoints(){
        return points;
    }
    public RallyCar getCar(){
        return car;
    }

    // setters
    public void setName(String newName){
        this.name=newName;
    }
    public void setCountry(String newCountry){
        this.country=newCountry;
    }
    public void setPoints(int newPoints){
        this.points=newPoints;
    }
    public void setcar(RallyCar newCar){
        this.car=newCar;
    }
}
