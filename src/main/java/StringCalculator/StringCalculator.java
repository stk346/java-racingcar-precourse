package StringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public static int splitAndSum(String userInput) {
        if (isEmpty(userInput)) {
            return 0;
        }
        if (isOnlyNumber(userInput)) {
            return Integer.parseInt(userInput);
        }
        String[] userInputArray = split(userInput);
        return sum(userInputArray);

    }

    private static boolean isEmpty(String userInput) {
        return userInput == "" || userInput.isEmpty() == true;
    }

    private static boolean isOnlyNumber(String userInput) {
        return userInput.length() == 1 && Character.isDigit(userInput.charAt(0));
    }

    private static String[] split(String userInput) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(userInput);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }
        return userInput.split(",|;");
    }

    private static int sum(String[] userInputArray) {
        int result = 0;
        for (int i = 0; i < userInputArray.length; i++) {
            isContainsNegativeValue(userInputArray[i]);
            result += Integer.parseInt(userInputArray[i]);
        }
        return result;
    }

    private static void isContainsNegativeValue(String value) {
        if (Integer.parseInt(value) < 0) {
            throw new RuntimeException();
        }
    }
}
