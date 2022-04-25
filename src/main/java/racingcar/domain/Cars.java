package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;

    public Cars(String carNames) {
        String[] carNameSplit = carNames.split(",");
        List<Car> tempCarList = addCars(carNameSplit);
        this.carList = tempCarList;
    }

    public List<Car> addCars(String[] carNameSplit) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNameSplit) {
            Car car = new Car(carName);
            cars.add(car);
        }
        return cars;
    }

    public List<Car> getCars() {
        return this.carList;
    }
}
