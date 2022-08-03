package racingcar.model;

import java.util.Objects;

public class Position {
    private int position;
    public Position() throws IllegalArgumentException {
        this.position = 0;
    }
    public Position(int num) {
        this.position = num;
    }

    public void move() {
        this.position++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
