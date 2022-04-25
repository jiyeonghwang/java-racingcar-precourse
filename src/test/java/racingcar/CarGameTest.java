package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;

import static org.assertj.core.api.Assertions.*;

public class CarGameTest {
    @Test
    void 게임_시작() {
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
}
