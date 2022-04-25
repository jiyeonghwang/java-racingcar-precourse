package racingcar.utils;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Round;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class CarGame {
    public void start() {
        Cars cars = new Cars();
        inputCarNameList(cars);
        Round round = new Round();
        inputRoundCount(round);
        OutputView.printResult();
        startRound(cars, round);
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

    public void startRound(Cars cars, Round round) {
        int count = 0;
        while (count < round.getCount()) {
            progressGame(cars);
            count++;
        }
    }

    public void progressGame(Cars cars) {
        for (Car car : cars.getCars()) {
            car.progress(pickNumberInRange(0, 9));
            OutputView.printCarPosition(car);
        }
        OutputView.printNewLine();
    }
}
