package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.RandomNumberGenerator;
import racingcar.view.ModelView;

import java.util.List;

public class GameController {
    private Cars cars;
    private int count;

    public GameController(Cars cars, int count) {
        this.cars = cars;
        this.count = count;
    }

    public static void playGame(Cars cars, int count) {
        ModelView.resultView();
        for (int i=0; i < count; i++) {
            for (Car car : cars.getCars()) {
                int randNum = RandomNumberGenerator.generateRandomNumber();
                car.move(randNum);
                System.out.println(car.getName() + " : " + ModelView.positionView(car.getPosition()));
            }
            System.out.print("\n");
        }
        System.out.println(cars.getWinners() + "가 최종 우승했습니다.");
    }
}
