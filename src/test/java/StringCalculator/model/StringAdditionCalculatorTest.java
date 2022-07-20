package StringCalculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringAdditionCalculatorTest {
    @DisplayName("콤마(,) and 콜론(:) 덧셈 수행 테스트")
    @Test
    public void commaAdditionTest() {
        String commaUserInput = "1,2,3";
        String colonUserInput = "1:2:3";
        Calculator calculator = new Calculator();

        List<String> commaResultArray = calculator.returnBasicSeparatedArray(commaUserInput);
        List<String> colonResultArray = calculator.returnBasicSeparatedArray(colonUserInput);
        assertThat(calculator.doSumArray(commaResultArray)).isEqualTo(6);
        assertThat(calculator.doSumArray(colonResultArray)).isEqualTo(6);
    }

    @DisplayName("숫자 하나가 문자열로 들어왔을 때 해당 숫자를 반환하는 기능 테스트")
    @Test
    public void returnJustIntTest() {
        Calculator calculator = new Calculator();
        String userInput = "1";

        int intUserInput = calculator.returnJustIntNum(userInput);
        assertThat(intUserInput).isEqualTo(1);
    }

    @DisplayName("커스텀 구분자로 더하는 기능 테스트")
    @Test
    public void customAdditionTest() {
        String userInput = "//;\n1;2;3";
        Calculator calculator = new Calculator();
        List<String> intUserInputArray = calculator.returnCustomSeparatedArray(userInput);
        int sumArray = calculator.doSumArray(intUserInputArray);
        assertThat(sumArray).isEqualTo(6);
    }

    @DisplayName("숫자 이외의 값이나 음수가 주어졌을 때 RuntimeException을 throw하는 기능 테스트")
    @Test
    public void throwRuntimeExceptionTest() {
        Calculator calculator = new Calculator();
        Validator validator = new Validator();
        String userInput = "1,2,3";
        List<String> stringArray = calculator.returnBasicSeparatedArray(userInput);
        validator.validateIsInputContainsOnlyPositiveInteger(stringArray);
    }

    @Test
    public void userInputTest() {
        String userInput = "1|2|3";
        boolean isUserInputContains = ((!userInput.contains(",") && (!userInput.contains((";")))));
        assertThat(isUserInputContains).isEqualTo(true);
    }

    @Test
    public void userInputSplitTest() {
        String userInput = "//-\n1-2-3";
        List<String> splitedUserInputArray = new ArrayList<> (Arrays.asList(userInput.split("\n")));
        String customSeparator = String.valueOf(splitedUserInputArray.get(0).charAt(2));
        System.out.println(customSeparator);
        List<String> splitedUserInputArrayForAddition = new ArrayList<> (Arrays.asList(splitedUserInputArray.get(1).split(customSeparator)));
        System.out.println(splitedUserInputArrayForAddition);
        }

    @Test
    public void arrayListRemoveTest() {
        List<String> testList = new ArrayList<>();
        testList.add("1");
        testList.add("2");
        testList.add("3");
        testList.add("2");
        System.out.println(testList);
        testList.remove("2");
        System.out.println(testList);
    }

    @Test
    public void userInputTest2() {
        String userInput = "//-\n1-2-3";
        boolean testflag = userInput.contains("//");
        assertThat(testflag).isEqualTo(true);
    }


    public List<String> REGEX_META_CHAR = Collections.unmodifiableList(
            Arrays.asList(".", "|", "^", "$", "*", "+", "?", "(", "[", "{", ")")
    );

    public String convertEscapedString(final String customDelimiter) {
        if (REGEX_META_CHAR.contains(customDelimiter)) {
            return "\\" + customDelimiter;
        }
        return customDelimiter;
    }
    @Test
    public void userInputTestWhenContainsN () {
        String userInput = "//-\n1-2-3";
        String CUSTOM_DELIMITER_REGEX = "//(.)\n(.*)";
        Pattern customPattern = Pattern.compile(CUSTOM_DELIMITER_REGEX);
        Matcher matcher = customPattern.matcher(userInput);
        String customDelimiter = convertEscapedString(matcher.group(1));
        matcher.group(2).split(customDelimiter);
    }

    @Test
    public void customSplitterTest() {
        String userInput = "//-\n1-2-3";
        List<String> userInputArray = Arrays.asList(userInput.split("-"));
        System.out.println(userInputArray);
        List<String> trimmedInputArray = userInputArray.subList(1, userInputArray.size());
        System.out.println(trimmedInputArray.stream()
                .map(s -> s.trim())
                .collect(Collectors.toList()));
    }
}
