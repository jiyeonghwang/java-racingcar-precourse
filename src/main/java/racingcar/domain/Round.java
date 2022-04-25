package racingcar.domain;

public class Round {
    private int count;

    public int getCount() {
        return this.count;
    }

    public void generateRound(String count) {
        this.count = Integer.parseInt(count);
    }
}
