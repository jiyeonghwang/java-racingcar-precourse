package racingcar.utils;

import racingcar.domain.Cars;
import racingcar.view.InputView;

public class CarGame {
    public void start() {
        Cars cars = new Cars();
        inputCarNameList(cars);
    }

    public void inputCarNameList (Cars cars){
        try {
            cars.generateCars(InputView.printCarNameRequest());
        } catch (IllegalArgumentException e) {
            inputCarNameList(cars);
        }
    }
}
