package StringCalculator.view;

public class ControllerMassage {
    private static final String INPUT_GUIDE_MASSAGE = "계산을 수행해주세요.";
    private static final String INPUT_GUIDE_MASSAGE_EXAMPLE = "예: '1,2,3' or //|"+"\\n"+"1|2|3'\n";

    public static void getStartMassage() {
        System.out.println(INPUT_GUIDE_MASSAGE);
        System.out.print((INPUT_GUIDE_MASSAGE_EXAMPLE));
    }
}
