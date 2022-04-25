package racingcar.domain;

import racingcar.view.OutputView;

public class Validation {
    public void isNotEmptyName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException();
        }
    }
}
