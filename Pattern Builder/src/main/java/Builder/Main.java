package Builder;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Bulder("Audi").setColor("green").setMaxSpeed(200).buld();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());

    }
}

class SportCar {

    private String name;
    private String color;
    private int maxSpeed;

    private SportCar(Bulder bulder) {
        this.name = bulder.name;
        this.color = bulder.color;
        this.maxSpeed = bulder.maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    static class Bulder {

        private String name;
        private String color;
        private int maxSpeed;

        public Bulder(String name) {
            this.name = name;
        }

        public Bulder setColor(String color) {
            this.color = color;
            return this;
        }

        public Bulder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar buld() {
            return new SportCar(this);
        }
    }

}