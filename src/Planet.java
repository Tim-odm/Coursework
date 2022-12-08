import java.text.DecimalFormat;
import static java.lang.String.format;

public class Planet {
    private static final String LIST_PLANET = "%s  is %sAU from its star, and orbits"
            + " in %s years\n";
    private String planetName;
    private String planetDistance;
    private String planetPeriod;
    public Planet(String planetName, double planetDistance) {
        this.planetName = setPlanetName(planetName);
        this.planetDistance = fmt(setPlanetdistance(planetDistance));
        this.planetPeriod = fmt(calcPlanetPeriod(planetDistance));
    }

    // Set planet name
    private String setPlanetName(String planetName) {
        return planetName;
    }

    public static String fmt(double input) {
        DecimalFormat format = new DecimalFormat("0.0##");
        return format.format(input);
    }

    // Set planet distance
    private double setPlanetdistance(double planetDistance) {
        return planetDistance;
    }

    public double calcPlanetPeriod(double planetDistance) {
        return Math.sqrt(planetDistance*planetDistance*planetDistance);
    }
    // toString method
    public String toString() {
        return format(LIST_PLANET, planetName, planetDistance, planetPeriod);
    }
}
