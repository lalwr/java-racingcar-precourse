package racinggame.domain;

import nextstep.utils.Console;
import racinggame.ui.Input;

import java.util.ArrayList;
import java.util.List;

public class RacingCar {
    private static final String CAR_SPLIT = ",";

    List<Car> cars;

    public RacingCar() {
        carSetting();
    }

    public void carSetting() {
        Input.carName();
        String carList = Console.readLine();
        String[] userList = carList.split(CAR_SPLIT);
        this.cars = new ArrayList<>();
        for (String carName : userList) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
