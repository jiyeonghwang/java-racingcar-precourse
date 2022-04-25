package racingcar.utils;

import racingcar.domain.Cars;
import racingcar.domain.Round;
import racingcar.view.InputView;

public class CarGame {
    public void start() {
        Cars cars = new Cars();
        inputCarNameList(cars);
        Round round = new Round();
        inputRoundCount(round);
    }

    public void inputCarNameList(Cars cars) {
        try {
            cars.generateCars(InputView.printCarNameRequest());
        } catch (IllegalArgumentException e) {
            inputCarNameList(cars);
        }
    }

    public void inputRoundCount(Round round) {
        try {
            round.generateRound(InputView.printCountRequest());
        } catch (IllegalArgumentException e) {
            inputRoundCount(round);
        }
    }
}
