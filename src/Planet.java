import java.text.DecimalFormat;
import static java.lang.String.format;

public class Planet {
    private static final String LIST_PLANET = "%s  is %sAU from its star, and orbits"
            + " in %s years\n";
    private String planetName;
    private double planetDistance;
    private String sPlanetDistance;
    private double planetPeriod;
    private String sPlanetPeriod;

    public Planet(String planetName, double planetDistance) {
        setPlanetName(planetName);
        setPlanetdistance(planetDistance);
        setPlanetPeriod(planetDistance);
        sPlanetDistance = fmt(this.planetDistance);
        sPlanetPeriod = fmt(this.planetPeriod);
    }

    // Set planet name
    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    // Get planet name
    public String getPlanetName() {
        return planetName;
    }

    // Get name method
    public String getName() {
        return planetName;
    }

    public static String fmt(double input) {
        DecimalFormat format = new DecimalFormat("0.0##");
        return format.format(input);
    }

    // Set planet distance
    private void setPlanetdistance(double planetDistance) {
        this.planetDistance = planetDistance;
    }

    // Get planet distance
    public double getPlanetDistance() {
        return planetDistance;
    }

    // Set planet period
    public void setPlanetPeriod(double planetDistance) {
        this.planetPeriod = calcPlanetPeriod(planetDistance);
    }
    public double calcPlanetPeriod(double planetDistance) {
        return Math.sqrt(planetDistance*planetDistance*planetDistance);
    }

    // Equals method
    public boolean equals(Planet other) {
        if (!this.planetName.equals(other.planetName)) {
            return false;
        } else if (this.getPlanetDistance() != other.getPlanetDistance()) {
            return false;
        }
        return true;
    }

    // toString method
    public String toString() {
        return format(LIST_PLANET, planetName, sPlanetDistance, sPlanetPeriod);
    }
}
