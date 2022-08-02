package racingcar;

import racingcar.controller.GameController;
import racingcar.controller.InputController;
import racingcar.model.Car;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String userInput = InputController.getUserInput();
        List<Car> cars = InputController.generateCarList(userInput);
        int playCount = InputController.getPlayCount();
        GameController gamecontroller = new GameController(cars, playCount);
        gamecontroller.playGame();
        gamecontroller.printWinners();
    }
}
