package racingcar.view;

public class InputView {
    public static String INPUT_DELIMITER = ",";
    private static String INPUT_UI = "경주할 자동차 이름을 입력하세요(이름은 쉼표(" + INPUT_DELIMITER + ")를 기준으로 구분).";
    private static String COUNT_UI = "시도할 회수는 몇회인가요?";

    public static void inputUI() {
        System.out.println(INPUT_UI);
    }

    public static void inputCountView() {
        System.out.println(COUNT_UI);
    }
}
