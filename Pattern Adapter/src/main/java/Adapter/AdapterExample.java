package Adapter;

public class AdapterExample {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Audi());
        carWash.washCar(new TrackWrap(new MyTrack()));

    }
}

interface Car {
    void wash();
}

class Audi implements Car {

    @Override
    public void wash() {
        System.out.println("wash car");
    }
}

class CarWash {
    public void washCar(Car car){
        car.wash();
    }
}

interface Track {
    void clean();
}

class MyTrack implements Track {

    @Override
    public void clean() {
        System.out.println("Track is clean");
    }
}

class TrackWrap implements Car {

    Track track;

    public TrackWrap(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}