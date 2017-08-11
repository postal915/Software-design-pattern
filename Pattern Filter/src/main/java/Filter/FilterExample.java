package Filter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        Car carOne = new Car(150, "green", 4);
        Car carTwo = new Car(200, "red", 2);
        Car carThree = new Car(250, "bleck", 4);
        List<Car> cars = new LinkedList<>();
        cars.add(carOne);
        cars.add(carTwo);
        cars.add(carThree);

//        cars = new SpeedFilter().filter(cars);
//        cars = new DorsFilter().filter(cars);

//        AndFilter filter = new AndFilter(new SpeedFilter(), new DorsFilter());

        OrFilter filter = new OrFilter(new SpeedFilter(), new DorsFilter());
        cars = filter.filter(cars);

        for (Car car: cars) {
            System.out.println(car.getMaxSpeed());
        }
    }
}

interface CarFilter {
    List<Car> filter(List<Car> cars);
}

class SpeedFilter implements CarFilter {

    @Override
    public List<Car> filter(List<Car> cars) {
        List<Car> list = new ArrayList<>();
        for (Car car: cars) {
            if (car.getMaxSpeed() > 180){
                list.add(car);

            }
        }
        return list;
    }
}

class DorsFilter implements CarFilter {

    @Override
    public List<Car> filter(List<Car> cars) {
        List<Car> list = new ArrayList<>();
        for (Car car: cars) {
            if (car.getDors() > 2){
                list.add(car);
            }
        }
        return list;
    }
}

class AndFilter implements CarFilter {

    CarFilter filterOne;
    CarFilter filterTwo;

    public AndFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    @Override
    public List<Car> filter(List<Car> cars) {
        List<Car> list = filterOne.filter(cars);
        return filterTwo.filter(list);
    }
}

class OrFilter implements CarFilter {

    CarFilter filterOne;
    CarFilter filterTwo;

    public OrFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    @Override
    public List<Car> filter(List<Car> cars) {
        List<Car> list = filterOne.filter(cars);
        List<Car> list2 = filterTwo.filter(list);
        for (Car car: list2){
            if (!list.contains(car)){
                list.add(car);
            }
        }
        return list;
    }
}

class Car {

    private int maxSpeed;
    private String color;
    private int dors;

    public Car(int maxSpeed, String color, int dors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.dors = dors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDors() {
        return dors;
    }

    public void setDors(int dors) {
        this.dors = dors;
    }
}