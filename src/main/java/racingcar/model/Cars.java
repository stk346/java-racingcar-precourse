package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    private List<Car> getWinners(int maxPosition) {
        List<Car> cars = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getPosition() == maxPosition) {
                cars.add(car);
            }
        }
        return cars;
    }

    private String getWinnerName(List<Car> winners) {
        String winnerName = "";
        winnerName += winners.remove(0).getName();
        for (int i = 0; i < winners.size(); i++) {
            winnerName += ", " + winners.get(i).getName();
        }
        return winnerName;
    }

    public String getWinners() {
        int maxPosition = getMaxPosition();
        List<Car> winners = getWinners(maxPosition);
        String winnerName = getWinnerName(winners);
        return winnerName;
    }
}
