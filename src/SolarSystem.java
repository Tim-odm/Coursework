
public class SolarSystem {
    private static final String STAR_MSG = "Star %s has planets:\n";
    private static final String LIST_PLANET = "%s is %.3fAU from its start, and orbits" +
            " in %.3f years\n";
    private final String starName;
    private String planetName;
    private double planetDistance;
    private double planetPeriod;

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
        this.planetName = setPlanetName(planetName);
        this.planetDistance = setPlanetDistance(planetDistance);
        this.planetPeriod = setPlanetPeriod(planetDistance);
    }

    public String setPlanetName(String planetName) {
        return planetName;
    }

    public double setPlanetDistance(double planetDistance){
        return planetDistance;
    }

    public double setPlanetPeriod(double planetDistance) {
        return calcPlanetPeriod(planetDistance);
    }
    public double calcPlanetPeriod(double planetDistance) {
        return Math.sqrt(planetDistance*planetDistance*planetDistance);
    }

    public String toString() {
        return String.format(STAR_MSG, starName)
                + String.format(LIST_PLANET, planetName, planetDistance, planetPeriod);

    }
}
