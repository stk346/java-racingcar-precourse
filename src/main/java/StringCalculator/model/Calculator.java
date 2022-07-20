package StringCalculator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    public List<String> returnBasicSeparatedArray(String userInput) {
        String saparator = String.valueOf(userInput.charAt(1));
        List<String> splitedUserInput = new ArrayList<>(Arrays.asList(userInput.split(saparator)));
        return splitedUserInput;
    }

    public int getZeroWhenInputIsEmpty() {
        return 0;
    }

    public int returnJustIntNum(String userInput) {
        int convertedIntNum = Integer.parseInt(userInput);
        return convertedIntNum;
    }

    private List<Integer> transformArrayStringToInt(List<String> inputArray) {
        List<Integer> intArray = new ArrayList<>();
        for (String s: inputArray) {
            intArray.add(Integer.valueOf(s));
        }
        return intArray;
    }

    public List<String> returnCustomSeparatedArray(String userInput) {
        String customSeparator = String.valueOf(userInput.charAt(2));
        List<String> splitedUserInputArray = new ArrayList<> (Arrays.asList(userInput.split(customSeparator)));
        List<String> trimmedInputArray = splitedUserInputArray.subList(1, splitedUserInputArray.size());
        List<String> strippedUserInputArray = trimmedInputArray.stream()
                .map(s -> s.trim())
                .collect(Collectors.toList());
        return strippedUserInputArray;
    }

    public int doSumArray(List<String> inputArray) {
        List<Integer> intArray = transformArrayStringToInt(inputArray);
        int summedResult = intArray.stream().mapToInt(Integer::intValue).sum();
        return summedResult;
    }

}
