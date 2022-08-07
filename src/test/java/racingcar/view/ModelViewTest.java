package racingcar.view;

import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class ModelViewTest {
    @Test
    public void positionViewTest() {
        Car pobi = new Car("pobi", 2);
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 3);
        List<Car> cars = new ArrayList<>();
        cars.add(pobi);
        cars.add(crong);
        cars.add(honux);
        for (Car car : cars) {
            ModelView.positionView(car.getPosition());
            System.out.println(car.getName() + " : " + ModelView.positionView(car.getPosition()));
        }
    }
}
