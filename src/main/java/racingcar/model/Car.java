package racingcar.model;

import racingcar.utils.Validator;

public class Car {
    private int position = 0;
    String name;
    Validator validator = new Validator();
    public Car(String name) {
        validator.validateName(name);
        this.name = name;
    }

    public void move() {
        position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
