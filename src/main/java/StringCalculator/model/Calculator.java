package StringCalculator.model;

import java.util.Arrays;

public class Calculator {
    public int doBasicAddition(String userInput) {
        String[] splitedUserInput = userInput.split(",|:");
        Validator.validateInputLength(splitedUserInput);
        int[] intUserInputArray = Arrays.stream(splitedUserInput).mapToInt(Integer::parseInt).toArray();
        int sumArray = Arrays.stream(intUserInputArray).sum();
        return sumArray;
    }

    public int getZeroWhenInputIsEmpty() {
        return 0;
    }

    public int returnJustIntNum(String userInput) {
        int convertedIntNum = Integer.parseInt(userInput);
        return convertedIntNum;
    }
}
