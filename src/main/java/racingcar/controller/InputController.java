package racingcar.controller;

import racingcar.model.Car;
import racingcar.utils.Validator;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputController {
    static Validator validator = new Validator();

    public static String getUserInput() throws IllegalArgumentException {
        InputView.inputUI();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        validateDelimiterInLoop(userInput);
        validateNameInLoop(userInput);
        validateCarNumbersInLoop(userInput);
        return userInput;
    }

    public static List<Car> generateCarList(String userInput) {
        List<String> nameArray = Arrays.asList(userInput.split(","));
        List<Car> cars = new ArrayList<>();

        for (String name : nameArray) {
            Car car = new Car(name);
            cars.add(car);
        }
        return cars;
    }

    public static int getPlayCount() {
        InputView.inputCountView();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        return validateCountInLoop(userInput);
    }

    private static int validateCountInLoop(String userInput) {
        try {
            validator.validateCount(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getPlayCount();
        }
        return Integer.parseInt(userInput);
    }

    private static String validateCarNumbersInLoop(String userInput) {
        try {
            validator.validateCarNumbers(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getUserInput();
        }
        return userInput;
    }

    private static String validateDelimiterInLoop(String userInput) {
        try {
            validator.validateDelimiter(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getUserInput();
        }
        return userInput;
    }

    private static String validateNameInLoop(String userInput) {
        try {
            validator.validateName(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getUserInput();
        }
        return userInput;
    }
}
