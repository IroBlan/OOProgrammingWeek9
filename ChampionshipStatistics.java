package carrace;

import java.util.List;


public class ChampionshipStatistics {
    /* static methods for:
o Calculating average points per driver
o Finding the most successful country
o Counting total races held */
    ChampionshipManager manager=ChampionshipManager.getInstance();
    public static double calculateAveragePointsPerDriver(List<Driver> drivers){
        int numberOfDrivers=3;
        int points=manager.getTotalChampionshipPoints(List<Driver> drivers);
        return average;
    }
}
