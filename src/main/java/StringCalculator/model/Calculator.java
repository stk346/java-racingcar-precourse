package StringCalculator.model;

import java.util.Arrays;

public class Calculator {
    public String[] returnBasicSeparatedArray(String userInput) {
        String[] splitedUserInput = userInput.split(",|:");
        return splitedUserInput;
    }

    public int getZeroWhenInputIsEmpty() {
        return 0;
    }

    public int returnJustIntNum(String userInput) {
        int convertedIntNum = Integer.parseInt(userInput);
        return convertedIntNum;
    }

    private int[] transformArrayStringToInt(String[] inputArray) {
        int[] intArray = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
        return intArray;
    }
    public String[] returnCustomSeparatedArray(String userInput) {
        String[] splitedUserInputArray = userInput.split("\n");
        String customSeparator = String.valueOf(splitedUserInputArray[0].charAt(2));
        String[] splitedUserInputArrayForAddition = splitedUserInputArray[1].split(customSeparator);
        return splitedUserInputArrayForAddition;
    }

    public int doSumArray(String[] inputArray) {
        int[] intArray = transformArrayStringToInt(inputArray);
        int summedResult = Arrays.stream(intArray).sum();
        return summedResult;
    }

}
