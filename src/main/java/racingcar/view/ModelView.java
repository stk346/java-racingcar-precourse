package racingcar.view;

import racingcar.model.Cars;

import java.util.List;

public class ModelView {
    public static String positionView(int position) {
        String convertedPosition = "";
        for (int i=0; i < position; i++) {
            convertedPosition += "-";
        }
        return convertedPosition;
    }
}
