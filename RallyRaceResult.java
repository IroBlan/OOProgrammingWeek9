package carrace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface RaceResult {
    void recordResult(Driver driver, int points);
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
        this.results= new HashMap<Driver,Integer>();
    }

    @Override
    public void recordResult(Driver driver, int points){
        driver.addPoints(points);
        results.put(driver, points);
    }

    @Override
    public int getDriverPoints(Driver driver) {
        return results.get(driver);
    }

    @Override
    public List<Driver> getResults(){
        ArrayList<Driver> drivers=new ArrayList<Driver>(results.keySet());
        for (int i =0; i < drivers.size() -1; i++){
            for (int j= 0; j < drivers.size() -1; j++){
                if (results.get(drivers.get(j)) < results.get(drivers.get(j + 1))) {//we cannot use get Points here as they might have been updated
                    Driver temporary= drivers.get(j);
                    drivers.set(j, drivers.get(j+1));
                    drivers.set(j + 1, temporary);
                }
            }
        }
        return drivers;
    }
}
