package StringCalculator.model;

import java.util.Arrays;

public class Calculator {
    public int doBasicAddition(String userInput) {
        String[] splitedUserInput = userInput.split(",|:");
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

    public int doCustomSeparatorAddition(String userInput) {
        String[] splitedUserInputArray = userInput.split("\n");
        String customSeparator = String.valueOf(splitedUserInputArray[0].charAt(2));
        String[] splitedUserInputArrayForAddition = splitedUserInputArray[1].split(customSeparator);
        int[] intUserInputArray = Arrays.stream(splitedUserInputArrayForAddition).mapToInt(Integer::parseInt).toArray();
        int sumArray = Arrays.stream(intUserInputArray).sum();
        return sumArray;
    }
}
