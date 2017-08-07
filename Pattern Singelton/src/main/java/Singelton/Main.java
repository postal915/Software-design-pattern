package Singelton;

public class Main {
    public static void main(String[] args) {
        SingletonVersionOne one = SingletonVersionOne.getInstance();
        SingletonVersionTwo two = SingletonVersionTwo.getInstance();
        SingletonVersionThree three = SingletonVersionThree.getInstance();
    }
}
