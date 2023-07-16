package pl.ravis96.restcalculator.operator;

public class MultiplyOperator implements Operator {
    @Override
    public int result(int x, int y) {
        return x * y;
    }
}
