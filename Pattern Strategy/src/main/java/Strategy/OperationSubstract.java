package Strategy;

public class OperationSubstract implements Strategy {

    @Override
    public int doOperating(int num1, int num2) {
        return num1 - num2;
    }
}
