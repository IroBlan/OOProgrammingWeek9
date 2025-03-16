package carrace;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        ChampionshipManager manager=ChampionshipManager.getInstance();
        AsphaltCar car1 = new AsphaltCar("m","m",900,10);
        Driver driver1 = new Driver("Sébastien Ogier","France", car1);
        manager.registerDriver(driver1);
        AsphaltCar car2 = new AsphaltCar("m","m",950,12);
        Driver driver2 = new Driver("Kalle Rovanperä","Finland", car2);
        manager.registerDriver(driver2);
        AsphaltCar car3 = new AsphaltCar("m","m",1000,7);
        Driver driver3 = new Driver("Ott Tänak","Estonia", car3);
        manager.registerDriver(driver3);

        //simulate asphalt race
        RallyRaceResult race1 = new RallyRaceResult("Rally Finland", "Jyväskylä");
        manager.addRaceResult(race1);

        //simulate gravel race
        GravelCar car4 = new GravelCar("k","l",1100,20);
        driver1.setcar(car4);
        RallyRaceResult race2 = new RallyRaceResult("Monte Carlo Rally", "Monaco");
        manager.addRaceResult(race2);

        List<Driver> currentDrivers= manager.getDriverStandings();
        System.out.println(currentDrivers);
    }

    

    /*
     * 1. Creates and configures the ChampionshipManager singleton
    2. Create and register drivers with appropriate cars
    3. Simulate at least two races with different surfaces
    4. Display championship standings, statistics, and race results
    5. Demonstrate car switching between races
    6. Show performance calculations for different car types
     */
}
