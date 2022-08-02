package racingcar.view;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    public static void getPlayUI() {
        System.out.println("실행 결과");
    }

    public static void getCarPosition(List<Car> carList) {
        List<String> positionList = getCarPositionArray(carList);
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).getName() + " : " + positionList.get(i));
        }
        System.out.println("\n");
    }

    private static List<String> getCarPositionArray(List<Car> carList) {
        List<String> positionList = new ArrayList<>();
        for (Car car : carList) {
            int repeatNum = car.getPosition();
            String positionOfCar = new String(new char[repeatNum]).replace("\0", "-");
            positionList.add(positionOfCar);
        }
        return positionList;
    }

    public static void printWinnersView (List<Car> cars) {
        String winners = "";
        for (int i = 0; i < cars.size()-1; i++) {
            winners += cars.get(i).getName() + ", ";
        }
        winners += cars.get(cars.size()-1).getName()  + "가 최종 우승했습니다.";
        System.out.println(winners);
    }
}
