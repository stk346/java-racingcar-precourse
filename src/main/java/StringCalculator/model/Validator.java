package StringCalculator.model;

public class Validator {
    public static void validateInputLength(String[] userInput) {

        for (String Arr : userInput) {
            if (!Arr.matches(("[1-9]+"))) {
                System.out.println("구분자 사이에는 숫자만 넣어주세요.");
            }
        }
    }
}
