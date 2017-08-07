package Singelton;

public class SingletonVersionThree {
    private volatile static SingletonVersionThree uniqueInstance;

    private SingletonVersionThree() {
    }

    public static SingletonVersionThree getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonVersionThree.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonVersionThree();
                }
            }
        }
        return uniqueInstance;
    }
}
