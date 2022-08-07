package racingcar.view;

import racingcar.model.Cars;

import java.util.List;

public class ModelView {
    public static void resultView() {
        System.out.println("실행결과");
    }
    public static String positionView(int position) {
        String convertedPosition = "";
        for (int i=0; i < position; i++) {
            convertedPosition += "-";
        }
        return convertedPosition;
    }
}
