public class Planet {
    private static final String LIST_PLANET = "%s is %.3fAU from its start, and orbits" +
            " in %.3f years\n";
    private String planetName;
    private double planetDistance;
    private double planetPeriod;
    public Planet(String planetName, double planetDistance) {
        this.planetName = setPlanetName(planetName);
        this.planetDistance = setPlanetdistance(planetDistance);
        this.planetPeriod = setPlanetPeriod(planetDistance);
    }

    // Set planet name
    private String setPlanetName(String planetName) {
        return planetName;
    }

    // Set planet distance
    private double setPlanetdistance(double planetDistance) {
        return planetDistance;
    }

    public double setPlanetPeriod(double planetDistance) {
        return calcPlanetPeriod(planetDistance);
    }
    public double calcPlanetPeriod(double planetDistance) {
        return Math.sqrt(planetDistance*planetDistance*planetDistance);
    }
    // toString method
    public String toString() {
        return String.format(LIST_PLANET, planetName, planetDistance, planetPeriod);
    }
}
