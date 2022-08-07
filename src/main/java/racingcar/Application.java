package racingcar;

import racingcar.controller.GameController;
import racingcar.controller.InputController;
import racingcar.model.Cars;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Cars cars = InputController.getCarList();
        int count = InputController.getCount();
        GameController.playGame(cars, count);
    }
}
