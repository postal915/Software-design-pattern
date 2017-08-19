package Strategy;

public class OperationMultiply implements Strategy {

    @Override
    public int doOperating(int num1, int num2) {
        return num1 * num2;
    }
}
