package racinggame.racing;

import nextstep.utils.Console;
import racinggame.domain.Car;
import racinggame.domain.Winner;
import racinggame.ui.Input;
import racinggame.ui.Output;

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
        String carList = inputCar();
        String[] userList = carList.split(CAR_SPLIT);
        this.cars = new ArrayList<>();
        for (String carName : userList) {
            cars.add(getCar(carName));
        }
    }

    private String inputCar() {
        String carList = Console.readLine();
        return carList;
    }

    private Car getCar(String carName) {
        Car car = new Car(carName);
        if (car.valid()) {
            carSetting();
        }
        return car;
    }

    public void run() {
        for (Car car : cars) {
            car.running();
        }
    }

    public void finish() {
        for (Car car : cars) {
            car.finish();
        }
        Output.emptyLine();
    }

    public void winner() {
        Winner winner = new Winner(cars);
        winner.outPut();
    }

}
