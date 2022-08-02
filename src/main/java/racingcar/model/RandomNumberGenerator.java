package racingcar.model;

import java.util.Random;

public class RandomNumberGenerator {
    public int generateRandomNumber() {
        Random rand = new Random();
        int randNum = rand.nextInt(10);

        return randNum;
    }
}
