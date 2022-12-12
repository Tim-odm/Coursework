import java.text.DecimalFormat;

import static java.lang.String.format;

public class Planet {
    private static final String LIST_PLANET = "%s  is %sAU from its star, and orbits"
            + " in %s years\n";
    private static final String LIST_PLANET2 = "%s has a mass of %s Earths with a surface"
            + " gravity of %sg, is %sAU from its star, and orbits in %s years: could be"
            + " habitable? %s\n";
    private String planetName;
    private double planetDistance;
    private final String sPlanetDistance;
    private double planetPeriod;
    private final String sPlanetPeriod;
    private double planetMass;
    private String sPlanetMass;
    private double planetRadius;
    private double planetGravity;
    private String sPlanetGravity;
    private String sIsHabitable;

    public Planet(String planetName, double planetDistance) {
        setPlanetName(planetName);
        setPlanetdistance(planetDistance);
        setPlanetPeriod(planetDistance);
        sPlanetDistance = fmt(this.planetDistance);
        sPlanetPeriod = fmt(this.planetPeriod);
    }

    // Constructor for level 3
    public Planet(String planetName, double planetMass,
                  double planetRadius, double planetDistance, boolean isHabitable) {
        setPlanetName(planetName);
        setPlanetdistance(planetDistance);
        setPlanetPeriod(planetDistance);
        setPlanetMass(planetMass);
        setPlanetRadius(planetRadius);
        setPlanetGravity(planetMass, planetRadius);
        setIsHabitable(isHabitable);
        sPlanetDistance = fmt(this.planetDistance);
        sPlanetPeriod = fmt(this.planetPeriod);
        sPlanetGravity = fmt(this.planetGravity);
        sPlanetMass = fmt(this.planetMass);
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

    // Method to calculate planet period
    public double calcPlanetPeriod(double planetDistance) {
        return Math.sqrt(planetDistance * planetDistance * planetDistance);
    }

    // Method to set planet mass
    public void setPlanetMass(double planetMass) {
        this.planetMass = planetMass;
    }

    // Method to get planet mass
    public double getPlanetMass() {
        return planetMass;
    }

    // Method to set planet radius
    public void setPlanetRadius(double planetRadius) {
        this.planetRadius = planetRadius;
    }

    // Method to get planet radius
    public double getPlanetRadius() {
        return planetRadius;
    }

    // Method to set planet gravity
    public void setPlanetGravity(double planetMass, double planetRadius) {
        this.planetGravity = planetMass / (planetRadius * planetRadius);
    }

    // Method to define if a planet is habitable
    public void setIsHabitable(boolean isHabitable) {
        this.sIsHabitable = (isHabitable ? "yes" : "no");
    }

    // Equals method
    public boolean equals(Planet other) {
        if (!this.planetName.equals(other.planetName)) {
            return false;
        } else return this.getPlanetDistance() == other.getPlanetDistance();
    }

    // Method to format double to string
    public static String fmt(double input) {
        DecimalFormat format = new DecimalFormat("0.0##");
        return format.format(input);
    }

    // toString method
    public String toString() {
        if (sPlanetMass == null) {
            return format(LIST_PLANET, planetName, sPlanetDistance, sPlanetPeriod);
        }
            return format(LIST_PLANET2, planetName, sPlanetMass, sPlanetGravity,
                    sPlanetDistance, sPlanetPeriod, sIsHabitable);
    }
}
