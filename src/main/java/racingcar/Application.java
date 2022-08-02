package racingcar;

import racingcar.model.RandomNumberGenerator;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        RandomNumberGenerator rand = new RandomNumberGenerator();
        int randNum = rand.generateRandomNumber();
        System.out.println(randNum);
    }
}
