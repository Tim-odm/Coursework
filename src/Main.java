public class Main {
    public static void main(String[] args) {
        SolarSystem ourSystem = new SolarSystem("Our system");
        ourSystem.addPlanet("Mercury", 0.39);
        ourSystem.addPlanet("Venus", 0.72);
        System.out.println(ourSystem);

    }
}
