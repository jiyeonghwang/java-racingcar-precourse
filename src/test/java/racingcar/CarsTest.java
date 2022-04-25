package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {
    @Test
    void 자동차_이름_입력() {
        String carNameList = "car1,car2,car3";
        Cars cars = new Cars(carNameList);
        assertThat(cars.getCars().get(0).getName()).isEqualTo("car1");
        assertThat(cars.getCars().get(1).getName()).isEqualTo("car2");
        assertThat(cars.getCars().get(2).getName()).isEqualTo("car3");
        assertThat(cars.getCars().size()).isEqualTo(3);
    }
}
