package racingcar.model;

public class Car {
    private Position position;
    private Name name;

    public Car (String name) {
        this.position = new Position();
        this.name = new Name(name);
    }
    public Car (String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int randNum) {
        if (randNum >= 4) {
            this.position.move();
        }
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    public String getName() {
        return this.name.getName();
    }
}
