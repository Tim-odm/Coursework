import java.util.ArrayList;

public class SolarSystem {
    private static final String STAR_MSG = "Star %s has planets:\n";
    private final String starName;
    private ArrayList<Planet> planetArray = new ArrayList<>();

    // Constructor (NB: name refers to star name)
    public SolarSystem(String name) {
        this.starName = setName(name);
    }

    // Method to set planet name;
    private String setName(String name) {
        return name;
    }

    // Method to add planet
    public void addPlanet(String planetName, double planetDistance) {
        planetArray.add(new Planet(planetName, planetDistance));
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
