import com.sun.jdi.VoidType;
import java.util.ArrayList;

public class SolarSystem {

    private final String name;
    private int planetCounter = 0;

    // Constructor (NB: name refers to star name)
    public SolarSystem(String name) {
        this.name = setName(name);
    }

    // Method to set planet name;
    private String setName(String name) {
        return name;
    }

    // Method to add planet
    // TODO create a planet class
    // Planets should be accessed via an array
    public void addPlanet(String planetName, double distance) {
        Planet planet = new Planet(planetName, distance);
    }

    public String toString() {
        String output = "Star " + this.name + " has planets:\n" ;
        return output;
    }
}
