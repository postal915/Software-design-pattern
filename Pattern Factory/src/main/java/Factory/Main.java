package Factory;

interface Car {
    void drive();
}

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Car carToyota = factory.create("Toyota");
        carToyota.drive();
        Car carAudi = factory.create("Audi");
        carAudi.drive();
    }
}

class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }
}