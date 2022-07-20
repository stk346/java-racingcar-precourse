package racingcar;

public class Car {
    private Name name;
    private Location location;

    public Car(String name, int location) {
        this.name = new Name(name);
        this.location = new Location(location);
    }
}
