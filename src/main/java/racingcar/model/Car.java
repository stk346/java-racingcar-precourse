package racingcar.model;

public class Car {
    private Position position;
    private Name name;

    public Car (String name) {
        this.position = new Position();
        this.name = new Name(name);
    }

    public void move(int randNum) {
        if (randNum >= 4) {
            this.position.move();
        }
    }

    public Position getPosition() {
        return this.position;
    }
}
