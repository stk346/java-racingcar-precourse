package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static int MOVING_THRESHOLD = 4;
    private List<Car> cars;

    public Game(List<Car> cars) {
        this.cars = cars;
    }

    public void moveCar(int threshold) {
        for (Car car : cars) {
            RandomNumberGenerator randNum = new RandomNumberGenerator();
            if (randNum.getRandNum() > threshold) {
                car.move();
            }
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getWinnerArray(List<Car> cars) {
        int max_moving = Integer.MIN_VALUE;
        for (Car car : cars) {
            if (car.getPosition() > max_moving) {
                max_moving = car.getPosition();
            }
        }
        ArrayList<Car> winnerList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == max_moving) {
                winnerList.add(car);
            }
        }
        return winnerList;
    }
}
