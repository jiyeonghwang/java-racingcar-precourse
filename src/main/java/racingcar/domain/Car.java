package racingcar.domain;

public class Car {
    private static int STANDARD_NUM = 4;
    private String name;
    private int score;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void progress(int value) {
        if (value >= STANDARD_NUM) {
            this.score++;
        }
    }
}
