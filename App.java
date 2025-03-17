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
        race1.recordResult(driver1,30);
        race1.recordResult(driver2,20);
        race1.recordResult(driver3,50);
        manager.addRaceResult(race1);

        //simulate gravel race
        GravelCar car4 = new GravelCar("k","l",1100,20);
        driver1.setcar(car4);
        RallyRaceResult race2 = new RallyRaceResult("Monte Carlo Rally", "Monaco");
        race2.recordResult(driver1,90);
        race2.recordResult(driver2,30);
        race2.recordResult(driver3,25);
        manager.addRaceResult(race2);

        List<Driver> currentDrivers= manager.getDriverStandings();
        System.out.println("==== DRIVERS STANDINGS =====");
        System.out.println("Position 1: "+currentDrivers.get(0).getName()+" ("+currentDrivers.get(0).getCountry()+"), points: "+currentDrivers.get(0).getPoints());
        System.out.println("Position 2: "+currentDrivers.get(1).getName()+" ("+currentDrivers.get(1).getCountry()+"), points: "+currentDrivers.get(1).getPoints());
        System.out.println("Position 3: "+currentDrivers.get(2).getName()+" ("+currentDrivers.get(2).getCountry()+"), points: "+currentDrivers.get(2).getPoints());
        System.out.println("");
        
        Driver leader = manager.getLeadingDriver();
        System.out.println("===== CHAMPIONSHIP LEADER ====\n"+leader.getName()+", points: "+leader.getPoints()+"\n");

        System.out.println("==== RACE RESULTS ====");
        List<Driver> results = race1.getResults();
        System.out.println("Race: Rally Finland (Jyväskylä)");
        for (int i =0; i < results.size(); i++){
            int a=i+1;
            System.out.println("Position "+ a +": "+results.get(i).getName());
        }
        System.out.println("");
        List<Driver> results2 = race2.getResults();
        System.out.println("Race: Monte Carlo Rally (Monaco)");
        for (int i =0; i < results2.size(); i++){
            int a = i+1;
            System.out.println("Position "+ a +": "+results2.get(i).getName());
        }
        System.out.println("");
    }
}
