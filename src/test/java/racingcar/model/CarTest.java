package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    public void moveTest성공() {
        Car car = new Car("pobi");
        car.move(4);
        int position = car.getPosition();
        assertThat(position).isEqualTo(new Position(1));
    }

    @Test
    public void moveTest실패() {
        Car car = new Car("pobi");
        car.move(3);
        Position position = new Position();
        assertThat(position).isEqualTo(new Position(0));
    }

    @Test
    public void NameValidationTest() {
        assertThatThrownBy(() -> {new Car("이름은5자이상이어야함");})
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 승자리턴하는기능구현테스트() {
        Car pobi = new Car("pobi", 2);
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 1);
        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));

        assertThat(cars.getWinners()).isEqualTo("pobi");
    }

    @Test
    public void 승자이름출력하는테스트() {
        Car pobi = new Car("pobi", 2);
        Car crong = new Car("crong", 2);
        Car honux = new Car("honux", 1);
        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        System.out.println(cars.getWinners());
    }
}
