package pl.ravis96.restcalculator.service;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import pl.ravis96.restcalculator.operator.Operator;
import pl.ravis96.restcalculator.operator.OperatorType;
import pl.ravis96.restcalculator.record.CalculateRespond;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class CalculatorService {

    private final AtomicReference<String> input = new AtomicReference<>();
    private final AtomicInteger output = new AtomicInteger();

    public CalculateRespond calculate(@NonNull OperatorType operatorType, int value) {
        final Operator operator = operatorType.getOperator();

        this.input.set(this.input.get() == null
                ? String.valueOf(value)
                : this.input.get() + " " + operatorType.getOperatorChar() + " " + value);

        this.output.set(operator.result(this.output.get(), value));

        return new CalculateRespond(this.input.get(), this.output.get());
    }

}
