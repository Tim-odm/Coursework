import java.util.ArrayList;

public class SolarSystem {
    private static final String STAR_MSG = "Star %s has planets:\n";
    private String starName;
    private double starLumi;
    private ArrayList<Planet> planetArray = new ArrayList<>();

    // Constructor (NB: name refers to star name)
    public SolarSystem(String name) {
        setName(name);
    }

    // Constructor for level 3
    public SolarSystem(String name, double starLumi) {
        setName(name);
        setStarLumi(starLumi);
    }

    // Method to set solar system name;
    private void setName(String name) {
        this.starName = name;
    }

    private void setStarLumi(double starLumi) {
        this.starLumi = starLumi;
    }

    // Method to calculate Luminosity factor
    public double calcLuminosityFactor() {
        return Math.sqrt(starLumi);
    }

    // Method to determine if a planet is habitable
    public boolean isHabitable(double planetDistance, double planetMass) {
        double least = 0.75 * calcLuminosityFactor();
        double most = 2.0 * calcLuminosityFactor();
        if (least > planetDistance || planetDistance > most) {
            return false;
        }
        if (planetMass < 0.6 || planetMass > 7.0) {
            return false;
        }
        return true;
    }

    // Method to add planet
    public void addPlanet(String planetName, double planetDistance) {
        planetArray.add(new Planet(planetName, planetDistance));
    }

    // Second add planet method for level 3
    public void addPlanet(String planetName, double planetMass,
                          double planetRadius, double planetDistance) {
        boolean isHabitable = isHabitable(planetDistance, planetMass);
        planetArray.add(new Planet(planetName, planetMass,
                planetRadius, planetDistance, isHabitable));
    }

    // Method to get planet by name
    public Planet getPlanetByName(String planetName) {
        for (Planet planet : planetArray) {
            if (planet.getPlanetName().equals(planetName)) {
                return planet;
            }
        }
        return null;
    }

    // Closest method
    public Planet closest() {
        Planet closestPlanet = planetArray.get(0);
        for (Planet planet : planetArray) {
            if (planet.getPlanetDistance() < closestPlanet.getPlanetDistance()) {
                closestPlanet = planet;
            }
        }
        return closestPlanet;
    }

    // Furthest method
    public Planet furthest() {
        Planet furthestPlanet = planetArray.get(0);
        for (Planet planet : planetArray) {
            if (planet.getPlanetDistance() > furthestPlanet.getPlanetDistance()) {
                furthestPlanet = planet;
            }
        }
        return furthestPlanet;
    }

    // toString method
    public String toString() {
        String output = "";
        for (Planet p: planetArray) {
            output += p.toString();
        }
        return String.format(STAR_MSG, starName)
                + output;
    }
}
