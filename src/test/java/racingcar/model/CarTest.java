package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    public void moveTest성공() {
        Car car = new Car("pobi");
        car.move(4);
        Position position = car.getPosition();
        assertThat(position).isEqualTo(new Position(1));
    }

    @Test
    public void moveTest실패() {
        Car car = new Car("pobi");
        car.move(3);
        Position position = new Position();
        assertThat(position).isEqualTo(new Position(0));
    }


}
