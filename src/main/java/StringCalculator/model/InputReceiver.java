package StringCalculator.model;

import StringCalculator.view.ControllerMassage;
import org.assertj.core.internal.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReceiver {
    Validator validator = new Validator();
    Calculator calculator = new Calculator();

    private List<String> getUserInputIfContainsCommaOrColon;
    private List<String> receiveUserInput() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        List<String> userInputArray = new ArrayList<>();

        if ((userInput.contains(",") | (userInput.contains(";")))) {
            userInputArray =  calculator.returnBasicSeparatedArray(userInput);
        }
        if (userInput.contains("//")) {
            userInputArray = calculator.returnCustomSeparatedArray(userInput);
        }
        if ((userInput == null) || (userInput.equals(""))) {
            userInputArray.add(String.valueOf(calculator.getZeroWhenInputIsEmpty()));
        }
        if (userInput.matches("\\d")) {
            userInputArray.add(String.valueOf(calculator.returnJustIntNum(userInput)));
        }
        return userInputArray;
    }

    private static void validateUserInput(List<String> userInput) {
        Validator inputValidator = new Validator();
        inputValidator.validateIsInputContainsOnlyPositiveInteger(userInput);
    }

    public List<String> getUserInput() {
        ControllerMassage controllermassage = new ControllerMassage();
        controllermassage.getStartMassage();
        List<String> userInput = receiveUserInput();
        System.out.println(userInput);
        validateUserInput(userInput);
        return userInput;
    }
}
