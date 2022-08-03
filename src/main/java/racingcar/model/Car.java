package racingcar.model;

public class Car {
    private Position position;
    private Name name;

    public Car () {
        this.position = new Position();
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
