public class Main {
    public static void main(String[] args) {
        SolarSystem ourSystem = new SolarSystem("Our system");
        ourSystem.addPlanet("Mercury", 0.39);
        ourSystem.addPlanet("Venus", 0.72);
        System.out.println(ourSystem.closest());

        SolarSystem fakeSystem = new SolarSystem("Fake System");
        fakeSystem.addPlanet("Mercury", 0.39);
        fakeSystem.addPlanet("Neptune", 30.05);
        fakeSystem.addPlanet("Trappist1b", 0.01);
        fakeSystem.addPlanet("Trappist1h", 0.06);
        System.out.println(fakeSystem.getPlanetByName("Mercury"));

        System.out.println(ourSystem.closest().equals(fakeSystem.getPlanetByName("Mercury")));
    }
}
