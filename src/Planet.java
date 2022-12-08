public class Planet {
    private String planetName;
    private double distance;
    private double orbitalPeriod;
    public Planet(String planetName, double distance) {
        this.planetName = setPlanetName(planetName);
        this.distance = setPlanetMass(distance);
    }

    // Set planet name
    private String setPlanetName(String planetName) {
        return planetName;
    }

    // Set planet mass
    private double setPlanetMass(double distance) {
        return distance;
    }

    // toString method
    public String toString() {
        return planetName + " is " + distance + "AU from its star, and orbit in " +
                orbitalPeriod + " years\n";
    }
}
