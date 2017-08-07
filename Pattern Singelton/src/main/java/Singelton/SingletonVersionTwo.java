package Singelton;

public class SingletonVersionTwo {

    private static SingletonVersionTwo uniqueInstance;

    private SingletonVersionTwo() {
    }

    public synchronized static SingletonVersionTwo getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonVersionTwo();
        }
        return new SingletonVersionTwo();
    }
}
