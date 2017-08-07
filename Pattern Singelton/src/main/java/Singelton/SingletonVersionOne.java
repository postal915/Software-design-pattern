package Singelton;

public class SingletonVersionOne {

    private static SingletonVersionOne uniqueInstance = new SingletonVersionOne();

    private SingletonVersionOne() {
    }

    public static SingletonVersionOne getInstance() {
        return uniqueInstance;
    }
}
