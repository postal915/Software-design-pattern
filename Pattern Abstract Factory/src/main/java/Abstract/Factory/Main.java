package Abstract.Factory;

public class Main {

    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");

        Car bentley = carFactory.createCar("Bentley");
        Car jaguar = carFactory.createCar("Jaguar");

        bentley.drive();
        jaguar.drive();

        Tank abrams = tankFactory.createTank("Abrams");
        Tank vijayanta = tankFactory.createTank("Vijayanta");

        abrams.drive();
        vijayanta.drive();
    }
}

interface Car {
    void drive();
}


interface Tank {
    void drive();
}

interface Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

class Bentley implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Bentley");
    }
}

class Jaguar implements Car {
    @Override
    public void drive() {
        System.out.println("drive Jaguar");
    }
}

class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Bentley":
                return new Bentley();
            case "Jaguar":
                return new Jaguar();
            default:
                return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

class Abrams implements Tank {

    @Override
    public void drive() {
        System.out.println("drive Abrams");
    }
}

class Vijayanta implements Tank {

    @Override
    public void drive() {
        System.out.println("drive Vijayanta");
    }
}

class TankFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    public Tank createTank(String typeOTank) {
        switch (typeOTank) {
            case "Abrams":
                return new Abrams();
            case "Vijayanta":
                return new Vijayanta();
            default:
                return null;
        }
    }
}

class AbstractFactory {

    Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Tank":
                return new TankFactory();
            case "Car":
                return new CarFactory();
            default:
                return null;
        }
    }
}










