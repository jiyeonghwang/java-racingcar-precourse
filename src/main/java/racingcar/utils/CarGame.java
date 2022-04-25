package racingcar.utils;

import racingcar.domain.Cars;
import racingcar.view.InputView;

public class CarGame {
    public Cars carList(String input) {
        Cars cars = inputCarNameList();
        return cars;
    }

    public Cars inputCarNameList (){
        Cars cars = new Cars(InputView.printCarNameRequest());
        return cars;
    }
}
