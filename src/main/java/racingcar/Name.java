package racingcar;

public class Name {
    private String name;

    public Name(String name) {
        if (name.length() > 5) {
            System.out.println("이름은 5자를 초과할 수 없습니다.");
        }
    }
}