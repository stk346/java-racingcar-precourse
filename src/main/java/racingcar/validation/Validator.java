package racingcar.validation;

public class Validator {
    private static final String VALIDATE_DELIMITER_MASSAGE = "자동차 이름은 쉼표로 구분해주세요.";
    private static final String VALIDATE_COUNT_MASSAGE = "시도할 횟수는 1회 이상이어야 합니다.";
    private static final String VALIDATE_CAR_NUMBER_MASSAGE = "자동차 개수는 1개 이상이어야 합니다.";
    public static void validateDelimiter(String userInput) throws IllegalArgumentException {
        if (!(userInput).contains(",")) {
            throw new IllegalArgumentException(VALIDATE_DELIMITER_MASSAGE);
        }
    }

    public static void validateCount(int count) throws IllegalArgumentException {
        if (count <= 0) {
            throw new IllegalArgumentException(VALIDATE_COUNT_MASSAGE);
        }
    }

    public static void validateCarNum(String[] carNameArray) throws IllegalArgumentException {
        if (carNameArray.length <= 1) {
            throw new IllegalArgumentException(VALIDATE_CAR_NUMBER_MASSAGE);
        }
    }
}
