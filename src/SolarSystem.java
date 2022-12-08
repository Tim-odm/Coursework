import java.util.ArrayList;

public class SolarSystem {
    private static final String STAR_MSG = "Star %s has planets:\n";
    private final String starName;
    private Planet newPlanet;
    private static int planetCounter = 0;

    // Constructor (NB: name refers to star name)
    public SolarSystem(String name) {
        this.starName = setName(name);
    }

    // Method to set planet name;
    private String setName(String name) {
        return name;
    }

    // Method to add planet
    // TODO create a planet class
    public void addPlanet(String planetName, double planetDistance) {
        newPlanet = new Planet(planetName, planetDistance);
    }

    // toString method
    public String toString() {
        return String.format(STAR_MSG, starName)
                + newPlanet;

    }
}
