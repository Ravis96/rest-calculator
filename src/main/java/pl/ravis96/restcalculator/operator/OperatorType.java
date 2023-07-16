package pl.ravis96.restcalculator.operator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OperatorType {
    ADD("+", new AddOperator()),
    SUBTRACT("-", new SubtractOperator()),
    MULTIPLY("*", new MultiplyOperator()),
    DIVIDE("/", new DivideOperator());

    private final String operatorChar;
    private final Operator operator;

}
