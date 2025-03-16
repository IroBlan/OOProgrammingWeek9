package carrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

interface RaceResult {
    void recordResult(Driver driver, int position, int points);
    int getDriverPoints(Driver driver);
    List<Driver> getResults();
}

public class RallyRaceResult implements RaceResult{
    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

    // constructor
    public RallyRaceResult(String raceName, String location){
        this.raceName=raceName;
        this.location=location;
    }

    @Override
    public void recordResult(Driver driver, int position, int points){
        //what to do with the position? Is the map sorted by positions? or by points? arent the integers in the map the points? Isnt the position dertermined by the points?
    }

    @Override
    public int getDriverPoints(Driver driver) {
        return results.get(driver);
    }

    @Override
    public List<Driver> getResults(){
        return new ArrayList<Driver>(results.keySet());
    }
}
