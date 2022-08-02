package racingcar.model;

import org.junit.jupiter.api.Test;
import racingcar.model.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ModelTest {
    @Test
    public void generateRandomNumberTest() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int randNum = randomNumberGenerator.getRandNum();
        System.out.println(randNum);
    }

    @Test
    public void generateCarsTest() {
        String userInput = "Car0,Car1,Car2";

        List<Car> cars = Arrays.asList(
                new Car("car0"),
                new Car("car1"),
                new Car("car2")
        );
        for (int i = 0; i < cars.size(); i++) {
            assertThat(cars.get(i).getName()).isEqualTo("car"+(i));
        }
    }
    @Test
    public void removeTest() {
        List<Integer> tempArray = new ArrayList<>();
        tempArray.add(1);
        tempArray.add(2);
        tempArray.add(3);
        System.out.println(tempArray.remove(0));
    }
}
