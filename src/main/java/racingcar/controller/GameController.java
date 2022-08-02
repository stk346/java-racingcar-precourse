package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Game;
import racingcar.view.ResultView;

import java.util.List;

public class GameController {
    private int count;
    private Game game;
    private List<Car> cars;

    public GameController(List<Car> cars, int count) {
        this.cars = cars;
        this.game = new Game(cars);
        this.count = count;
    }

    public void playGame() {
        ResultView.getPlayUI();
        for(int i = 0; i < count; i++) {
            game.moveCar(4);
            ResultView.getCarPosition(cars);
        }
    }

    public void printWinners() {
        List<Car> winnerArray = game.getWinnerArray(cars);
        ResultView.printWinnersView(winnerArray);
    }
}
