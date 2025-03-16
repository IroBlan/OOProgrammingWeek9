package carrace;

import java.util.ArrayList;
import java.util.List;

/*should maintain lists of drivers and race results
• Include static methods for:
o Getting championship standings
o Finding the leading driver
o Calculating total championship points */

public class ChampionshipManager {
    private static ChampionshipManager instance;
    private ArrayList<Driver> drivers;//List of drivers
    private ArrayList<RallyRaceResult> races;//list of race results
    private static int totalDrivers;
    private static int totalRaces;

    //Constructor is private, form the outside ony getInstance is called
    private ChampionshipManager(){
        drivers = new ArrayList<>();
        races = new ArrayList<>();
    }
    public static ChampionshipManager getInstance(){
        if (instance==null){//creates an instance in case there is none yet
            instance = new ChampionshipManager();
        }
        return instance;//always returns the same instance
    }

    // add a driver
    public void registerDriver(Driver driver){
        drivers.add(driver);
    }

    // add a raceresult
    public void addRaceResult(RallyRaceResult raceresult){
        races.add(raceresult);
    }

    // get champoinship standings (raceresults sorted my points)
    public static List<Driver> getDriverStandings(){
        ChampionshipManager manager = getInstance();
        List<Driver> currentDrivers=manager.drivers;
        for (int i =0; i < currentDrivers.size() -i -1; i++){
            for (int j= 0; j < currentDrivers.size() -1; j++){
                Driver temporary= currentDrivers.get(j);
                currentDrivers.set(j, currentDrivers.get(j+1));
                currentDrivers.set(j + 1, temporary);
            }
        }
        return currentDrivers;
    }
    //finding the leading driver
    public static Driver getLeadingDriver(){
        List<Driver> standings = getDriverStandings();
        return standings.get(0);
    }
    // caluclating total championship points
    public static int getTotalChampionshipPoints(List<Driver> drivers){
        int allPoints=0;
        for (Driver driver : drivers){
            allPoints=allPoints+driver.getPoints();
        }
        return allPoints;
    }
}
