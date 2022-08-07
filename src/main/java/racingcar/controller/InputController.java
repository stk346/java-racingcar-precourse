package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.validation.Validator;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputController {
    public static Cars getCarList() {
        InputView.carNameView();
        try {
            String[] carNameArray = getUserInput();
            Cars cars = createCars(carNameArray);
            return cars;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCarList();
        }
    }

    public static int getCount() {
        InputView.countView();
        try {
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            Validator.validateCount(count);
            return count;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCount();
        }
    }

    private static Cars createCars(String[] carNameArray) throws IllegalArgumentException {
        Validator.validateCarNum(carNameArray);
        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i< carNameArray.length; i++) {
            carsList.add(new Car(carNameArray[i]));
        }
        Cars cars = new Cars(carsList);
        return cars;
    }

    private static String[] getUserInput() throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        Validator.validateDelimiter(userInput);
        String[] carNameArray = userInput.split(",");
        return carNameArray;
    }
}
