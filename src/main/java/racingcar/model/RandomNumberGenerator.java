package racingcar.model;

import java.util.Random;

public class RandomNumberGenerator {
    public int getRandNum() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
