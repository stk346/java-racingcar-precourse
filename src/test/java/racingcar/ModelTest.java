package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class ModelTest {
    @Test
    public void generateRandomNumberTest() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int randNum = randomNumberGenerator.getRandNum();
        System.out.println(randNum);
    }
}
