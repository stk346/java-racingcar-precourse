package racingcar.model;

public class Name {
    private String name;
    private static final String NAME_LENGTH_MESSAGE = "이름은 1자 이상, 5자 이하로 설정해주세요.";

    public Name(String name) throws IllegalArgumentException {
        this.name = name;
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException(NAME_LENGTH_MESSAGE);
        }
    }
}
