package Bridge;

public class BridgeExample {
    public static void main(String[] args) {
        ICar car = new ToyotaCar(new CarBridge());
        car.drive();

        ITrack track = new AudiTrack(new TrackBridge());
        track.drive();

    }
}

interface IBridge {
    void drive();
}

abstract class ICar {
    IBridge iBridge;

    public ICar(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    public abstract void drive();
}

abstract class ITrack {
    IBridge iBridge;

    public ITrack(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    public abstract void drive();
}

class CarBridge implements IBridge {

    @Override
    public void drive() {
        System.out.println("drive car");
    }
}

class TrackBridge implements IBridge {

    @Override
    public void drive() {
        System.out.println("drive track");
    }
}

class ToyotaCar extends ICar {

    public ToyotaCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive toyota");
    }
}

class AudiCar extends ICar {

    public AudiCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive audi");
    }
}

class ToyotaTrack extends ITrack {

    public ToyotaTrack(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive toyota track");
    }
}

class AudiTrack extends ITrack {

    public AudiTrack(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive audi track");
    }
}















