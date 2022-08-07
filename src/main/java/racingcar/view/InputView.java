package racingcar.view;

public class InputView {
     private static String CAR_NAME_MASSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
     private static String COUNT_MASSAGE = "시도할 회수는 몇회인가요?";

    public static void carNameView() {
        System.out.println(CAR_NAME_MASSAGE);
    }

    public static void countView() {
        System.out.println(COUNT_MASSAGE);
    }
}
