package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;
import racingcar.domain.Round;

import static org.assertj.core.api.Assertions.*;

class CarGameTest {
    @Test
    void 자동차_이름_입력() {
        Cars cars = new Cars();
        String errorNameList="car1,car1";
        String carsNameList = "car1,car2";
        try {
            cars.generateCars(errorNameList);
        } catch (IllegalArgumentException e) {
            cars.generateCars(carsNameList);
        }
        assertThat(cars.getCars().get(0).getName()).isEqualTo("car1");
        assertThat(cars.getCars().get(1).getName()).isEqualTo("car2");
    }

    @Test
    void 라운드_횟수_입력() {
        Round round = new Round();
        try {
            round.generateRound("에러");
        } catch (IllegalArgumentException e) {
            round.generateRound("5");
        }
        assertThat(round.getCount()).isEqualTo(5);
    }
}
