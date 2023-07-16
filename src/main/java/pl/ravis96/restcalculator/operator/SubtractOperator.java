package pl.ravis96.restcalculator.operator;

public class SubtractOperator implements Operator {
    @Override
    public int result(int x, int y) {
        return x - y;
    }
}
